/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;


/**
 *
 * @author notvo
 */

import java.util.Arrays;
import java.util.Scanner;
public class Arr {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeo = 2;
        int[] lista;
        lista = new int[8];
        String[] nombres = new String[10];
        
        int [] lista2 = {1,2,3,4,5,6};
        
        System.out.println(lista);
        System.out.println(lista2[0]);
        
        System.out.println(lista2.length);
        
        for (int i = 0; i < lista2.length; i++) {
            int j = lista2[i];
            System.out.print(j + " ");
            
        }
        System.out.println("");
        System.out.println(Arrays.toString(lista));
        
        for (int i = 0; i < nombres.length; i++) {
            String j = nombres[i];
            System.out.print(j + " ");
            
        }
        System.out.println("");
        
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre numeo " + (i+1) + ": ");
            nombres[i] = sc.nextLine();
        }
        
        System.out.println("");
        System.out.println(Arrays.toString(nombres));
    }
    
}
