/* This is a Java program written by LAU Ka Pui (12345678) */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cyrus
 */
public class IDMatrixTest {
    final static int[][] m1 = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
    final static int[][] m2 = {{1, 0, 1}, {0, 1, 0}, {1, 0, 1}};
    final static int[][] m3 = {{1, 0, 0}, {0, 0, 0}, {0, 0, 1}};
    final static int[][] m4 = {{2, 0, 0}, {0, 2, 0}, {0, 0, 2}};
    final static int[][] m5 = {{1, 2, 2}, {2, 1, 2}, {2, 2, 1}};
    final static int[][] m6 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    final static int[][] m7 = {{1, 0, 0}, {0, 1, 0}, {0, 0, 0}};
    final static int[][] m8 = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
    final static int[][] m9 = {{1, 1, 1, 0}, {1, 1, 1, 0}, {1, 1, 1, 0}, {1, 1, 1, 0}};
    final static int[][] m10 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 1}, {0, 0, 0, 1}};
    
    final static IDMatrix idMatrix = new IDMatrix();
    
    private static void isID(int[][] arr2d, String arr2d_name) {
        System.out.printf("2D array %s %s an Identity Matrix.\n", arr2d_name, (idMatrix.isIdentity(arr2d)) ? "is" : "is not");
    }
        
    public static void main(String[] args) {
        isID(m1, "m1");
        isID(m2, "m2");
        isID(m3, "m3");
        isID(m4, "m4");
        isID(m5, "m5");
        isID(m6, "m6");
        isID(m7, "m7");
        isID(m8, "m8");
        isID(m9, "m9");
        isID(m10, "m10");
    }
}
