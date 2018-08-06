/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.AngsuranPinjam;
import java.util.List;

/**
 *
 * @author Gusma
 */
public interface AngsuranPinjamInterfaceDAO {

    public boolean insert(AngsuranPinjam angsuranPinjam);

    public boolean update(AngsuranPinjam angsuranPinjam);

    public boolean delete(String id);

    public List<AngsuranPinjam> getSemua();

    public List<AngsuranPinjam> getSemuaSort(String kategori, String sort);

    public List<AngsuranPinjam> search(String kategori, String data);

    public AngsuranPinjam getAIDI(String id);
}
