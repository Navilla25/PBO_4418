/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Navilla
 */
public class TabelModelUser extends AbstractTableModel{
    public TabelModelUser(List<User> lstUser){
       this.lstUser = lstUser;
    }    
    @Override
    public int getRowCount() {
        return this.lstUser.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }
    
    @Override
    public String getColumnName(int column){
        switch (column){
            case 0:
                return "ID";
            case 1:
                return "Nik";
            case 2:
                return "Nama";
            case 3:
                return "Jen.Kelamin";
            case 4:
                return "Alamat";
            case 5:
                return "Alasan";
            default:
                return null;
            }
    }    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return lstUser.get(rowIndex).getId();
            case 1:
                return lstUser.get(rowIndex).getNik();
            case 2:
                return lstUser.get(rowIndex).getNama();
            case 3:
                return lstUser.get(rowIndex).getJk();
            case 4:
                return lstUser.get(rowIndex).getAlamat();
            case 5:
                return lstUser.get(rowIndex).getAlasan();
            default:
                return null;
        }
    }
    
    List<User> lstUser;
    
}
