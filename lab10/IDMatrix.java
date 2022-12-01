
import java.util.*;

/* This is a Java program written by LAU Ka Pui (12345678) */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cyrus
 */
public class IDMatrix {
    public boolean isIdentity(int[][] arr2d) {
        Map<Integer, Integer> strMap = new HashMap<Integer, Integer>();
                
        if (arr2d[0][0] == 0) {
            return false;
        }
        
        for (int i = 0; i < arr2d.length; i++) {
            for (int i2 = 0; i2 < arr2d[i].length; i2++) {
                int val = arr2d[i][i2];
                if (!strMap.containsValue(val)) {
                    strMap.put(i2, val);
                } else if (strMap.get(0) == val && i2 != i) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
