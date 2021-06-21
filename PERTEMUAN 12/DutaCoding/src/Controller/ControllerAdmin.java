/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import DAO.database;
import DAOInterface.IDAOUser;
import Model.TabelModelUser;
import Model.User;
import View.FormUser;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Navilla
 */
    public class ControllerAdmin {
    FormUser form;
    IDAOUser iUser;
    List<User> lstUser;

    public ControllerAdmin(FormUser form) {
        this.form = form;
        iUser = new database();
        lstUser = iUser.getAll();
    }

    public void resetForm() {
        form.getTxtID().setText("");
        form.getTxtNik().setText("");
        form.getTxtNama().setText("");
        form.getTxtAlasan().setText("");
        form.getTxtAlamat().setText("");
      
    }

    public void showData() {
        lstUser = iUser.getAll();
        TabelModelUser tabelUser = new TabelModelUser(lstUser);
        form.getTblUser().setModel(tabelUser);
    }

    public void editData(int row) {
        form.getTxtID().setText(lstUser.get(row).getId().toString());
        form.getTxtNik().setText(lstUser.get(row).getNik());
        form.getTxtNama().setText(lstUser.get(row).getNama());
        form.getCmbJK().setSelectedItem(lstUser.get(row).getJk());
        form.getTxtAlamat().setText(lstUser.get(row).getAlamat());
        form.getTxtAlasan().setText(lstUser.get(row).getAlasan());

    }

    public void update() {
        if (!form.getTxtID().getText().trim().isEmpty()) {
            User b = new User();
            b.setNik(form.getTxtNik().getText());
            b.setNama(form.getTxtNama().getText());
            b.setJk(form.getCmbJK().getSelectedItem().toString());
            b.setAlamat(form.getTxtAlamat().getText());
            b.setAlasan(form.getTxtAlasan().getText());

            b.setId(Integer.parseInt(form.getTxtID().getText()));
            iUser.update(b);
            JOptionPane.showMessageDialog(null, "Update Success");
            resetForm();
        } else {
            JOptionPane.showMessageDialog(form, "Please select data first");
        }
    }

    public void delete() {
        if (!form.getTxtID().getText().trim().isEmpty()) {
            int id = Integer.parseInt(form.getTxtID().getText());
            iUser.delete(id);
            JOptionPane.showMessageDialog(null, "Delete Data  Success");
            resetForm();
        }
    }

    public void showSearchData() {
        lstUser = iUser.getAllByName(form.getTxtCari().getText());
        TabelModelUser tabelUser = new TabelModelUser(lstUser);
        form.getTblUser().setModel(tabelUser);
    }

    public void searchNik() {
        if (!form.getTxtCari().getText().trim().isEmpty()) {
            iUser.getAllByName(form.getTxtCari().getText());
            showSearchData();
        } else {
            JOptionPane.showMessageDialog(form, "Can not empty");
            showData();
        }
    }
}
