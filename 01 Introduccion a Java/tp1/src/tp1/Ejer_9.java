/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1;

import java.util.Scanner;

/**
 * Corrige el siguiente código para que funcione correctamente. Explica qué error
tenía y cómo lo solucionaste.
 * @author notvo
 */
public class Ejer_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        /*String nombre = scanner.nextInt(); El Error es que estamos utilizando el metodo nextInt cuando lo que queremos ingresar es un String. Deberia usarse el metodo nextLine()*/
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre);
    }
    
}
