/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOInterface;

import Model.Mahasiswa;
import java.util.List;

/**
 *
 * @author Navilla
 */
public interface IMahasiswa {
    public List<Mahasiswa> getAll();
    // insert data
    public void insert(Mahasiswa b);
    //update data
    public void update(Mahasiswa b);
    //delete data
    public void delete(int id);
    //cari data
    public List<Mahasiswa> getAllByName(String nama); 
}
