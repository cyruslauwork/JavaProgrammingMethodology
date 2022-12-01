import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cyrus
 */
public class StatX {
    
    public static void main(String args[]) {
        int count = 0;
        double n;
        boolean stop = false;
        double total = 0;
        double average;
                    
        Scanner input = new Scanner(System.in);
        
        while (!stop) {
            System.out.println("Please enter a number:");
            n = input.nextDouble();
            
            if (n != -1) {
                total += n;
            } else {
                average = total/count;
                System.out.printf("The total is %s and the average is %s.", total, average);
                stop = true;
            }
            count++;
        }
    }
}
