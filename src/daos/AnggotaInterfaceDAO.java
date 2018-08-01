/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.List;
import entities.Anggota;

/**
 *
 * @author iqbael17
 */
public interface AnggotaInterfaceDAO {
    public boolean insert(Anggota anggota);
    public boolean update(Anggota anggota);
    public boolean delete(String id);
    public List<Anggota> getAll();
    public List<Anggota> getAll(String category,String sort);
    public List<Anggota> search(String category,String data);
    public Anggota getById(String id);
 }
