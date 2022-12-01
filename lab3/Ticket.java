
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
    public static void main(String[] args) {
        int ticket;
        double price;
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        
        Scanner keyboardInput = new Scanner(System.in);
        
        System.out.println("Please enter the number of ticket would you buy:");
        ticket = keyboardInput.nextInt();
        
        if (ticket < 6) {
            price = ticket * 100;
            System.out.println("The total ticket price: $" + formatter.format(price));
        } else if (ticket < 11 && ticket > 5) {
            price = ticket * 95;
            System.out.println("The total ticket price: $" + formatter.format(price));
        } else if (ticket >= 11) {
            price = ticket * 90;
            System.out.println("The total ticket price: $" + formatter.format(price));
        }
    }
}
