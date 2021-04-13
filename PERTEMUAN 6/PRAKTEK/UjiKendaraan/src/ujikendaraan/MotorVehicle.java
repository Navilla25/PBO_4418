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
public class MotorVehicle extends Vehicle{
    int sizeofEngine = 1;
    String licencePlate = "H 21 IDN";
    
    public MotorVehicle(){
        
    }
    public MotorVehicle(int sizeofEngine,String licencePlate ){
        this.sizeofEngine = sizeofEngine;
        this.licencePlate = licencePlate;
    }
    public int getSizeofEngine(){
      return this.sizeofEngine;  
    }
    public String getLicencePlate(){
        return this.licencePlate;
    }
}
