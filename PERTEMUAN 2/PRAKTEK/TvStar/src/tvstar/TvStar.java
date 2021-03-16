/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvstar;

/**
 *
 * @author Acer
 */
public class TvStar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tv tv1 = new Tv();
        tv1.turnOn();
        tv1.setChannel(65);
        tv1.setVolume(3);
        
        Tv tv2 = new Tv();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        tv2.volumeUp();
        
        System.out.println("tv1's channel is " + tv1.getChannel()
        + " and volume level is " + tv1.getVolumeLevel());
        System.out.println("tv2's channel is " + tv2.getChannel()
        + " and volume level is " + tv2.getVolumeLevel());
    }
    
}
