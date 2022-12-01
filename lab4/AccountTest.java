/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cyrus
 */
public class AccountTest {
    public static void main(String[] args) {
        Account obj1 = new Account();
        Account obj2 = new Account();
        
        obj1.customerName = "Mary";
        obj1.accountNumber = "11001";
        obj1.balance = 222.22;
        
        obj2.customerName = "C.C.K";
        obj2.accountNumber = "22002";
        obj2.balance = 8000.00;
        
        System.out.println("obj1 Customer Name: " + obj1.customerName);
        System.out.println("obj1 Account Number: " + obj1.accountNumber);
        System.out.println("obj1 Balance: $" + obj1.balance);
        
        System.out.println("obj2 Customer Name: " + obj2.customerName);
        System.out.println("obj2 Account Number: " + obj2.accountNumber);
        System.out.println("obj2 Balance: $" + obj2.balance);
    }
}
