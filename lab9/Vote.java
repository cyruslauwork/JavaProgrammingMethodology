
import java.util.Scanner;

/* This is a java program written by LAU Ka Pui (12345678) */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author cyrus
 */
public class Vote {

    public static void main(String[] args) {
        String[] candidates = {"Albert", "Ben", "Cindy"};
        int[] votes = new int[candidates.length];
        boolean stop = false;

        Scanner scanner = new Scanner(System.in);
        while (!stop) {
            System.out.println("Enter a number (1: Albert, 2 Ben, 3 Cindy) or -1 to end:");
            int input = scanner.nextInt();
            if (input == 1) {
                votes[0] += 1;
            } else if (input == 2) {
                votes[1] += 1;
            } else if (input == 3) {
                votes[2] += 1;
            } else if (input == -1) {
                stop = true;
            }
        }
        System.out.println("Albert : " + votes[0]);
        System.out.println("Ben : " + votes[1]);
        System.out.println("Cindy : " + votes[2]);
    }
}
