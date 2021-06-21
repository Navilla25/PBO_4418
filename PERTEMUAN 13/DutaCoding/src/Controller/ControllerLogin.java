/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import DAO.database;
import DAOInterface.IDAOUser;
import View.PanelLogin;
import javax.swing.JOptionPane;
/**
 *
 * @author Navilla
 */
public class ControllerLogin {
    IDAOUser iUser;
    PanelLogin form;

    public ControllerLogin(PanelLogin form) {
        this.form = form;
        iUser = new database();

    }

     public void login() {
        if (!form.getTxtNik().getText().trim().isEmpty() || !form.getTxtPass().getText().trim().isEmpty()) {
            iUser.login(form.getTxtNik().getText(), form.getTxtPass().getText());
            resetForm();
        } else {
            JOptionPane.showMessageDialog(form, "Can not empty");

        }
    }
    public void resetForm(){
        form.getTxtNik().setText("");
        form.getTxtPass().setText("");
    }
    

}
