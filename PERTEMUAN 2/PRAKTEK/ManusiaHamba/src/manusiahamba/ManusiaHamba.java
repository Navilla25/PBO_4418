/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manusiahamba;

/**
 *
 * @author Navilla
 */
public class ManusiaHamba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manusia person1 = new Manusia("Superman");
        System.out.println(person1.getnamaSaya());
        TV tvku = new TV();
        person1.beliTV(tvku);
        System.out.println(person1.cekTV());
        System.out.println("Jumlah TV:" + person1.getJumlahTV());
        person1.jualSemuaTV();
        System.out.println(person1.cekTV());
        System.out.println("Jumlah TV:" +person1.getJumlahTV());
                
    }
    
}
