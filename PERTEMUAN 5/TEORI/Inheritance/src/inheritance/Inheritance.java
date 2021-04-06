/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Navilla
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Output dari ArrayList");
        ArrayList arr = new ArrayList();
        arr.append(4);
        arr.append(1);
        arr.append(3);
        arr.append(8);
        arr.ShowData();
        System.out.println("Next tambah elemen");
        arr.append(2);
        arr.ShowData();
        System.out.println("Hapus elemen");
        arr.pop();
        arr.ShowData();
        System.out.println("Mengubah data");
        arr.UbahData(1, 9);
        arr.ShowData();
        System.out.println("\n");
        
        System.out.println("Output dari Stack");
        Stack stuck = new Stack();
        stuck.append(2);
        stuck.append(3);
        stuck.append(4);
        stuck.append(5);
        stuck.ShowData();
        System.out.println("Next tambah elemen");
        stuck.append(7);
        stuck.ShowData();
        System.out.println("Hapus elemen");
        stuck.pop();
        stuck.ShowData();
        System.out.println("Mengubah data");
        stuck.UbahData(0, 6);
        stuck.ShowData();
        System.out.println("\n");
        
        System.out.println("Output dari Queue");
        Queue que = new Queue();
        que.append(4);
        que.append(1);
        que.append(3);
        que.append(8);
        que.ShowData();
        System.out.println("Next tambah elemen");
        que.append(2);
        que.ShowData();
        System.out.println("Hapus elemen");
        que.pop();
        que.ShowData();
        System.out.println("Mengubah data");
        que.UbahData(1, 9);
        que.ShowData();
        
    }
    
}
