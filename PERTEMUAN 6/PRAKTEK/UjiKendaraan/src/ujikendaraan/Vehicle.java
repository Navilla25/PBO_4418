/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujikendaraan;

/**
 *
 * @author Navilla 
 */
class Vehicle {
    double speed = 0;
    String color = "Skyblue";
    
    public Vehicle(){
    
    }
    public void goStraight(){
        System.out.println("Maju...");  
    }
    public void turnLeft(){
        System.out.println("Belok Kiri say...");
    }
    public void turnRight(){
        System.out.println("Belok Kanan say...");
    }
    public double Laju(){
        return speed;
    }
    public String Warna(){
        return color;
    }
}
