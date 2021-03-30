/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameenvironment;

/**
 *
 * @author Acer
 */
public class TestGame {
    public static void main(String[] args) {
        
        GamePlayer myhero = new GamePlayer();
        myhero.setDimension(10, 10);
        myhero.setPosition(5, 220);
        System.out.println("Posisi Player: "+myhero.getX()+","+myhero.getY());
        myhero.Run(12);
        System.out.println("Posisi Player: "+myhero.getX()+","+myhero.getY());
        
        GamePlayer myhero2 = new GamePlayer();
        myhero2.setDimension(12, 20);
        myhero2.setPosition(5, 5);
        
        GameEnemy jonson = new GameEnemy();
        jonson.setDimension(12, 20);
        jonson.setPosition(5, 5);
        
        GameEnvironment scene = new GameEnvironment();
        scene.addPlayer(myhero);
        scene.addPlayer(myhero);
        scene.addPlayer(myhero2);
        scene.getAllPlayer();
        scene.removePlayer(myhero);
        scene.getAllPlayer();
        scene.addEnemy(jonson);
        scene.Interaction();
    }

 
}
