
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author cyrus
 */
public class Temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int temperature;
        
        Scanner keyboardInput = new Scanner(System.in);
        
        System.out.println("Please enter the temperature (°C):");
        temperature = keyboardInput.nextInt();
//        System.out.println("The temperature is" + temperature + "°C");
        
        if (temperature < 36) {
            System.out.println("Too low. Tell him how to get warm. He can go to school.");
        } else if (36 <= temperature && temperature < 38) {
            System.out.println("Normal. He can go to school.");
        } else if (38 <= temperature && temperature < 39) {
            System.out.println("Fever. Stay at home and get some rest.");
        } else if (39 <= temperature) {
            System.out.println("High fever. He should see a doctor.");
        }
    }
    
}
