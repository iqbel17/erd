/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Simpanan;
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
public class SimpananDAO implements SimpananInterfaceDAO {

    private Connection connection;

    public SimpananDAO(Connection connection) {
        this.connection = connection;
    }

    /**
     * Function insert data
     *
     * @param simpanan
     * @return flag
     */
    @Override
    public boolean insert(Simpanan simpanan) {
        boolean flag = false;
        String query = "INSERT INTO Simpanan VALUES(?,?)";
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, simpanan.getKdSimpanan());
            preparedStatement.setInt(2, simpanan.getTotalSimpan());

            preparedStatement.executeUpdate();
            flag = true;
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;

    }

    /**
     * Function update data
     *
     * @param simpanan
     * @return false
     */
    @Override
    public boolean update(Simpanan simpanan) {
        try {
            String query = "UPDATE Simpanan SET jumlah_simpanan=?,"
                    + " WHERE kd_simpanan=?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, simpanan.getTotalSimpan());
            preparedStatement.setString(2, simpanan.getKdSimpanan());
            preparedStatement.execute();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    /**
     * Function delete by Id
     *
     * @param id String
     * @return false
     */
    @Override
    public boolean delete(String id) {
        try {
            String query = "DELETE FROM Simpanan Where kd_simpanan=?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     * Function to show all data from table
     *
     * @return datas
     */
    @Override
    public List<Simpanan> getAll() {
        List<Simpanan> datas = new ArrayList<>();
        String query = "SELECT *From Simpanan";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Simpanan simpanan = new Simpanan();
                simpanan.setKdSimpanan(rs.getString(1));
                simpanan.setTotalSimpan(rs.getInt(2));
                datas.add(simpanan);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return datas;
    }

    /**
     * fungsi penampilan total simpanan koperasi
     *
     * @param category
     * @param sort
     * @return nilai total
     */
    @Override
    public List<Simpanan> getAll(String category, String sort) {
        List<Simpanan> datas = new ArrayList<>();
        String query = "SELECT *FROM Simpanan ORDER BY " + category + " " + sort;
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Simpanan simpanan = new Simpanan();
                simpanan.setKdSimpanan(rs.getString(1));
                simpanan.setTotalSimpan(rs.getInt(2));
                datas.add(simpanan);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    }
    /**
     * Function search by category
     * @param category String
     * @param data String
     * @return datas
     */
    @Override
    public List<Simpanan> search(String category, String data) {
        List<Simpanan> datas = new ArrayList<>();
        String query = "SELECT *FROM Simpanan WHERE " + category + " " + " like '%" + data + "%'";
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Simpanan simpanan = new Simpanan();
                simpanan.setKdSimpanan(rs.getString(1));
                simpanan.setTotalSimpan(rs.getInt(2));
                datas.add(simpanan);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;

    }
    /**
     * Function get ID
     * @param id String
     * @return simpanan
     */
    @Override
    public Simpanan getById(String id) {
        Simpanan simpanan = new Simpanan();
        String query = "SELECT *FROM Simpanan WHERE kd_simpanan = '" + id + "'";
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                simpanan.setKdSimpanan(rs.getString(1));
                simpanan.setTotalSimpan(rs.getInt(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return simpanan;
    }
}
