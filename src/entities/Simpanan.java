/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author iqbael17
 */
public class Simpanan {
 private String kdSimpanan;
 private int totalSimpan;

    public Simpanan() {
    }

    public Simpanan(String kdSimpanan, int totalSimpan) {
        this.kdSimpanan = kdSimpanan;
        this.totalSimpan = totalSimpan;
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
     * @return the totalSimpan
     */
    public int getTotalSimpan() {
        return totalSimpan;
    }

    /**
     * @param totalSimpan the totalSimpan to set
     */
    public void setTotalSimpan(int totalSimpan) {
        this.totalSimpan = totalSimpan;
    }
 
 
 
 }
