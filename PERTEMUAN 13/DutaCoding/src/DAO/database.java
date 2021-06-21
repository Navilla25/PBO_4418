/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import ConfigDB.Koneksi;
import DAOInterface.IDAOUser;
import Model.User;
import View.FormUser;
import View.PanelLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Navilla
 */
public class database implements IDAOUser {
    Connection con;
    public database(){
        con = Koneksi.getconnection();
    }
    @Override
    public List<User> getAll() {
        List<User> lstUser = null;
        try {
            lstUser = new ArrayList<User>();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(dbQuery.select);
            while (rs.next()) {
                User b = new User();
                b.setId(rs.getInt("id"));
                b.setNik(rs.getString("nik"));
                b.setNama(rs.getString("nama"));
                b.setJk(rs.getString("jk"));
                b.setAlamat(rs.getString("alamat"));
                b.setAlasan(rs.getString("alasan"));
                lstUser.add(b);
            }
        } catch (SQLException e) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, e);
        }
        return lstUser;
    }

    @Override
    public void insert(User b) {
        PreparedStatement st = null;
        try {
            st = con.prepareStatement(dbQuery.insert);
            st.setString(1, b.getNik());
            st.setString(2, b.getNama());
            st.setString(3, b.getJk());
            st.setString(4, b.getAlamat());
            st.setString(5, b.getAlasan());
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void update(User b) {
         PreparedStatement st = null;
        try {
            st = con.prepareStatement(dbQuery.update);
            st.setString(1, b.getNik());
            st.setString(2, b.getNama());
            st.setString(3, b.getJk());
            st.setString(4, b.getAlamat());
            st.setString(5, b.getAlasan());
            st.setInt(6, b.getId());
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void delete(int id) {
         PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(dbQuery.delete);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<User> getAllByName(String nama) {
        List<User> lstUser = null;
        try {
            lstUser = new ArrayList<User>();
            PreparedStatement st = con.prepareStatement(dbQuery.searchNik);
            st.setString(1, "%" + nama + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                User b = new User();
                b.setId(rs.getInt("id"));
                b.setNik(rs.getString("nik"));
                b.setNama(rs.getString("nama"));
                b.setJk(rs.getString("jk"));
                b.setAlamat(rs.getString("alamat"));
                b.setAlasan(rs.getString("alasan"));
                lstUser.add(b);
            }
        } catch (SQLException e) {
            Logger.getLogger(dbQuery.class.getName()).log(Level.SEVERE, null, e);
        }
        return lstUser;
    }

    @Override
    public void login(String nik, String password) {
        try {
            PreparedStatement st = con.prepareStatement(dbQuery.loginAdmin);
            st.setString(1, nik);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                if (rs.getString("rules").equals("admin")) {
                    PanelLogin fp = new PanelLogin();
                    FormUser adm = new FormUser();
                    adm.setVisible(true);
                    fp.setVisible(false);
                }
            } else {
               JOptionPane.showMessageDialog(null, "Nik dan Password tidak dikenali");
            }
        } catch (SQLException e) {
            Logger.getLogger(dbQuery.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Data isn't match");

        }
    }
    
    
}
