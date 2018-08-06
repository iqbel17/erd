/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.AnggotaPinjamDAO;
import entities.AnggotaPinjam;
import java.sql.Connection;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Gusma
 */
public class AnggotaPinjamController implements AnggotaPinjamInterfaceController{
    
    private AnggotaPinjamDAO anggotaPinjamDAO;

    public AnggotaPinjamController() {
    }

    public AnggotaPinjamController(Connection connection) {
        this.anggotaPinjamDAO = new AnggotaPinjamDAO(connection);
    }
    
    /**
     * 
     * @param kdAnggotaP
     * @param kdAnggota
     * @param kdKaryawan
     * @param namaJaminan
     * @param tglPinjam
     * @param nominalPinjam
     * @param jangkaWaktu
     * @return 
     */
    @Override
    public boolean save( String kdAnggota, String kdKaryawan, String namaJaminan, int nominalPinjam, int jangkaWaktu) {
        AnggotaPinjam anggotaPinjam = new AnggotaPinjam( kdAnggota, kdKaryawan, namaJaminan, nominalPinjam, jangkaWaktu);
        return this.anggotaPinjamDAO.insert(anggotaPinjam);
    }

    @Override
    public boolean edit(String kdAnggotaP, String kdAnggota, String kdKaryawan, String namaJaminan) {
        AnggotaPinjam anggotaPinjam = new AnggotaPinjam(kdAnggotaP, kdAnggota, kdKaryawan, namaJaminan);
       return this.anggotaPinjamDAO.update(anggotaPinjam);
    }

    @Override
    public boolean drop(String id) {
        return this.anggotaPinjamDAO.delete(id);
    }

    @Override
    public List<AnggotaPinjam> binding() {
        return this.anggotaPinjamDAO.getSemua();
    }
    /**
     * Function binding by sort
     * @param category String
     * @param sort String
     * @return getSemuaSort
     */

    @Override
    public List<AnggotaPinjam> bindingsort(String category, String sort) {
        return this.anggotaPinjamDAO.getSemuaSort(category, sort);
    }
    /**
     * Function find by category 
     * @param category String
     * @param data String
     * @return search get category and data
     */
    @Override
    public List<AnggotaPinjam> find(String category, String data) {
        return this .anggotaPinjamDAO.search(category, data);
    }
    /**
     * Function find by ID
     * @param id String
     * @return getAIDI
     */
    @Override
    public AnggotaPinjam findById(String id) {
        return this.anggotaPinjamDAO.getAIDI(id);
    }

    
    
}
