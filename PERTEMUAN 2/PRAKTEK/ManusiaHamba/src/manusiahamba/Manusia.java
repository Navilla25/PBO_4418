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
class Manusia {
    private String nama = "noname";
    private boolean punyaTV = false;
    private int jumlahTV = 0;
    public String tiviku;
    
    Manusia(){
    }
        Manusia(String nama){
            this.nama = nama;
        }
        public String getnamaSaya(){
            return nama;   
        }
        public TV beliTV(TV TV){
            this.punyaTV = true;
            this.jumlahTV++;
            return TV;
        }
        public void jualSemuaTV(){
            this.punyaTV = false;
            this.jumlahTV = 0;
        }
        public boolean cekTV(){
            return this.punyaTV;
        }
        public int getJumlahTV(){
            return this.jumlahTV;
        }
        
    
}
