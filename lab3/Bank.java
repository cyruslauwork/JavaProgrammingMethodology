
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cyrus
 */
public class Bank {
    
    public static void print(double i) {
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        System.out.println("The interest is: $" + formatter.format(i));
    }
    
    public static void main(String[] args) {
        int deposit;
        int lengthOfDeposit;
        double interest;
        
        Scanner keyboardInput = new Scanner(System.in);
        
        System.out.println("Please enter a deposit amount:");
        deposit = keyboardInput.nextInt();
        System.out.println("Please enter the length of deposit in year(s):");
        lengthOfDeposit = keyboardInput.nextInt();
        
        if (deposit < 500000) {
            if (lengthOfDeposit == 1) {
                interest = (deposit * 0.02 * lengthOfDeposit);
                print(interest);
            } else if (lengthOfDeposit == 2) {
                interest = (deposit * 0.03 * lengthOfDeposit);
                print(interest);
            }
        } else if (deposit > 500000) {
            if (lengthOfDeposit == 1) {
                interest = (deposit * 0.04 * lengthOfDeposit);
                print(interest);
            } else if (lengthOfDeposit == 2) {
                interest = (deposit * 0.05 * lengthOfDeposit);
                print(interest);
            }
        }
    }
}