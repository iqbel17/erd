/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.sql.Date;

/**
 *
 * @author iqbael17
 */
public class Pemasukankoperasi {
    private String kdMasukkoperasi;
    private String kdSimpanan;
    private Date tglSimpankoperasi;
    private int nominalsimpan;

    public Pemasukankoperasi(String kdMasukkoperasi, String kdSimpanan, Date tglSimpankoperasi, int nominalsimpan) {
        this.kdMasukkoperasi = kdMasukkoperasi;
        this.kdSimpanan = kdSimpanan;
        this.tglSimpankoperasi = tglSimpankoperasi;
        this.nominalsimpan = nominalsimpan;
    }

    public Pemasukankoperasi() {
    }

    /**
     * @return the kdMasukkoperasi
     */
    public String getKdMasukkoperasi() {
        return kdMasukkoperasi;
    }

    /**
     * @param kdMasukkoperasi the kdMasukkoperasi to set
     */
    public void setKdMasukkoperasi(String kdMasukkoperasi) {
        this.kdMasukkoperasi = kdMasukkoperasi;
    }

    /**
     * @return the kdSimpanan
     */
    public String getKdSimpanan() {
        return kdSimpanan;
    }

    /**
     * @param kdSimpanan the kdSimpanan to set
     */
    public void setKdSimpanan(String kdSimpanan) {
        this.kdSimpanan = kdSimpanan;
    }

    /**
     * @return the nominalsimpan
     */
    public int getNominalsimpan() {
        return nominalsimpan;
    }

    /**
     * @param nominalsimpan the nominalsimpan to set
     */
    public void setNominalsimpan(int nominalsimpan) {
        this.nominalsimpan = nominalsimpan;
    }

    public Date getTglSimpankoperasi() {
        return tglSimpankoperasi;
    }

    public void setTglSimpankoperasi(Date tglSimpankoperasi) {
        this.tglSimpankoperasi = tglSimpankoperasi;
    }
    
}
