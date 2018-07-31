/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.PemasukanKoperasiDAO;
import daos.SimpananDAO;
import entities.Pemasukankoperasi;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author iqbael17
 */
public class PemasukanKoperasiController implements PemasukanKoperasiInterface{
private Pemasukankoperasi pemasukankoperasi;
private PemasukanKoperasiDAO pkdao;
private SimpananDAO sdao;

    public PemasukanKoperasiController(Connection connection) {
        this.pkdao = new PemasukanKoperasiDAO(connection);
        this.sdao = new SimpananDAO(connection);
    }

    @Override
    public boolean save(String kdmasukkoperasi, String kdSimpan, String tglMasuk, String nominalMasuk) {
        return this.pkdao.insert(new Pemasukankoperasi(kdmasukkoperasi, kdSimpan,java.sql.Date.valueOf(tglMasuk),Integer.parseInt(nominalMasuk)));
  }

    @Override
    public boolean edit(String kdmasukkoperasi, String kdSimpan, String tglMasuk, String nominalMasuk) {
        return this.pkdao.update(new Pemasukankoperasi(kdmasukkoperasi, kdSimpan,java.sql.Date.valueOf(tglMasuk),Integer.parseInt(nominalMasuk)));
  }  

    @Override
    public boolean drop(int id) {
     return this.pkdao.delete(id);
  } 


    @Override
    public List<Pemasukankoperasi> binding() {
      return this.pkdao.getAll();
      }

    @Override
    public List<Pemasukankoperasi> bindingsort(String category, String sort) {
       return this.pkdao.getAll(category, sort);
     }

    @Override
    public List<Pemasukankoperasi> find(String category, String Data) {
          return this.pkdao.getAll(category, Data);
   }

    @Override
    public Pemasukankoperasi findbyId(int id) {
          return this.pkdao.getById(id);
   
    }
    
    
    
}
