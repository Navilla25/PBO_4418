/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manusiahamba;

/**
 *
 * @author Acer
 */
class TV {
    private int channel = 1;
    private int volumeLevel = 1;
    private boolean on = false;
    
    TV(){
    }  
        public void turnOn(){
        on = true;
        }
        public void turnOff(){
            on = false;
        }
        public void setChannel (int newChannel){
            
                channel = newChannel;
        }
        //get channel
        public int getChannel(){
            return this.channel;
        }
        public void setVolume (int newVolumeLevel){
            
                volumeLevel = newVolumeLevel;
        }
        public void channelUp(){   
            channel++;
        }
        public void channelDown(){
            channel--;
        }
        public void volumeUp(){
            volumeLevel++;
        }
        public void volumeDown(){
            volumeLevel--;
        }
        //get volume level
        public int getVolumeLevel(){
            return this.volumeLevel;
        }  
}
