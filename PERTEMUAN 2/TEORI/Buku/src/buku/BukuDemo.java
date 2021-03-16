/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buku;

/**
 *
 * @author Navilla
 */
public class BukuDemo {
    public static void main(String[] args) {
        Buku baru = new Buku ("Pemrograman Berbasis Objek dengan Java",
        "Indrajani", "Elexmedia Komputindo", 2007);
        baru.cetakBuku(); 
        System.out.println("==========================================");
        Buku baru1 = new Buku ("Dasar Pemrograman Java", "Abdul Kadir",
        "Andi Offset", 2004);
        baru1.cetakBuku();
    }
    
}


