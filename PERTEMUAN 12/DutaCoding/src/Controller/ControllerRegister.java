/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import DAO.database;
import DAOInterface.IDAOUser;
import Model.User;
import View.FormRegister;
import javax.swing.JOptionPane;
/**
 *
 * @author Navilla
 */
public class ControllerRegister {
    FormRegister form;
    IDAOUser iUser;

    //constructor
    public ControllerRegister(FormRegister form) {
        this.form = form;
        iUser = new database();
        
    }

    public void resetForm() {
        form.gettxtNik().setText("");
        form.gettxtNama().setText("");
        form.gettxtAlasan().setText("");
        form.gettxtAlamat().setText("");
    }

    public void insert() {
        if (!form.gettxtNik().getText().trim().isEmpty() || !form.gettxtNama().getText().trim().isEmpty() || !form.gettxtAlasan().getText().trim().isEmpty() || !form.gettxtAlamat().getText().trim().isEmpty()) {
            User b = new User();
            b.setNik(form.gettxtNik().getText());
            b.setNama(form.gettxtNama().getText());
            b.setJk(form.getCmbJk().getSelectedItem().toString());
            b.setAlamat(form.gettxtAlamat().getText());
            b.setAlasan(form.gettxtAlasan().getText());
            iUser.insert(b);
            JOptionPane.showMessageDialog(null, "Register Success");
            resetForm();
        }else{
            JOptionPane.showMessageDialog(form, "Data Can not empty");
        }
    }
}
