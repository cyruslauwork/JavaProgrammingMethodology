/*	This is a Java program written by LAU Ka Pui (12345678) */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cyrus
 */
public class Rectangle {
    
    public static void main(String[] args) {
        double rectLength;
        double rectWidth;
        
        rectLength = 100;
        rectWidth = 20.2;
        
        double rectArea;
        double rectPerimeter;
        
        rectArea = rectLength * rectWidth;
        rectPerimeter = (rectLength + rectWidth) * 2;
        
        String str = String.format("The area of rectangle: %s", rectArea);
        System.out.println(str);
        
        String str2 = String.format("The perimeter of rectangle: %s", rectPerimeter);
        System.out.println(str2);
    }
}
