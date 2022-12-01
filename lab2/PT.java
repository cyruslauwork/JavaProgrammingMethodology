
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cyrus
 */
public class PT {
    public static void main(String[] args) {
        Double sideA;
        Double sideB;
        Double sideC;
        
        Scanner keyboardInput = new Scanner(System.in);
        
        System.out.println("It is a Pythagorean Theorem practice.");
        
        System.out.println("Please enter the length of side a:");
        sideA = keyboardInput.nextDouble();
        System.out.println("The side a length is " + sideA);
    
        System.out.println("Please enter the length of side b:");
        sideB = keyboardInput.nextDouble();
        System.out.println("The side b length is " + sideB);
        
        sideC = (sideA * sideA) + (sideB * sideB);
        sideC = Math.sqrt(sideC);
        
        System.out.println("The result of c is " + sideC);
    }
}
