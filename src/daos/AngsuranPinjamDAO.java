/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

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

    private Connection c;

    public AngsuranPinjamDAO(Connection c) {
        this.c = c;
    }

    @Override
    public boolean insert(AngsuranPinjam angsuranPinjam) {
        boolean flag = false;
        String query = "INSERT INTO ANGSURANPINJAM VALUES(?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = c.prepareStatement(query);
            preparedStatement.setString(1, angsuranPinjam.getKdAngsuran());
            preparedStatement.setString(2, angsuranPinjam.getKdAnggotaPinjam());
            preparedStatement.setDate(3, angsuranPinjam.getTanggalAngsur());
            preparedStatement.setInt(4, angsuranPinjam.getJumlahAngsuran());
            preparedStatement.setString(5, angsuranPinjam.getStatus());
            preparedStatement.executeUpdate();
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean update(AngsuranPinjam angsuranPinjam) {
        String query = "UPDATE ANGSURANPINJAM SET kd_anggotapinjam=?, tanggal_angsur=?, jumlah_angsuran=?, status=? WHERE kd_angsuran=?";
        try {
            PreparedStatement preparedStatement = c.prepareStatement(query);
            preparedStatement.setString(1, angsuranPinjam.getKdAnggotaPinjam());
            preparedStatement.setDate(2, angsuranPinjam.getTanggalAngsur());
            preparedStatement.setInt(3, angsuranPinjam.getJumlahAngsuran());
            preparedStatement.setString(4, angsuranPinjam.getStatus());
            preparedStatement.setString(5, angsuranPinjam.getKdAngsuran());
            preparedStatement.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(String id) {
        try {
            String query = "DELETE FROM ANGSURANPINJAM WHERE kd_angsuran=?";
            PreparedStatement preparedStatement = c.prepareStatement(query);
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public List<AngsuranPinjam> getSemua() {
        List<AngsuranPinjam> dataa = new ArrayList<>();
        String query = "SELECT * FROM ANGSURANPINJAM";
        try {
            PreparedStatement preparedStatement = c.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                AngsuranPinjam angsuranPinjam = new AngsuranPinjam();
                angsuranPinjam.setKdAngsuran(rs.getString("kd_angsuran"));
                angsuranPinjam.setKdAnggotaPinjam(rs.getString("kd_anggotapinjam"));
                angsuranPinjam.setTanggalAngsur(rs.getDate("tanggal_angsur"));
                angsuranPinjam.setJumlahAngsuran(rs.getInt("jumlah_angsuran"));
                angsuranPinjam.setStatus(rs.getString("status"));
                dataa.add(angsuranPinjam);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return dataa;
    }

    @Override
    public List<AngsuranPinjam> getSemuaSort(String kategori, String sort) {
        List<AngsuranPinjam> datas = new ArrayList<>();
        String query = "SELECT * FROM ANGSURANPINJAM ORDER BY " + kategori + " " + sort;
        try {
            PreparedStatement preparedStatement = c.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                AngsuranPinjam angsuranPinjam = new AngsuranPinjam();
                angsuranPinjam.setKdAngsuran(rs.getString("kd_angsuran"));
                angsuranPinjam.setKdAnggotaPinjam(rs.getString("kd_anggotapinjam"));
                angsuranPinjam.setTanggalAngsur(rs.getDate("tanggal_angsur"));
                angsuranPinjam.setJumlahAngsuran(rs.getInt("jumlah_angsuran"));
                angsuranPinjam.setStatus(rs.getString("status"));
                datas.add(angsuranPinjam);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaPinjamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    }

    @Override
    public List<AngsuranPinjam> search(String kategori, String data) {
        List<AngsuranPinjam> datas = new ArrayList<>();
        String query = "SELECT * FROM Angsuranpinjam WHERE " + kategori + " LIKE '%" + data + "%'";
        try {
            PreparedStatement preparedStatement = c.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                AngsuranPinjam angsuranPinjam = new AngsuranPinjam();
                angsuranPinjam.setKdAngsuran(rs.getString("kd_angsuran"));
                angsuranPinjam.setKdAnggotaPinjam(rs.getString("kd_anggotapinjam"));
                angsuranPinjam.setTanggalAngsur(rs.getDate("tanggal_angsur"));
                angsuranPinjam.setJumlahAngsuran(rs.getInt("jumlah_angsuran"));
                angsuranPinjam.setStatus(rs.getString("status"));
                datas.add(angsuranPinjam);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaPinjamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    }

    @Override
    public AngsuranPinjam getAIDI(String id) {
        AngsuranPinjam angsuranPinjam = new AngsuranPinjam();
        String query = "SELECT * FROM Angsuranpinjam WHERE kd_angsuran='" + id + "'";
        try {
            PreparedStatement preparedStatement = c.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                angsuranPinjam.setKdAngsuran(rs.getString("kd_angsuran"));
                angsuranPinjam.setKdAnggotaPinjam(rs.getString("kd_anggotapinjam"));
                angsuranPinjam.setTanggalAngsur(rs.getDate("tanggal_angsur"));
                angsuranPinjam.setJumlahAngsuran(rs.getInt("jumlah_angsuran"));
                angsuranPinjam.setStatus(rs.getString("status"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaPinjamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return angsuranPinjam;
    }
}
