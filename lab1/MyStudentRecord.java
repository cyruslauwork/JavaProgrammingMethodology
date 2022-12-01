/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cyrus
 */
public class MyStudentRecord {
    public static void main(String[] args) {
        String fullname = "LAU Ka Pui";
        String studentID = "12345678";
        String progName = "Hidden";
        int currentYrOfStudy = -12345678;
        
        String str = String.format("Hello all! My name is %s. My student ID is %s.", fullname, studentID);
        System.out.println(str);
        
        String str2 = String.format("I study %s in HSUHK and I am in year %d.", progName, currentYrOfStudy);
        System.out.println(str2);
        
        System.out.println("See you all in class.");
    }
}
