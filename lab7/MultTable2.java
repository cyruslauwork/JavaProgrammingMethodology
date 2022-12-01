
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cyrus
 */
public class MultTable2 {

    public static void main(String args[]) {
        boolean stop = false;
        int n;
        int count = 1;
        
        while (!stop) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter a number:");
            n = input.nextInt();
        
            if (n > 0 && n <= 9) {
                while (count <= 9) {
                    int result = n * count;
                    System.out.printf("%s x %s   = %s\n", n, count,result);
                    count++;
                }
            } else if (n == -1) {
                stop = true;
            }
            count = 1;
        }
    }
}
