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
class Buku {
    private final String judul;
    private final String pengarang;
    String penerbit;
    int tahun;

    //Construktor
    public Buku (String judul ,String pengarang ,String penerbit ,int tahun){
        this.judul = judul;
        this.penerbit = penerbit;
        this.pengarang = pengarang;
        this.tahun = tahun;
    }
   
    //method
    public void cetakBuku(){
        
        System.out.println("Judul:" +this.judul);
        System.out.println("Pengarang:" +this.pengarang);
        System.out.println("Pengarang:" +this.penerbit);
        System.out.println("Tahun:" +this.tahun);
    }
    
}
