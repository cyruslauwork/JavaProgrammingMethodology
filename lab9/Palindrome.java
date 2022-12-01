/* This is a java program written by LAU Ka Pui (12345678) */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cyrus
 */
public class Palindrome {

    public boolean isPalindrome(int[] arr) {
        boolean isPal = true;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[n - (i + 1)]) {
                isPal = false;
            }
        }
        return isPal;
    }
}
