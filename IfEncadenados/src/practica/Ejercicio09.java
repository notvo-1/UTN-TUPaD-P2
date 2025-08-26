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
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        
        int cant;
        
        System.out.println("Ingrese la cantidad de personas: ");
        cant = Integer.parseInt(sc.nextLine());
        
        
        if (cant > 0) {
            int edad;
            int mayor = 0, menor = 0;
            
            for (int i = 1; i <= cant ; i++) {
                System.out.print("Ingrese la edad de la persona n° " + i + ": ");
                edad = Integer.parseInt(sc.nextLine());
                
                if (edad < 18 && edad >= 0) {
                    menor++;
                }else if (edad >= 18) {
                    mayor++;
                }else {
                    System.out.println("Igrese una edad valida");
                }
 
            }
            
            System.out.println("El promedio de mayores de edad es : " + ((double) mayor / cant * 100) + "%.");
            System.out.println("El promedio de menores de edad es : " + ((double) menor / cant * 100) + "%.");
            
        }else {
            System.out.println("Ingrese una cantidad valida.");
        }
        
    }
    
}
