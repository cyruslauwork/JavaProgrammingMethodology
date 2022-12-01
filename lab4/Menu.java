/*	This is a Java program written by LAU Ka Pui (12345678) */

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cyrus
 */
public class Menu {
    public static void main(String[] args) {
        int choice;
        
        Scanner keyboardInput = new Scanner(System.in);
        
        System.out.println("1. Sandwich - $2.5");
        System.out.println("2. Mexican Tacos - $1.5");
        System.out.println("3. Drinks - $1.5");
        System.out.println("4. Burger - $2.5");
        System.out.println("5. Hotdog - $2.5");
        System.out.println("6. Pizza - $3.5");
        
        System.out.println("Please enter your choice by number only.");
        choice = keyboardInput.nextInt();
        
        if (choice == 1)
            System.out.println("1. Sandwich - $2.5");
        else if (choice == 2)
            System.out.println("2. Mexican Tacos - $1.5");
        else if (choice == 3)
            System.out.println("3. Drinks - $1.5");
        else if (choice == 4)
            System.out.println("4. Burger - $2.5");
        else if (choice == 5)
            System.out.println("5. Hotdog - $2.5");
        else if (choice == 6)
            System.out.println("6. Pizza - $3.5");
    }
}
