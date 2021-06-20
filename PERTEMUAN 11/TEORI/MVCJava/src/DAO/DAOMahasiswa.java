/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConfigDB.Koneksi;
import DAOInterface.IMahasiswa;
import Model.Mahasiswa;
import java.util.List;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Navilla
 */
public class DAOMahasiswa implements IMahasiswa {
    
    public DAOMahasiswa(){
        con = Koneksi.getconnection();
    }
    
    @Override
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> lstMhs = null;
        try{
            lstMhs = new ArrayList<Mahasiswa>();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(strRead);
            while(rs.next()){
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNim(rs.getString("nim"));
                mhs.setNama(rs.getString("nama"));
                mhs.setJk(rs.getString("jk"));
                mhs.setAlamat(rs.getString("alamat"));
                lstMhs.add(mhs);
                
            }
        }catch (SQLException e){
            System.out.println("error: "+e.getMessage());
        }
        return lstMhs;
    }

    @Override
    public void insert(Mahasiswa b) {
        PreparedStatement statement = null;
        try{
            statement = con.prepareStatement(strInsert);
            statement.setInt(1, b.getId());
            statement.setString(2, b.getNim());
            statement.setString(3, b.getNama());
            statement.setString(4, b.getJk());
            statement.setString(5, b.getAlamat());
            statement.execute();
        }catch (SQLException e){
            System.out.println("Gagal Input");
        }
        finally{
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Input");
            }
        }
    }
    
    @Override
    public void update(Mahasiswa b) {
        PreparedStatement statement = null;
        try{
            statement = con.prepareStatement(strUpdate);
            statement.setString(1, b.getNim());
            statement.setString(2, b.getNama());
            statement.setString(3, b.getJk());
            statement.setString(4, b.getAlamat());
            statement.setInt(5, b.getId());
            statement.execute();
        }catch (SQLException e){
            System.out.println("Gagal Update");
        }
        finally{
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Update");
            }
        }
    }
    @Override
    public void delete(int id) {
        PreparedStatement statement = null;
        try{
            statement = con.prepareStatement(strDelete);
            statement.setInt(1, id);
            statement.execute();
        }catch (SQLException e){
            System.out.println("Gagal delete");
        }
        finally{
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal delete");
            }
        }
    }
    @Override
    public List<Mahasiswa> getAllByName(String nama) {
        List<Mahasiswa> lstMhs = null;
        try{
            lstMhs = new ArrayList<Mahasiswa>();
            PreparedStatement st = con.prepareStatement(strSearch);
            st.setString(1, "%"+nama+"%");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNim(rs.getString("nim"));
                mhs.setNama(rs.getString("nama"));
                mhs.setJk(rs.getString("jk"));
                mhs.setAlamat(rs.getString("alamat"));
                lstMhs.add(mhs);
                
            }
        }catch (SQLException e){
            System.out.println("error: "+e.getMessage());
        }
        return lstMhs;    
    }   
     Connection con;
    //Sql Query
    String strRead = "select * from Mahasiswa;";
    String strInsert = "insert into Mahasiswa(id,nim,nama,jk,alamat) values (?,?,?,?,?);";
    String strUpdate = "update Mahasiswa set nim=?, nama=?, jk=?, alamat=? where id=?";
    String strDelete = "delete from Mahasiswa where id=?";
    String strSearch = "select * from Mahasiswa where nama like?;";
    
    
    
}
