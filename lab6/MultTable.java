
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cyrus
 */
public class MultTable {

    public static void main(String args[]) {
        boolean stop = false;
        int n;
        int count = 1;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        n = input.nextInt();
        
        while (!stop && count <= 9) {
            int result = n * count;
            System.out.printf("%s x %s   = %s\n", n, count,result);
            count++;
        }
    }
}
