
import java.util.Scanner;

/* This is a java program written by LAU Ka Pui (12345678)
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author cyrus
 */
public class SumOfFives {

    private static final int std = 4;
    private static final int asm = 5;

    public static void main(String args[]) {

        for (int i = 0; i < std; i++) {
            System.out.println("Enter the five scores of Student " + (i + 1) + " :");
            int[] arr = new int[asm];
            int sum = 0;
            
            for (int i2 = 0; i2 < asm; i2++) {
                Scanner scanner = new Scanner(System.in);
                int input = scanner.nextInt();
                arr[i2] = input;
                sum = sum + input;
            }
            
            System.out.println("The total score is " + sum);
        }
    }
}
