/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.AngsuranPinjam;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Gusma
 */
public interface AngsuranPinjamInterfaceController {
    public boolean save(String kdAngsuran, String kdAnggotaPinjam, Date tanggalAngsur,int jumlahAngsuran, String status);

    public boolean edit(String kdAngsuran, String kdAnggotaPinjam, Date tanggalAngsur,int jumlahAngsuran, String status);

    public boolean drop(String id);

    public List<AngsuranPinjam> binding();

    public List<AngsuranPinjam> bindingsort(String kategori, String sort);

    public List<AngsuranPinjam> find(String kategori, String data);

    public AngsuranPinjam findBy(String id);
}
