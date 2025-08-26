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
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    final static int EDAD_MINIMA = 18;

    public static void main(String[] args) {
        int edad;
        char categoria;
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());

        System.out.print("Ingrese la categoria (A,B,C,D,E): ");
        categoria = input.nextLine().charAt(0);

        if (edad >= EDAD_MINIMA && (categoria == 'A' || categoria == 'a')) {
            System.out.println("Puede conducir una ambulacia");
        } else if (categoria != 'A') {
            System.out.println("No tiene la categoria requerida");
        } else {
            System.out.println("NO tiene la edad suficiente");
        }
    }
}
