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
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    final static int EDAD_DESCUENTO = 30;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        double sueldo;
        boolean menor_30;
        
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(sc.nextLine());
        
        System.out.print("Ingrese su sueldo: ");
        sueldo = Double.parseDouble(sc.nextLine());
        
        menor_30 = false;
        
        if (edad < EDAD_DESCUENTO) {
            menor_30 = true;
        }
        
        if (sueldo < 10000) {
            System.out.println("El aporte sera de " + (menor_30 ? sueldo * 0.005 *1.2 : sueldo * 0.005));
        }else if (sueldo < 20000) {
            System.out.println("El aporte sera de " + (menor_30 ? sueldo * 0.01 * 1.2 : sueldo * 0.01));
        }else if (sueldo < 30000) {
            System.out.println("El aporte sera de " + (menor_30 ? sueldo * 0.02 * 1.2 : sueldo * 0.02 ));
        }else {
            System.out.println("El aporte sera de " + (menor_30 ? sueldo * 0.025 * 1.2 : sueldo * 0.02));
        }
        
    }
    
}
