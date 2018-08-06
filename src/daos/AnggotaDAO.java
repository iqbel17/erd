/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Anggota;
import java.sql.CallableStatement;
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
 * @author iqbael17
 */
public class AnggotaDAO implements AnggotaInterfaceDAO {

    private Connection connection;

    public AnggotaDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean insert(Anggota anggota) {

        boolean flag = false;
        String query = "INSERT INTO Anggota VALUES(?,?,?,?)";
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, anggota.getKdAnggota());
            preparedStatement.setString(2, anggota.getNmAnggota());
            preparedStatement.setString(3, anggota.getTelepon());
            preparedStatement.setString(4, anggota.getAlamat());
            preparedStatement.executeUpdate();
            flag = true;
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;

//    try {
//             CallableStatement cs = connection.prepareCall("{ CALL insAnggota(?,?,?,?) }");
//             cs.setString(1, anggota.getKdAnggota());
//             cs.setString(2, anggota.getNmAnggota());
//                          cs.setString(3, anggota.getTelepon());
//                 
//                          cs.setString(4, anggota.getAlamat());
//             cs.executeUpdate();
//             flag=true;
//        } catch (SQLException ex) {
//            Logger.getLogger(AnggotaDAO.class.getName()).log(Level.SEVERE, null, ex);
//            
//        }
//    
//    return flag;
    }

    @Override
    public boolean update(Anggota anggota) {
        try {
            String query = "UPDATE Anggota SET nama_anggota=?,telepon=?,"
                    + "alamat=?"
                    + " WHERE kd_anggota=?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, anggota.getNmAnggota());
            preparedStatement.setString(2, anggota.getTelepon());
            preparedStatement.setString(3, anggota.getAlamat());
            preparedStatement.setString(4, anggota.getKdAnggota());
            preparedStatement.execute();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    @Override
    public boolean delete(String id) {
        try {
            String query = "DELETE FROM Anggota Where kd_anggota=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<Anggota> getAll() {
        List<Anggota> datas = new ArrayList<>();
        String query = "SELECT *From Anggota";
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Anggota anggota = new Anggota();
                anggota.setKdAnggota(rs.getString(1));
                anggota.setNmAnggota(rs.getString(2));
                anggota.setTelepon(rs.getString(3));
                anggota.setAlamat(rs.getString(4));
                datas.add(anggota);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return datas;

    }

    @Override
    public List<Anggota> getAll(String category, String sort) {
        List<Anggota> datas = new ArrayList<>();
        String query = "SELECT *FROM Anggota ORDER BY " + category + " " + sort;
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Anggota anggota = new Anggota();
                anggota.setKdAnggota(rs.getString(1));
                anggota.setNmAnggota(rs.getString(2));
                anggota.setTelepon(rs.getString(3));
                anggota.setAlamat(rs.getString(4));
                datas.add(anggota);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    }

    @Override
    public List<Anggota> search(String category, String data) {
        List<Anggota> datas = new ArrayList<>();
        String query = "SELECT *FROM Anggota WHERE " + category + " " + " like '%" + data + "%'";
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Anggota anggota = new Anggota();
                anggota.setKdAnggota(rs.getString(1));
                anggota.setNmAnggota(rs.getString(2));
                anggota.setTelepon(rs.getString(3));
                anggota.setAlamat(rs.getString(4));
                datas.add(anggota);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    }

    @Override
    public Anggota getById(String id) {
        Anggota anggota = new Anggota();
        String query = "SELECT *FROM Anggota WHERE kd_anggota = '" + id + "'";
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                anggota.setKdAnggota(rs.getString(1));
                anggota.setNmAnggota(rs.getString(2));
                anggota.setTelepon(rs.getString(3));
                anggota.setAlamat(rs.getString(4));
            }

        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return anggota;
    }
}
