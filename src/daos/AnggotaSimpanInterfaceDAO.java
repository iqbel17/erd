/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.AnggotaSimpan;
import java.util.List;

/**
 *
 * @author iqbael17
 */
public interface AnggotaSimpanInterfaceDAO {
    public boolean insert(AnggotaSimpan anggotaSimpan);
    public boolean update(AnggotaSimpan anggotaSimpan);
    public boolean delete(String id);
    public List<AnggotaSimpan> getAll();
    public List<AnggotaSimpan> getAll(String category,String sort);
    public List<AnggotaSimpan> search(String category,String data);
    public AnggotaSimpan getById(String id);
    
}
