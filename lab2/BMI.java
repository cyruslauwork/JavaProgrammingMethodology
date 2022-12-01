
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cyrus
 */
public class BMI {
    public static void main(String[] args) {
        String name;
        Double height;
        Double weight;
        Double BMI;
        
        Scanner keyboardInput = new Scanner(System.in);
        
        System.out.println("Please enter your name:");
        name = keyboardInput.next();
        System.out.println("Your name is " + name);
        
        System.out.println("Please enter your body height (m):");
        height = keyboardInput.nextDouble();
        System.out.println("Your body height " + height);
        
        System.out.println("Please enter your body weight (kg):");
        weight = keyboardInput.nextDouble();
        System.out.println("Your body weight " + weight);
        
        BMI = weight / (height * height);
        System.out.println("Name: " + name);
        System.out.println("BMI: " + BMI);
        }
}
