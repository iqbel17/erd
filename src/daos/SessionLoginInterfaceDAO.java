/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.SessionLogin;
import java.util.List;

/**
 *
 * @author iqbael17
 */
public interface SessionLoginInterfaceDAO {
    public List<SessionLogin> getLogin();  
}
