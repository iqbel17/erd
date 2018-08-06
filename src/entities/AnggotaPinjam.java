/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.sql.Date;

/**
 *
 * @author Gusma
 */
public class AnggotaPinjam {
    private String kdAnggotapinjam;
    private String kdAnggota;
    private String kdKaryawan;
    private String namaJaminan;
    private Date tglPinjam;
    private int nominalPinjam;
    private int jangkaWaktu;

    public AnggotaPinjam() {
    }

    public AnggotaPinjam(String kdAnggotapinjam, String kdAnggota, String kdKaryawan, String namaJaminan, Date tglPinjam, int nominalPinjam, int jangkaWaktu) {
        this.kdAnggotapinjam = kdAnggotapinjam;
        this.kdAnggota = kdAnggota;
        this.kdKaryawan = kdKaryawan;
        this.namaJaminan = namaJaminan;
        this.tglPinjam = tglPinjam;
        this.nominalPinjam = nominalPinjam;
        this.jangkaWaktu = jangkaWaktu;
    }

    /**
     * @return the kdAnggotapinjam
     */
    public String getKdAnggotapinjam() {
        return kdAnggotapinjam;
    }

    /**
     * @param kdAnggotapinjam the kdAnggotapinjam to set
     */
    public void setKdAnggotapinjam(String kdAnggotapinjam) {
        this.kdAnggotapinjam = kdAnggotapinjam;
    }

    /**
     * @return the kdAnggota
     */
    public String getKdAnggota() {
        return kdAnggota;
    }

    /**
     * @param kdAnggota the kdAnggota to set
     */
    public void setKdAnggota(String kdAnggota) {
        this.kdAnggota = kdAnggota;
    }

    /**
     * @return the kdKaryawan
     */
    public String getKdKaryawan() {
        return kdKaryawan;
    }

    /**
     * @param kdKaryawan the kdKaryawan to set
     */
    public void setKdKaryawan(String kdKaryawan) {
        this.kdKaryawan = kdKaryawan;
    }

    /**
     * @return the namaJaminan
     */
    public String getNamaJaminan() {
        return namaJaminan;
    }

    /**
     * @param namaJaminan the namaJaminan to set
     */
    public void setNamaJaminan(String namaJaminan) {
        this.namaJaminan = namaJaminan;
    }

    /**
     * @return the tglPinjam
     */
    public Date getTglPinjam() {
        return tglPinjam;
    }

    /**
     * @param tglPinjam the tglPinjam to set
     */
    public void setTglPinjam(Date tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    /**
     * @return the nominalPinjam
     */
    public int getNominalPinjam() {
        return nominalPinjam;
    }

    /**
     * @param nominalPinjam the nominalPinjam to set
     */
    public void setNominalPinjam(int nominalPinjam) {
        this.nominalPinjam = nominalPinjam;
    }

    /**
     * @return the jangkaWaktu
     */
    public int getJangkaWaktu() {
        return jangkaWaktu;
    }

    /**
     * @param jangkaWaktu the jangkaWaktu to set
     */
    public void setJangkaWaktu(int jangkaWaktu) {
        this.jangkaWaktu = jangkaWaktu;
    }
    
    
}
