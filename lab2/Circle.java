import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cyrus
 */
public class Circle {
    public static void main(String[] args) {
        double radius;
        double area;
        double circumference;
        
        Scanner keyboardInput = new Scanner(System.in);
        
        System.out.println("Please enter the radius:");
        radius = keyboardInput.nextDouble();
        System.out.println("The radius is " + radius);
        
        area = Math.PI * radius * radius;
        System.out.println("The area is " + area);
        
        circumference = 2 * Math.PI * radius;
        System.out.println("The circumference is " + circumference);
    }
}
