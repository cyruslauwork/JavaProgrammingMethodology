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
        Account maryAccount = new Account();
        Account cckAccount = new Account();
        
        maryAccount.customerName = "Mary";
        maryAccount.accountNumber = "11001";
        maryAccount.balance = 222.22;
        
        cckAccount.customerName = "C.C.K.";
        cckAccount.accountNumber = "22002";
        cckAccount.balance = 8000.00;
        
        System.out.println(maryAccount.getReport());
        System.out.println(cckAccount.getReport());
        
        maryAccount.withdraw(100);
        cckAccount.deposit(10000);
        
        System.out.println(maryAccount.getReport());
        System.out.println(cckAccount.getReport());
    }
}
