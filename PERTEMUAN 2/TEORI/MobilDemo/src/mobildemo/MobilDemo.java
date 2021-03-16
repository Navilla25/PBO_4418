/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobildemo;

/**
 *
 * @author Acer
 */
class Mobilaja{
    String warna;
    int tahunProduksi;
}
public class MobilDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mobilaja mobil1 = new Mobilaja ();
        
        //memanggil atribut dan memberi nilai
        mobil1.warna = "Lemon";
        mobil1.tahunProduksi = 2010;
        
        System.out.println("Warna Mobil:" + mobil1.warna);
        System.out.println("Tahun Produksi:" + mobil1.tahunProduksi);
    }
    
}

