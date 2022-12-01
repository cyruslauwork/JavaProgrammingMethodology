
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cyrus
 */
public class PrimeNumber {
    static boolean isPrime(int n) {
        if (n < 1)
            return false;
        
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        
        return true;
    }
            
    public static void main(String args[]) {
        int n;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        n = input.nextInt();
        
        if (isPrime(n)) {
            System.out.printf("%s is a prime number.", n);
        } else {
            System.out.printf("%s is not a prime number.", n);
        }
    }
}