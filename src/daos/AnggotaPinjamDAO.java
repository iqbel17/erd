/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.AnggotaPinjam;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gusma
 */
public class AnggotaPinjamDAO implements AnggotaPinjamInterfaceDAO {

    private Connection connection;

    public AnggotaPinjamDAO(Connection connection) {
        this.connection = connection;
    }

    public AnggotaPinjamDAO() {
    }
    
    /**
     * Function Insert
     * @param anggotaPinjam AnggotaPinjam
     * @return flag 
     */
    @Override
    public boolean insert(AnggotaPinjam anggotaPinjam) {
        boolean flag = false;
        String query = "INSERT INTO ANGGOTA_PINJAM VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, anggotaPinjam.getKdAnggotaP());
            preparedStatement.setString(2, anggotaPinjam.getKdAnggota());
            preparedStatement.setString(3, anggotaPinjam.getKdKaryawan());
            preparedStatement.setString(4, anggotaPinjam.getNamaJaminan());
            preparedStatement.setDate(5, anggotaPinjam.getTglPinjam());
            preparedStatement.setInt(6, anggotaPinjam.getNominalPinjam());
            preparedStatement.setInt(7, anggotaPinjam.getJangkaWaktu());

            preparedStatement.executeUpdate();
            flag = true;
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaPinjamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }

    @Override
    public boolean update(AnggotaPinjam anggotaPinjam) {
        String query = "UPDATE Anggota_Pinjam SET kd_anggota=?,kd_karyawan=?,nama_jaminan=?,tgl_pinjam=?,nominal_pinjam=?,jangka_waktu=? "
                + "WHERE kd_anggotapinjam=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, anggotaPinjam.getKdAnggota());
            preparedStatement.setString(2, anggotaPinjam.getKdKaryawan());
            preparedStatement.setString(3, anggotaPinjam.getNamaJaminan());
            preparedStatement.setDate(4, anggotaPinjam.getTglPinjam());
            preparedStatement.setInt(5, anggotaPinjam.getNominalPinjam());
            preparedStatement.setInt(6, anggotaPinjam.getJangkaWaktu());
            preparedStatement.setString(7, anggotaPinjam.getKdAnggotaP());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaPinjamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        try {
            String query = "DELETE FROM Anggota_Pinjam WHERE kd_anggotapinjam=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaPinjamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<AnggotaPinjam> getAll() {
        List<AnggotaPinjam> datas = new ArrayList<>();
        String query = "SELECT * FROM Anggota_Pinjam";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                AnggotaPinjam anggotapinjam = new AnggotaPinjam();
                anggotapinjam.setKdAnggotaP(rs.getString("kd_anggotapinjam"));
                anggotapinjam.setKdAnggota(rs.getString("kd_anggota"));
                anggotapinjam.setKdKaryawan(rs.getString("kd_karyawan"));
                anggotapinjam.setNamaJaminan(rs.getString("nama_pinjaman"));
                anggotapinjam.setTglPinjam(rs.getDate("tgl_pinjam"));
                anggotapinjam.setNominalPinjam(rs.getInt("nominal_pinjam"));
                anggotapinjam.setJangkaWaktu(rs.getInt("jangka_waktu"));
                datas.add(anggotapinjam);
            }

        } catch (SQLException ex) {
            Logger.getLogger(KaryawanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    }

    @Override
    public List<AnggotaPinjam> getAllCs(String category, String sort) {
        List<AnggotaPinjam> datas = new ArrayList<>();
        String query = "SELECT * FROM anggotapinjam WHERE " + category + " LIKE '%" + sort + "%'";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                AnggotaPinjam anggotapinjam = new AnggotaPinjam();
                anggotapinjam.setKdAnggotaP(rs.getString("kd_anggotapinjam"));
                anggotapinjam.setKdAnggota(rs.getString("kd_anggota"));
                anggotapinjam.setKdKaryawan(rs.getString("kd_karyawan"));
                anggotapinjam.setNamaJaminan(rs.getString("nama_pinjaman"));
                anggotapinjam.setTglPinjam(rs.getDate("tgl_pinjam"));
                anggotapinjam.setNominalPinjam(rs.getInt("nominal_pinjam"));
                anggotapinjam.setJangkaWaktu(rs.getInt("jangka_waktu"));
                datas.add(anggotapinjam);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaPinjamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    }

    @Override
    public List<AnggotaPinjam> search(String category, String data) {
        List<AnggotaPinjam> datas = new ArrayList<>();
        String query = "SELECT * FROM anggotapinjam WHERE " + category + " LIKE '%" + data + "%'";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                AnggotaPinjam anggotapinjam = new AnggotaPinjam();
                anggotapinjam.setKdAnggotaP(rs.getString("kd_anggotapinjam"));
                anggotapinjam.setKdAnggota(rs.getString("kd_anggota"));
                anggotapinjam.setKdKaryawan(rs.getString("kd_karyawan"));
                anggotapinjam.setNamaJaminan(rs.getString("nama_pinjaman"));
                anggotapinjam.setTglPinjam(rs.getDate("tgl_pinjam"));
                anggotapinjam.setNominalPinjam(rs.getInt("nominal_pinjam"));
                anggotapinjam.setJangkaWaktu(rs.getInt("jangka_waktu"));
                datas.add(anggotapinjam);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaPinjamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    }

    @Override
    public AnggotaPinjam getById(int id) {
        AnggotaPinjam anggotapinjam = new AnggotaPinjam();
        String query = "SELECT * FROM anggota_pinjam WHERE kd_anggotapinjam=" + id;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                anggotapinjam.setKdAnggotaP(rs.getString("kd_anggotapinjam"));
                anggotapinjam.setKdAnggota(rs.getString("kd_anggota"));
                anggotapinjam.setKdKaryawan(rs.getString("kd_karyawan"));
                anggotapinjam.setNamaJaminan(rs.getString("nama_pinjaman"));
                anggotapinjam.setTglPinjam(rs.getDate("tgl_pinjam"));
                anggotapinjam.setNominalPinjam(rs.getInt("nominal_pinjam"));
                anggotapinjam.setJangkaWaktu(rs.getInt("jangka_waktu"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaPinjamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return anggotapinjam;
    }

}
