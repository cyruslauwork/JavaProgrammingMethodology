/* This is a java program written by LAU Ka Pui (12345678) */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cyrus
 */
public class ArrayMethod {

    public void meanOfArray(int[] x) {
        int total = 0;

        for (int i = 0; i <= x.length - 1; i++) {
            total += x[i];
        }
        
        System.out.println("The mean of the array is " + total/x.length);
    }
}
