/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportasi;

import transportasi.Mobil;
import transportasi.Sepeda;
/**
 *
 * @author Navilla
 */

public class Transportasi{
    public static void main(String[] args){
        
        Mobil mm = new Mobil();
        mm.goStraight();
        mm.turnRight();
        mm.turnLeft();
        mm.turnLeft();
        mm.turnLeft();
        mm.turnLeft();
        
        
        Sepeda bell = new Sepeda();
        bell.ringBell();
    }   
}
