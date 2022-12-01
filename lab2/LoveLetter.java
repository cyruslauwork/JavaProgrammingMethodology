
import java.util.Scanner;

/* ​This is a Java program written by LAU Ka Pui (12345678) */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author cyrus
 */
public class LoveLetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String firstName;
        String firstNameLover;
        String knownYrs;
        
        Scanner keyboardInput = new Scanner(System.in);
        
        System.out.println("Please enter your first name here:");
        firstName = keyboardInput.nextLine();
        System.out.println("Your first name is " + firstName);
        
        System.out.println("Please enter your lover's first name here:");
        firstNameLover = keyboardInput.nextLine();
        System.out.println("Your lover's first name is " + firstNameLover);
        
        System.out.println("Please enter the number of year(s) you have know your lover:");
        knownYrs = keyboardInput.nextLine();
        System.out.println("You have know your lover for " + knownYrs + " year(s)");
        
        System.out.println("Dear " + firstNameLover + ",");
        System.out.println();
        System.out.println("I want to know how you think about me.");
        System.out.println("I have been admiring you for the past " + knownYrs);
        System.out.println("years.");
        System.out.println();
        System.out.println("Please select the answer:");
        System.out.println("A) Yes  B) Yes");
        System.out.println();
        System.out.println("Love,");
        System.out.println(firstName);
    }
    
}
