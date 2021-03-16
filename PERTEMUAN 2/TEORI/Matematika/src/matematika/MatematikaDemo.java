/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematika;

/**
 *
 * @author Navilla
 */
public class MatematikaDemo {
    public static void main(String[] args) {
        Matematika in1 = new Matematika();
        in1.ditambah(20, 20);
        System.out.println("Hasil Pertambahan:" + in1.getNumber());
        
        in1.dikurangi(10, 5);
        System.out.println("Hasil Pengurangan:" + in1.getNumber());
        
        in1.dikali(10, 20);
        System.out.println("Hasil Perkalian:" + in1.getNumber());
        
        in1.dibagi(20, 2);
        System.out.println("Hasil Pembagian:" + in1.getNumber());
        
    }
    
}
