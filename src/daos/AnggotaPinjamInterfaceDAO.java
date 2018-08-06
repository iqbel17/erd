/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.AnggotaPinjam;
import java.util.List;

/**
 *
 * @author Gusma
 */
public interface AnggotaPinjamInterfaceDAO {
    public boolean insert(AnggotaPinjam anggotaPinjam);
    
    public boolean update(AnggotaPinjam anggotaPinjam);
    
    public boolean delete(String id);
    
    public List<AnggotaPinjam> getSemua();
    
    public List<AnggotaPinjam> getSemuaSort(String kategori , String sort);
    
    public List<AnggotaPinjam> search (String kategori, String data);
    
    public AnggotaPinjam getAIDI(String id);
}
