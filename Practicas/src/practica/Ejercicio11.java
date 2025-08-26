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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    final static String ESCAPE = "*";
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        int edad, count=1;
        int masJoven = Integer.MAX_VALUE;
        String nombre, nombreJoven = "";
        
        System.out.print(count + " Ingrese el nombre de la persona: ");
        nombre = sc.nextLine();
                
        
        while (!nombre.equalsIgnoreCase(ESCAPE)){
            System.out.print(count + " Ingrese la edad de la persona: ");
            edad = Integer.parseInt(sc.nextLine());
            while (edad < 0) {                
                System.out.print("Eror, Ingrese la edad de la persona: ");
                edad = Integer.parseInt(sc.nextLine());
            }
            
            if (edad < masJoven) {
                nombreJoven = nombre;
                masJoven = edad;
            }
            count++;
            System.out.print(count + " Ingrese el nombre de la persona o \"*\" para salir: ");
            nombre = sc.nextLine();
            
    }
        System.out.println("La persona mas joven es "+ nombreJoven + " y tiene " + masJoven + " años." );
    }
    
}
