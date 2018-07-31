/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;


import entities.Pemasukankoperasi;
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
public class PemasukanKoperasiDAO implements PemasukanKoperasiInterfaceDAO{
 private Connection connection;
    
    public PemasukanKoperasiDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean insert(Pemasukankoperasi pemasukankoperasi) {
      boolean flag = false;
        String query = "INSERT INTO Pemasukan_koperasi VALUES(?,?,?,?)";
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, pemasukankoperasi.getKdMasukkoperasi());
            preparedStatement.setString(2, pemasukankoperasi.getKdSimpanan());
            preparedStatement.setDate(3, pemasukankoperasi.getTglSimpankoperasi());
            preparedStatement.setInt(4, pemasukankoperasi.getNominalsimpan());
              preparedStatement.executeUpdate();
            flag = true;
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;   
    }

    @Override
    public boolean update(Pemasukankoperasi pemasukankoperasi) {
        try {
            String query = "UPDATE Pemasukan_Koperasi SET kd_simpanan=?, tgl_simpan=?,nominal=?,"
                                       + " WHERE kd_masukkoperasi=?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, pemasukankoperasi.getKdSimpanan());
            preparedStatement.setDate(2, pemasukankoperasi.getTglSimpankoperasi());
            preparedStatement.setInt(3, pemasukankoperasi.getNominalsimpan());
            preparedStatement.setString(4, pemasukankoperasi.getKdMasukkoperasi());
            preparedStatement.execute();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false; }

    @Override
    public boolean delete(int id) {
   try {
            String query = "DELETE FROM pemasukan_koperasi Where kd_masukkoperasi=?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;   
    }

    @Override
    public List<Pemasukankoperasi> getAll() {
         List<Pemasukankoperasi> datas = new ArrayList<>();
        String query = "SELECT *From pemasukan_koperasi";
     try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Pemasukankoperasi pemasukankoperasi= new Pemasukankoperasi();
                pemasukankoperasi.setKdMasukkoperasi(rs.getString(1));
                pemasukankoperasi.setKdSimpanan(rs.getString(2));
                pemasukankoperasi.setTglSimpankoperasi(rs.getDate(3));
                pemasukankoperasi.setNominalsimpan(rs.getInt(4));
                                datas.add(pemasukankoperasi);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return datas;
        
    
    }
    

    @Override
    public List<Pemasukankoperasi> getAll(String category, String sort) {
        List<Pemasukankoperasi> datas = new ArrayList<>();
        String query = "SELECT *FROM Pemasukan_koperasi ORDER BY " + category + " " + sort;
 try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
               Pemasukankoperasi pemasukankoperasi= new Pemasukankoperasi();
                pemasukankoperasi.setKdMasukkoperasi(rs.getString(1));
                pemasukankoperasi.setKdSimpanan(rs.getString(2));
                pemasukankoperasi.setTglSimpankoperasi(rs.getDate(3));
                pemasukankoperasi.setNominalsimpan(rs.getInt(4));
                                datas.add(pemasukankoperasi);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    }

    @Override
    public List<Pemasukankoperasi> search(String category, String data) {
 List<Pemasukankoperasi> datas = new ArrayList<>();
        String query = "SELECT *FROM Pemasukan_koperasi WHERE " + category + " " + " like '%" + data + "%'";
    try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
              Pemasukankoperasi pemasukankoperasi= new Pemasukankoperasi();
                pemasukankoperasi.setKdMasukkoperasi(rs.getString(1));
                pemasukankoperasi.setKdSimpanan(rs.getString(2));
                pemasukankoperasi.setTglSimpankoperasi(rs.getDate(3));
                pemasukankoperasi.setNominalsimpan(rs.getInt(4));
                                datas.add(pemasukankoperasi);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    
    }

    @Override
    public Pemasukankoperasi getById(int id) {
    Pemasukankoperasi pemasukankoperasi= new Pemasukankoperasi();
        String query = "SELECT *FROM Pemasukan_koperasi WHERE kd_masukkoperasi = " + id + "'"; 
         try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
             pemasukankoperasi.setKdMasukkoperasi(rs.getString(1));
                pemasukankoperasi.setKdSimpanan(rs.getString(2));
                pemasukankoperasi.setTglSimpankoperasi(rs.getDate(3));
                pemasukankoperasi.setNominalsimpan(rs.getInt(4));
            }

        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pemasukankoperasi;
        
    }
   
    
}
