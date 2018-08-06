/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.AngsuranPinjamDAO;
import entities.AngsuranPinjam;
import java.sql.Connection;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Gusma
 */
public class AngsuranPinjamController implements AngsuranPinjamInterfaceController{
    
    private AngsuranPinjamDAO angsuranPinjamDAO;

    public AngsuranPinjamController() {
    }

    public AngsuranPinjamController(Connection c) {
        this.angsuranPinjamDAO = new AngsuranPinjamDAO(c);
    }

    @Override
    public boolean save(String kdAngsuran, String kdAnggotaPinjam, Date tanggalAngsur, int jumlahAngsuran, String status) {
         AngsuranPinjam angsuranPinjam = new AngsuranPinjam(kdAngsuran, kdAnggotaPinjam, tanggalAngsur, jumlahAngsuran,status);
        return this.angsuranPinjamDAO.insert(angsuranPinjam);
    }

    @Override
    public boolean edit(String kdAngsuran, String kdAnggotaPinjam, Date tanggalAngsur, int jumlahAngsuran, String status) {
        AngsuranPinjam angsuranPinjam = new AngsuranPinjam(kdAngsuran, kdAnggotaPinjam, tanggalAngsur, jumlahAngsuran,status);
        return this.angsuranPinjamDAO.update(angsuranPinjam);
    }

    @Override
    public boolean drop(String id) {
        return this.angsuranPinjamDAO.delete(id);
    }

    @Override
    public List<AngsuranPinjam> binding() {
        return this.angsuranPinjamDAO.getSemua();
    }

    @Override
    public List<AngsuranPinjam> bindingsort(String kategori, String sort) {
        return this.angsuranPinjamDAO.getSemuaSort(kategori, sort);
    }

    @Override
    public List<AngsuranPinjam> find(String kategori, String data) {
        return this.angsuranPinjamDAO.search(kategori, data);
    }

    @Override
    public AngsuranPinjam findBy(String id) {
        return this.angsuranPinjamDAO.getAIDI(id);
    }
    
    
}
