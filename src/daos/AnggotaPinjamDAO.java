/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

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

    private Connection c;

    public AnggotaPinjamDAO(Connection c) {
        this.c = c;
    }

    @Override
    public boolean insert(AnggotaPinjam anggotaPinjam) {
        boolean flag = false;
        String query = "INSERT INTO ANGGOTA_PINJAM VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = c.prepareStatement(query);
            preparedStatement.setString(1, anggotaPinjam.getKdAnggotapinjam());
            preparedStatement.setString(2, anggotaPinjam.getKdAnggota());
            preparedStatement.setString(3, anggotaPinjam.getKdKaryawan());
            preparedStatement.setString(4, anggotaPinjam.getNamaJaminan());
            preparedStatement.setDate(5, anggotaPinjam.getTglPinjam());
            preparedStatement.setInt(6, anggotaPinjam.getNominalPinjam());
            preparedStatement.setInt(7, anggotaPinjam.getJangkaWaktu());
            preparedStatement.executeUpdate();
            flag =  true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean update(AnggotaPinjam anggotaPinjam) {
        String query = "UPDATE ANGGOTA_PINJAM SET kd_anggota=?, kd_karyawan=?, nama_jaminan=?, tgl_pinjam=?, nominal_pinjam=?, jangka_waktu=? WHERE kd_anggotapinjam=?";
        try {
            PreparedStatement preparedStatement = c.prepareStatement(query);
            preparedStatement.setString(1, anggotaPinjam.getKdAnggota());
            preparedStatement.setString(2, anggotaPinjam.getKdKaryawan());
            preparedStatement.setString(3, anggotaPinjam.getNamaJaminan());
            preparedStatement.setDate(4, anggotaPinjam.getTglPinjam());
            preparedStatement.setInt(5, anggotaPinjam.getNominalPinjam());
            preparedStatement.setInt(6, anggotaPinjam.getJangkaWaktu());
            preparedStatement.setString(7, anggotaPinjam.getKdAnggotapinjam());
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
            String query = "DELETE FROM ANGGOTA_PINJAM WHERE kd_anggotapinjam=?";
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
    public List<AnggotaPinjam> getSemua() {
        List<AnggotaPinjam> dataa = new ArrayList<>();
        String query = "SELECT * FROM ANGGOTA_PINJAM";
        try {
            PreparedStatement preparedStatement = c.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                AnggotaPinjam anggotaPinjam = new AnggotaPinjam();
                anggotaPinjam.setKdAnggotapinjam(rs.getString("kd_anggotapinjam"));
                anggotaPinjam.setKdAnggota(rs.getString("kd_anggota"));
                anggotaPinjam.setKdKaryawan(rs.getString("kd_karyawan"));
                anggotaPinjam.setNamaJaminan(rs.getString("nama_jaminan"));
                anggotaPinjam.setTglPinjam(rs.getDate("tgl_pinjam"));
                anggotaPinjam.setNominalPinjam(rs.getInt("nominal_pinjam"));
                anggotaPinjam.setJangkaWaktu(rs.getInt("jangka_waktu"));
                dataa.add(anggotaPinjam);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return dataa;
    }

    @Override
    public List<AnggotaPinjam> getSemuaSort(String kategori, String sort) {
        List<AnggotaPinjam> datas = new ArrayList<>();
        String query = "SELECT * FROM ANGGOTA_PINJAM ORDER BY " + kategori + " " + sort;
        try {
            PreparedStatement preparedStatement = c.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                AnggotaPinjam anggotaPinjam = new AnggotaPinjam();
                anggotaPinjam.setKdAnggotapinjam(rs.getString("kd_anggotapinjam"));
                anggotaPinjam.setKdAnggota(rs.getString("kd_anggota"));
                anggotaPinjam.setKdKaryawan(rs.getString("kd_karyawan"));
                anggotaPinjam.setNamaJaminan(rs.getString("nama_jaminan"));
                anggotaPinjam.setTglPinjam(rs.getDate("tgl_pinjam"));
                anggotaPinjam.setNominalPinjam(rs.getInt("nominal_pinjam"));
                anggotaPinjam.setJangkaWaktu(rs.getInt("jangka_waktu"));
                datas.add(anggotaPinjam);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaPinjamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    }

    @Override
    public List<AnggotaPinjam> search(String kategori, String data) {
        List<AnggotaPinjam> datas = new ArrayList<>();
        String query = "SELECT * FROM Anggota_pinjam WHERE " + kategori + " LIKE '%" + data + "%'";
        try {
            PreparedStatement preparedStatement = c.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                AnggotaPinjam anggotaPinjam = new AnggotaPinjam();
                anggotaPinjam.setKdAnggotapinjam(rs.getString("kd_anggotapinjam"));
                anggotaPinjam.setKdAnggota(rs.getString("kd_anggota"));
                anggotaPinjam.setKdKaryawan(rs.getString("kd_karyawan"));
                anggotaPinjam.setNamaJaminan(rs.getString("nama_jaminan"));
                anggotaPinjam.setTglPinjam(rs.getDate("tgl_pinjam"));
                anggotaPinjam.setNominalPinjam(rs.getInt("nominal_pinjam"));
                anggotaPinjam.setJangkaWaktu(rs.getInt("jangka_waktu"));
                datas.add(anggotaPinjam);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaPinjamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    }

    @Override
    public AnggotaPinjam getAIDI(String id) {
        AnggotaPinjam anggotaPinjam = new AnggotaPinjam();
        String query = "SELECT * FROM Anggota_Pinjam WHERE kd_anggotapinjam='" + id + "'";
        try {
            PreparedStatement preparedStatement = c.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                anggotaPinjam.setKdAnggotapinjam(rs.getString("kd_anggotapinjam"));
                anggotaPinjam.setKdAnggota(rs.getString("kd_anggota"));
                anggotaPinjam.setKdKaryawan(rs.getString("kd_karyawan"));
                anggotaPinjam.setNamaJaminan(rs.getString("nama_jaminan"));
                anggotaPinjam.setTglPinjam(rs.getDate("tgl_pinjam"));
                anggotaPinjam.setNominalPinjam(rs.getInt("nominal_pinjam"));
                anggotaPinjam.setJangkaWaktu(rs.getInt("jangka_waktu"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaPinjamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return anggotaPinjam;
    }
}
