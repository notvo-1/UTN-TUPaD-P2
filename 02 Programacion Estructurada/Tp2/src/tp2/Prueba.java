/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

import java.util.Arrays;

/**
 *
 * @author notvo
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {1,2,3,4,6};
        int suma = 0;
        System.out.println(array.length);
        for (int i = 0; i < array.length-1; i++) {
            suma+=array[i];
            System.out.println(array[i]);
        }
        System.out.println(suma);
        
        }
    }
    
