/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycledemo;

/**
 *
 * @author Navilla
 */
class Bicycleaja{
    int speed = 0;
    int gear = 0;

    //method 
    void changeGear(int newValue){
        gear = gear + newValue;
        System.out.println("\nGear." + gear);            
    }
    void speedUp(int increment){
        speed = speed + increment;
        System.out.println("\nSpeed." + speed);
    }   
}
public class BicycleDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create Object
        Bicycleaja bike = new Bicycleaja();
        
        //memanggil atribut dan memberi nilai
        bike.speed = 5;
        bike.gear = 1;
        
        //memanggil method dan menunjuk nilai parameter
        bike.speedUp(3);
        bike.changeGear(4);
    }
}
