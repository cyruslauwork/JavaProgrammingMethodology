
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
public class numberTriangle {

    public static void main(String args[]) {
        int n;

        System.out.println("Please enter a number of row:");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        int[] arr = new int[n];

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    arr[i] = 1;
                } else {
                    arr[i] = i + 1;
                }
                for (int i2 = 0; i2 <= i; i2++) {
                    System.out.print(arr[i2]);
                }
                if (i == n - 1) {
                    System.out.printf("\t%s", n);
                }
                System.out.println();

            }
        } else {
            System.out.println("Please enter a number of row that greater than 0!");
        }

    }
}
