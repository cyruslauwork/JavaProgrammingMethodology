
import java.util.Scanner;

/* This is a java program written by LAU Ka Pui (12345678) */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author cyrus
 */
public class ArrayOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int length = 10;
        int[] intArr = new int[length];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter " + length + " numbers.");
        for (int i = 0; i < length; i++) {
            System.out.println("Num " + (i + 1) + " : ");
            intArr[i] = scanner.nextInt();
        }

        System.out.println("\n\nThe array in input order.");
        for (int i = 0; i < length; i++) {
            System.out.print(intArr[i] + " ");
        }

        System.out.println("\n\nThe array in reverse order.");
        for (int i = (length - 1); i >= 0; i--) {
            System.out.print(intArr[i] + " ");
        }
    }

}
