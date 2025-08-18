/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1;

import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario ingresar su nombre y edad, y luego
los muestre en pantalla. Usa Scanner para capturar los datos
 * @author notvo
 */
public class Ejer_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nombre;
        int edad;
        
        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();
        
        System.out.println("Ingrese su edad");
        edad = Integer.parseInt(sc.nextLine());
        
        System.out.println("Su nombre es "+ nombre +" y tiene " + edad + " años.");
        
    }
    
}
