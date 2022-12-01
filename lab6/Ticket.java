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
public class Ticket {
    
    public static void main(String args[]) {
        int ticket;
        double total;
        boolean stop = false;
        String answer;
        
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        
        while (!stop) {
            System.out.println("Please enter the number of ticket would you buy:");
            ticket = input.nextInt();
        
            if (ticket < 6) {
                total = ticket * 100;
                System.out.println("The total ticket price: $" + formatter.format(total));
            } else if (ticket < 11 && ticket > 5) {
                total = ticket * 95;
                System.out.println("The total ticket price: $" + formatter.format(total));
            } else if (ticket >= 11) {
                total = ticket * 90;
                System.out.println("The total ticket price: $" + formatter.format(total));
            }
            
            System.out.println("Do you want to buy more tickets? (Y/N)");
            answer = input2.nextLine();
            if (answer.equals("N")) {
                stop = true;
            }
        }
    }
}
