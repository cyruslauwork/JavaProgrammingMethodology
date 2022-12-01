/* This is a java program written by LAU Ka Pui (12345678) */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cyrus
 */
public class PalindromeTest {

    public static void main(String[] args) {
        int[] x1 = {1, 2, 3, 2, 1};
        int[] x2 = {3, 2, 2, 3};
        int[] x3 = {2, 2, 2, 3};

        Palindrome p = new Palindrome();

        System.out.println(p.isPalindrome(x1));
        System.out.println(p.isPalindrome(x2));
        System.out.println(p.isPalindrome(x3));
    }
}
