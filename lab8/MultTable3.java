/* This is a java program written by LAU Ka Pui (12345678)
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cyrus
 */
public class MultTable3 {

    public static void main(String args[]) {
        int col;
        int row;

        for (row = 0; row <= 9; row++) {

            if (row == 0) {
                System.out.print("\tX\t");
                for (int n = 1; n <= 9; n++) {
                    System.out.printf("\t%s\t", n);
                }
                System.out.println();
            } else {
                for (int n = 0; n <= 9; n++) {
                    if (n == 0) {
                        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.printf("\t%s\t", row);
                    } else if (n == 9) {
                        System.out.printf("|\t%s\t|", n * row);
                    } else {
                        System.out.printf("|\t%s\t", row * n);
                    }
                }
                System.out.println();
                if (row == 9) {
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                }
            }
        }
    }
}
