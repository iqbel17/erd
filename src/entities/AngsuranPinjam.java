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
public class AngsuranPinjam {
    private String kdAngsuran;
    private String kdAnggotaPinjam;
    private Date tanggalAngsur;
    private int jumlahAngsuran;
    private String status;

    public AngsuranPinjam() {
    }

    public AngsuranPinjam(String kdAngsuran, String kdAnggotaPinjam, Date tanggalAngsur, int jumlahAngsuran, String status) {
        this.kdAngsuran = kdAngsuran;
        this.kdAnggotaPinjam = kdAnggotaPinjam;
        this.tanggalAngsur = tanggalAngsur;
        this.jumlahAngsuran = jumlahAngsuran;
        this.status = status;
    }

    /**
     * @return the kdAngsuran
     */
    public String getKdAngsuran() {
        return kdAngsuran;
    }

    /**
     * @param kdAngsuran the kdAngsuran to set
     */
    public void setKdAngsuran(String kdAngsuran) {
        this.kdAngsuran = kdAngsuran;
    }

    /**
     * @return the kdAnggotaPinjam
     */
    public String getKdAnggotaPinjam() {
        return kdAnggotaPinjam;
    }

    /**
     * @param kdAnggotaPinjam the kdAnggotaPinjam to set
     */
    public void setKdAnggotaPinjam(String kdAnggotaPinjam) {
        this.kdAnggotaPinjam = kdAnggotaPinjam;
    }

    /**
     * @return the tanggalAngsur
     */
    public Date getTanggalAngsur() {
        return tanggalAngsur;
    }

    /**
     * @param tanggalAngsur the tanggalAngsur to set
     */
    public void setTanggalAngsur(Date tanggalAngsur) {
        this.tanggalAngsur = tanggalAngsur;
    }

    /**
     * @return the jumlahAngsuran
     */
    public int getJumlahAngsuran() {
        return jumlahAngsuran;
    }

    /**
     * @param jumlahAngsuran the jumlahAngsuran to set
     */
    public void setJumlahAngsuran(int jumlahAngsuran) {
        this.jumlahAngsuran = jumlahAngsuran;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
}
