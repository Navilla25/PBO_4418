/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecircle;

/**
 *
 * @author Navilla
 */
public class TestSimpleCircle {
    public static void main(String[] args) {
        // Create a circle with radius/
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The area of the first circle of radius "
        + circle1.radius + " is " + circle1.getArea());
        System.out.println("The perimeter of the first circle of radius "
        + circle1.radius + " is " + circle1.getPerimeter());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("The area of the second circle of radius "
        + circle2.radius + " is " + circle2.getArea());  
        System.out.println("The perimeter of the second circle of radius "
        + circle2.radius + " is " + circle2.getPerimeter());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        SimpleCircle circle3 = new SimpleCircle(125);
        System.out.println("The area of the third circle of radius "
        + circle3.radius + " is " + circle3.getArea());
        System.out.println("The perimeter of the third circle of radius "
        + circle3.radius + " is " + circle3.getPerimeter());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // Modify circle radius/
        circle2.radius = 100; //or setRadius(100) /
        System.out.println("Modify the radius of the second circle ");
        System.out.println("***************************************************");
        System.out.println("The area of the  second circle of radius "
        + circle2.radius + " is " + circle2.getArea());
        System.out.println("The perimeter of the second circle of radius "
        + circle2.radius + " is " + circle2.getPerimeter());
    }   
}
