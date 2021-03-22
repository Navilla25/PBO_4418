/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgame;

/**
 *
 * @author Acer
 */
public class TestGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GamePlayer myhero = new GamePlayer();
        myhero.setDimension(20, 40);
        myhero.setPosition(60, 5);
        myhero.Run();
        
        System.out.println("Player width: "+ myhero.getWidth() +" and height: "
        + myhero.getHeight());
        System.out.println("Player position X: "+myhero.getX() + " and position Y: "
        + myhero.getY());
        myhero.Run(30);
        
        GameEnemy vale = new GameEnemy();
        vale.setDimension(20, 40);
        vale.setPosition(3, 6);
        vale.Run();
        System.out.println("Enemy width: "+ vale.getWidth() +" and height: "
        + myhero.getHeight());
        System.out.println("Enemy position X: "+vale.getX() + " and position Y: "
        + myhero.getY());
    }
    
}
