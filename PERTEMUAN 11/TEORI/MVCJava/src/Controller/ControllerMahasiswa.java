/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOMahasiswa;
import DAOInterface.IMahasiswa;
import Model.Mahasiswa;
import Model.TabelModelMahasiswa;
import View.FormMahasiswa;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Navilla
 */
public class ControllerMahasiswa {
    
    public ControllerMahasiswa(FormMahasiswa frmMahasiswa){
        this.frmMahasiswa = frmMahasiswa;
        iMahasiswa = new DAOMahasiswa();
    }
    
    public void isiTable(){
        lstMhs = iMahasiswa.getAll();
        TabelModelMahasiswa tabelMhs = new TabelModelMahasiswa(lstMhs);
        frmMahasiswa.getTabelData().setModel(tabelMhs);
    }
    public void insert(){
        Mahasiswa b = new Mahasiswa();
        b.setId(Integer.parseInt(frmMahasiswa.gettxtID().getText()));
        b.setNim(frmMahasiswa.gettxtNim().getText());
        b.setNama(frmMahasiswa.gettxtNama().getText());
        b.setJk(frmMahasiswa.getJek().getSelectedItem().toString());
        b.setAlamat(frmMahasiswa.gettxtAlamat().getText());
        iMahasiswa.insert(b);
        JOptionPane.showMessageDialog(null, "input berhasil");
    }
    //mengosongkan field
    public void reset(){
        frmMahasiswa.gettxtID().setText("");
        frmMahasiswa.gettxtNim().setText("");
        frmMahasiswa.gettxtNama().setText("");
        frmMahasiswa.getJek().setSelectedItem("L");
        frmMahasiswa.gettxtAlamat().setText("");
    }
    //fungsi yang menampilkan data yang dipilih di tabelData
    public void isiField(int row){
        frmMahasiswa.gettxtID().setEnabled(false);
        frmMahasiswa.gettxtID().setText(lstMhs.get(row).getId().toString());
        frmMahasiswa.gettxtNim().setText(lstMhs.get(row).getNim());
        frmMahasiswa.gettxtNama().setText(lstMhs.get(row).getNama());
        frmMahasiswa.getJek().setSelectedItem(lstMhs.get(row).getJk());
        frmMahasiswa.gettxtAlamat().setText(lstMhs.get(row).getAlamat());
    }
    public void update(){
        Mahasiswa b = new Mahasiswa();
        b.setNim(frmMahasiswa.gettxtNim().getText());
        b.setNama(frmMahasiswa.gettxtNama().getText());
        b.setJk(frmMahasiswa.getJek().getSelectedItem().toString());
        b.setAlamat(frmMahasiswa.gettxtAlamat().getText());
        b.setId(Integer.parseInt(frmMahasiswa.gettxtID().getText()));
        iMahasiswa.update(b);
        JOptionPane.showMessageDialog(null, "update berhasil");
    }
    public void delete(){
        iMahasiswa.delete(Integer.parseInt(frmMahasiswa.gettxtID().getText()));
        JOptionPane.showMessageDialog(null, "delete berhasil");
    }
    public void cari(){
        lstMhs = iMahasiswa.getAllByName(frmMahasiswa.gettxtCariNama().getText());
        TabelModelMahasiswa tabelMhs = new TabelModelMahasiswa(lstMhs);
        frmMahasiswa.getTabelData().setModel(tabelMhs);
    }
    
    FormMahasiswa frmMahasiswa;
    IMahasiswa iMahasiswa;
    List<Mahasiswa> lstMhs;
}
