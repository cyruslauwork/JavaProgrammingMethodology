
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cyrus
 */
public class StaffTest {
    public static void main(String[] args) {
        Staff obj1 = new Staff();
        
        Scanner keyboardInput = new Scanner(System.in);
        
        System.out.println("Please enter the staff ID:");
        obj1.staffID = keyboardInput.next();
        System.out.println("Please enter the staff name:");
        obj1.staffName = keyboardInput.next();
        System.out.println("Please enter the monthly salary:");
        obj1.monthlySalary = keyboardInput.nextDouble();
        
        System.out.println("Staff ID: " + obj1.staffID);
        System.out.println("Staff name: " + obj1.staffName);
        System.out.printf("Monthly salary: $" + obj1.monthlySalary);
    }
}
