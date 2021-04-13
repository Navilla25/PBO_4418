/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujikendaraan;

/**
 *
 * @author Acer
 */
public class UjiKendaraan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle mon = new Vehicle();
        System.out.println("Laju:" +mon.speed);
        System.out.println("Warna:" +mon.color);
        mon.goStraight();
        mon.turnRight();
        mon.turnLeft();
        
        Bicycle bell = new Bicycle();
        bell.ringBell();
        
        MotorVehicle bison = new MotorVehicle();
        System.out.println("Size of Engine: "+ bison.getSizeofEngine());
        System.out.println("Licence Plate: "+bison.getLicencePlate());
        
        Car mob = new Car();
        mob.setSeatBelt(2);
        System.out.println("SeatBelt :"+ mob.getSeatBelt());
        
        MotorCycle motor = new MotorCycle();
        motor.setGearFoot(1);
        System.out.println("GearFoot:"+ motor.getGearFoot());
        
    }
}
