/*	This is a Java program written by LAU Ka Pui (12345678) */

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author cyrus
 */
public class Vaccine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int age;
        String contracted;
        int shotsRequired;
        
        Scanner keyboardInput = new Scanner(System.in);
        
        System.out.println("Please enter your age:");
        age = keyboardInput.nextInt();
        
        if (age <= 2)
            System.out.println("You do not need the vaccine");
        else if (age >= 3)
            System.out.println("Have you contracted COVID-ID before? (Y/N)");
            contracted = keyboardInput.next();
            if (contracted.equals("Y")) {
                if (age <= 11) {
                    shotsRequired = 1;
                    System.out.println("The number of shots required for you is:" + shotsRequired);
                } else if (age >= 12) {
                    shotsRequired = 2;
                    System.out.println("The number of shots required for you is:" + shotsRequired);
                }
            } else if (contracted.equals("N")) {
                if (age <= 11) {
                    shotsRequired = 2;
                    System.out.println("The number of shots required for you is:" + shotsRequired);
                } else if (age >= 12) {
                    shotsRequired = 3;
                    System.out.println("The number of shots required for you is:" + shotsRequired);
                }
            } else {
                System.out.println("Your should enter your answer by Y/N.");
            }
        }
    
}
