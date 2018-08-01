/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Gusma
 */
public class Karyawan {
    
    private String kdKaryawan;
    private String namaaKaryawan;
    private String alamat;
    private String telepon;
    private String password;

    public Karyawan() {
    }

    public Karyawan(String kdKaryawan, String namaaKaryawan, String alamat, String telepon, String password) {
        this.kdKaryawan = kdKaryawan;
        this.namaaKaryawan = namaaKaryawan;
        this.alamat = alamat;
        this.telepon = telepon;
        this.password = password;
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
     * @return the namaKaryawan
     */
    public String getNamaaKaryawan() {
        return namaaKaryawan;
    }

    /**
     * @param namaaKaryawan the namaKaryawan to set
     */
    public void setNamaKaryawan(String namaaKaryawan) {
        this.namaaKaryawan = namaaKaryawan;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the telepon
     */
    public String getTelepon() {
        return telepon;
    }

    /**
     * @param telepon the telepon to set
     */
    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
