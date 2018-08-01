/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.AngsuranPinjam;
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
public class AngsuranPinjamDAO implements AngsuranPinjamInterfaceDAO {

    private Connection connection;

    public AngsuranPinjamDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean insert(entities.AngsuranPinjam angsuranPinjam) {
        boolean flag = false;
        String query = "INSERT INTO ANGSURANPINJAM VALUES (?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, angsuranPinjam.getKdAngsuran());
            preparedStatement.setString(2, angsuranPinjam.getKdAnggotaP());
            preparedStatement.setDate(3, angsuranPinjam.getTglAngsur());
            preparedStatement.setInt(4, angsuranPinjam.getJumlahAngsuran());
            preparedStatement.setString(5, angsuranPinjam.getStatus());

            preparedStatement.executeUpdate();
            flag = true;
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaPinjamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }

    @Override
    public boolean update(entities.AngsuranPinjam angsuranPinjam) {
        String query = "UPDATE ANGSURANPINJAM SET kd_anggotapinjam=?,tanggal_angsur=?,jumlah_angsuran=?,status=?"
                + "WHERE kd_angsuran=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(5, angsuranPinjam.getKdAngsuran());
            preparedStatement.setString(1, angsuranPinjam.getKdAnggotaP());
            preparedStatement.setDate(2, angsuranPinjam.getTglAngsur());
            preparedStatement.setInt(3, angsuranPinjam.getJumlahAngsuran());
            preparedStatement.setString(4, angsuranPinjam.getStatus());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AngsuranPinjamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean delete(String id) {
        try {
            String query = "DELETE FROM ANGSURANPINJAM WHERE kd_angsuran=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AngsuranPinjamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<entities.AngsuranPinjam> getAll() {
        List<AngsuranPinjam> datas = new ArrayList<>();
        String query = "SELECT * FROM Angsuranpinjam";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                AngsuranPinjam angsuranPinjam = new AngsuranPinjam();
                angsuranPinjam.setKdAngsuran(rs.getString("kd_angsuran"));
                angsuranPinjam.setKdAnggotaP(rs.getString("kd_anggota"));
                angsuranPinjam.setTglAngsur(rs.getDate("kd_karyawan"));
                angsuranPinjam.setJumlahAngsuran(rs.getInt("nama_pinjaman"));
                angsuranPinjam.setStatus(rs.getString("tgl_pinjam"));
                datas.add(angsuranPinjam);
            }

        } catch (SQLException ex) {
            Logger.getLogger(KaryawanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    }

    @Override
    public List<entities.AngsuranPinjam> getAllCs(String category, String sort) {
        List<AngsuranPinjam> datas = new ArrayList<>();
        String query = "SELECT * FROM angsuranpinjam WHERE " + category + " LIKE '%" + sort + "%'";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                AngsuranPinjam angsuranPinjam = new AngsuranPinjam();
                angsuranPinjam.setKdAngsuran(rs.getString("kd_angsuran"));
                angsuranPinjam.setKdAnggotaP(rs.getString("kd_anggota"));
                angsuranPinjam.setTglAngsur(rs.getDate("kd_karyawan"));
                angsuranPinjam.setJumlahAngsuran(rs.getInt("nama_pinjaman"));
                angsuranPinjam.setStatus(rs.getString("tgl_pinjam"));
                datas.add(angsuranPinjam);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaPinjamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    }

    @Override
    public List<entities.AngsuranPinjam> search(String category, String data) {
        List<AngsuranPinjam> datas = new ArrayList<>();
        String query = "SELECT * FROM angsuranpinjam WHERE " + category + " LIKE '%" + data + "%'";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                AngsuranPinjam angsuranPinjam = new AngsuranPinjam();
                angsuranPinjam.setKdAngsuran(rs.getString("kd_angsuran"));
                angsuranPinjam.setKdAnggotaP(rs.getString("kd_anggota"));
                angsuranPinjam.setTglAngsur(rs.getDate("kd_karyawan"));
                angsuranPinjam.setJumlahAngsuran(rs.getInt("nama_pinjaman"));
                angsuranPinjam.setStatus(rs.getString("tgl_pinjam"));
                datas.add(angsuranPinjam);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaPinjamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    }

    @Override
    public entities.AngsuranPinjam getById(String id) {
         AngsuranPinjam angsuranPinjam = new AngsuranPinjam();
        String query = "SELECT * FROM angsuranpinjam WHERE kd_angsuran=" + id;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                angsuranPinjam.setKdAngsuran(rs.getString("kd_angsuran"));
                angsuranPinjam.setKdAnggotaP(rs.getString("kd_anggota"));
                angsuranPinjam.setTglAngsur(rs.getDate("kd_karyawan"));
                angsuranPinjam.setJumlahAngsuran(rs.getInt("nama_pinjaman"));
                angsuranPinjam.setStatus(rs.getString("tgl_pinjam"));   
            }
        }catch (SQLException ex) {
            Logger.getLogger(AnggotaPinjamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return angsuranPinjam;
    }

}
