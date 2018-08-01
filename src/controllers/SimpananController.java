/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.SimpananDAO;
import entities.Simpanan;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author iqbael17
 */
public class SimpananController implements SimpananInterfaceController{
private SimpananDAO sdao;
private Simpanan simpanan;




     public SimpananController(Connection connection) {
        this.sdao = new SimpananDAO(connection);
    }

    
    @Override
    public boolean save(String kdSimpanan, String jmlSimpanan) {
           return this.sdao.insert(new Simpanan(kdSimpanan, Integer.parseInt(jmlSimpanan)));
  
    }

    @Override
    public boolean edit(String kdSimpanan, String jmlSimpanan) {
           return this.sdao.update(new Simpanan(kdSimpanan, Integer.parseInt(jmlSimpanan)));   }

    @Override
    public boolean drop(String id) {
           return this.sdao.delete(id); }

    @Override
    public List<Simpanan> binding() {
            return this.sdao.getAll();
}

    @Override
    public List<Simpanan> bindingsort(String category, String sort) {
            return this.sdao.getAll(category, sort);
 
    }

    @Override
    public List<Simpanan> find(String category, String Data) {
            return this.sdao.getAll(category, Data);
  }

    @Override
    public Simpanan findbyId(String id) {
           return this.sdao.getById(id); 
    }

    
 }
    
