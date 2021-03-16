/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobildemo2;

/**
 *
 * @author Navilla
 */
class Mobilaja2 {
    String warna;
    int tahunProduksi;
    boolean power = false;
    int kopling;

    public Mobilaja2(){
    }
        public void turnOnMobil(){
            power = true;
        }
        public void turnOffMobil(){
            power = false;
        }
        public void setKopling(int newKopling){
            kopling = newKopling;
        }
        public void tambahLaju(){
            kopling++;
        }
        public void kurangiLaju(){
            kopling--;
        }
}      
    
public class MobilDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mobilaja2 step1 = new Mobilaja2 ();
        
        //memanggil atribut dan memberi nilai
        step1.warna = "Lemon";
        step1.tahunProduksi = 2010;
        step1.turnOnMobil();
        step1.setKopling(1);
        step1.tambahLaju();
        
        Mobilaja2 step2 = new Mobilaja2();
        step2.tambahLaju();
        step2.tambahLaju();
        step2.kurangiLaju();
        
        
        System.out.println("Warna Mobil:" + step1.warna);
        System.out.println("Tahun Produksi:" + step1.tahunProduksi);
        System.out.println("Stater Mobil: " + step1.power);
        System.out.println("Masukan Kopling:" + step1.kopling);
        System.out.println("Status kecepatan Mobil sekarang:" + step2.kopling);
    }  
}
