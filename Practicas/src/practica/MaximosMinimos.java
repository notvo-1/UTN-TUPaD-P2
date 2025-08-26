/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author notvo
 */
public class MaximosMinimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        int cantNumeros, num;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        System.out.print("Ingrese la cantidad de numeros: ");
        cantNumeros = Integer.parseInt(sc.nextLine());
        
        for (int i = 1; i <= cantNumeros; i++) {
            System.out.print("Ingrese el numero numero "+i+": ");
            num = Integer.parseInt(sc.nextLine());
            
            if (num > max) {
                max = num;
            }
            
           if (num < min) {
                min = num;
            }
        }
        
        System.out.println("El maximo es: " + max);
        System.out.println("El minimo es. " + min);
        
    }
    
}
