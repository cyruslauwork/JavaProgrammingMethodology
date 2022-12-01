/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author cyrus
 */
public class Account {
    public String customerName;
    public String accountNumber;
    public double balance;
    
    public void deposit(int val) {
        balance = balance + val;
    }
    
    public void withdraw(int val) {
        balance = balance - val;
    }
    
    public String getReport() {
        return "\n######################## Account Report ########################\n" + 
                "Name: " + customerName + ". Account Number: " + accountNumber + ". Balance: " + balance + "." + 
                "\n######################## End of Report ########################\n";
    }
    
}
