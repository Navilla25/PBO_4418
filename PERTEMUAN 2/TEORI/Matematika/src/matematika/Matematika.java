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
public class Matematika {
    private int hasil = 0;
    
    Matematika(){
        
    }
    public int ditambah(int num1, int num2){
        hasil = num1 + num2;
        return hasil;
    }
    public int dikurangi(int num1, int num2){
        hasil = num1 - num2;
        return hasil;
    }
    public int dikali(int num1, int num2){
        hasil = num1 * num2;
        return hasil;
    }
    public int dibagi(int num1, int num2){
        hasil = num1 / num2;
        return hasil;
    }
    public int getNumber(){
        return hasil;
    }
}
