/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOInterface;

import Model.User;
import java.util.List;

/**
 *
 * @author Navilla
 */
public interface IDAOUser {
    //read data
    public List<User> getAll();
     // insert data
    public void insert(User b);
    //update data
    public void update(User b);
    //delete data
    public void delete(int id);
    //cari data
    public List<User> getAllByName(String nama);
    //login
    public void login(String nik,String password);
}
