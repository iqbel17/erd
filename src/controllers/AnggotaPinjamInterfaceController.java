/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.AnggotaPinjam;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Gusma
 */
public interface AnggotaPinjamInterfaceController {
    public boolean save(String kdAnggotapinjam, String kdAnggota, String kdKaryawan, String namaJaminan ,Date tglPinjam, int nominalPinjam, int jangkaWaktu);

    public boolean edit(String kdAnggotapinjam, String kdAnggota, String kdKaryawan, String namaJaminan ,Date tglPinjam, int nominalPinjam, int jangkaWaktu);

    public boolean drop(String id);

    public List<AnggotaPinjam> binding();

    public List<AnggotaPinjam> bindingsort(String kategori, String sort);

    public List<AnggotaPinjam> find(String kategori, String data);

    public AnggotaPinjam findBy(String id);
}
