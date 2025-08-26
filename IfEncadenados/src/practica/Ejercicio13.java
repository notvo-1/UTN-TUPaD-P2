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
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    final static char CARACTER = 'X';
    
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        int ancho, largo;
        
        System.out.print("Ingrese el primer numero entero positivo para el ancho: ");
        ancho = Integer.parseInt(sc.nextLine());
        
        
        while (ancho <= 0) {            
            System.out.print("Error. Ingrese el segundo numero entero positivio para el largo: ");
            ancho = Integer.parseInt(sc.nextLine());        
        }
        
        System.out.print("Ingrese el segundo numero entero positivio para el largo: ");
        largo = Integer.parseInt(sc.nextLine());
        
        while (largo <= 0) {            
            System.out.print("Error. Ingrese el segundo numero entero positivio para el largo: ");
            largo = Integer.parseInt(sc.nextLine());
            
        }
            
        for (int i = 1; i <= largo; i++) {
            for (int j = 1; j <= ancho; j++) {
                System.out.print(CARACTER);
            }
            System.out.println("");
        }


        }
    }
    
