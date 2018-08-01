/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.AnggotaSimpan;
import java.util.List;

/**
 *
 * @author iqbael17
 */
public interface AnggotaSimpanInterfaceController {
    public boolean save(String kdAnggotasimpan, String kdSimpanan, String kdAnggota,String kdKaryawan, String tglSimpan, String nominal);
    public boolean edit(String kdAnggotasimpan, String kdSimpanan, String kdAnggota,String kdKaryawan, String tglSimpan, String nominal);
    public boolean drop (String id);
    public List<AnggotaSimpan> binding();
    public List<AnggotaSimpan> bindingsort(String category, String sort);
    public List<AnggotaSimpan> find(String category, String Data);
    public AnggotaSimpan findbyId(String id);
}
