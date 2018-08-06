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
    public AnggotaPinjamController(Connection c){
        this.anggotaPinjamDAO = new AnggotaPinjamDAO((c));
    }
    
    
    @Override
    public boolean save(String kdAnggotapinjam, String kdAnggota, String kdKaryawan, String namaJaminan, Date tglPinjam, int nominalPinjam, int jangkaWaktu) {
       AnggotaPinjam anggotaPinjam = new AnggotaPinjam(kdAnggotapinjam, kdAnggota, kdKaryawan, namaJaminan,tglPinjam,nominalPinjam,jangkaWaktu);
        return this.anggotaPinjamDAO.insert(anggotaPinjam);
    }

    @Override
    public boolean edit(String kdAnggotapinjam, String kdAnggota, String kdKaryawan, String namaJaminan, Date tglPinjam, int nominalPinjam, int jangkaWaktu) {
       AnggotaPinjam anggotaPinjam = new AnggotaPinjam(kdAnggotapinjam, kdAnggota, kdKaryawan, namaJaminan,tglPinjam,nominalPinjam,jangkaWaktu);
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

    @Override
    public List<AnggotaPinjam> bindingsort(String kategori, String sort) {
        return this.anggotaPinjamDAO.getSemuaSort(kategori, sort);
    }

    @Override
    public List<AnggotaPinjam> find(String kategori, String data) {
        return this.anggotaPinjamDAO.search(kategori, data);
    }

    @Override
    public AnggotaPinjam findBy(String id) {
        return this.anggotaPinjamDAO.getAIDI(id);
    }
    
    
}
