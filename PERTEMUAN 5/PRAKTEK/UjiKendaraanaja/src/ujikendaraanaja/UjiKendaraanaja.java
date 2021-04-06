/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujikendaraanaja;

/**
 *
 * @author Navilla
 */
public class UjiKendaraanaja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle monyet = new Vehicle();
        System.out.println("Laju:" +monyet.speed);
        System.out.println("Warna:" +monyet.color);
        monyet.goStraight();
        monyet.turnRight();
        monyet.turnLeft();
        
        Bicycle bell = new Bicycle();
        bell.ringBell();
        
        MotorVehicle bison = new MotorVehicle();
        System.out.println("Size of Engine: "+ bison.getSizeofEngine());
        System.out.println("Licence Plate: "+bison.getLicencePlate());
        
        
    }
    
}
