/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;


import entities.Simpanan;
import java.util.List;

/**
 *
 * @author iqbael17
 */
public interface SimpananInterfaceDAO {
    public boolean insert(Simpanan simpanan);
    public boolean update(Simpanan simpanan);
    public boolean delete(String id);
    public List<Simpanan> getAll();
    public List<Simpanan> getAll(String category,String sort);
    public List<Simpanan> search(String category,String data);
    public Simpanan getById(String id);
}
