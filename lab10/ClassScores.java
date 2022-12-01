
import java.util.ArrayList;

/* This is a Java program written by LAU Ka Pui (12345678) */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author cyrus
 */
public class ClassScores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] classes_scores_arr = new int[4][6];
        double[] sumOfClasses = new double[4];
        double[] avgOfClasses = new double[4];
        
        ArrayList<int[]> arrList = new ArrayList<int[]>();
        int[] class1 = new int[6];
        int[] class2 = new int[6];
        int[] class3 = new int[6];
        int[] class4 = new int[6];
        
        for (int i = 0; i < 6; i++) {
            class1[i] = 50 + i;
            class2[i] = 90 - (i * 10);
            class3[i] = 60 + (i * 2);
            class4[i] = 90 + i;
        }
        
        arrList.add(class1);
        arrList.add(class2);
        arrList.add(class3);
        arrList.add(class4);
        
        for (int i = 0; i < 4; i++) {
            var arr = arrList.get(i);
            
            for (int i2 = 0; i2 < arr.length ; i2++) {
                classes_scores_arr[i][i2] = arr[i2];
            }
        }
        
        for (int i = 0; i < 4; i++) {
            var arr = classes_scores_arr[i];
            
            for (int i2 = 0; i2 < arr.length ; i2++) {
                sumOfClasses[i] += arr[i2];
            }
            
            avgOfClasses[i] = sumOfClasses[i] / arr.length;
            System.out.printf("Class %s average: %s\n", (i + 1), avgOfClasses[i]);
        }
    }
}
