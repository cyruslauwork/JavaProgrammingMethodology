/* This is a java program written by LAU Ka Pui (12345678)
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cyrus
 */
public class PrimeNumbers2 {

    static boolean isPrime(int n) {
        if (n < 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        int initial = 2;
        int last = 20;

        for (int i = initial; i <= last; i++) {
            if (isPrime(i)) {
                System.out.printf("%s: prime\n", i);
            } else {
                System.out.printf("%s: \n", i);
            }
        }
    }
}
