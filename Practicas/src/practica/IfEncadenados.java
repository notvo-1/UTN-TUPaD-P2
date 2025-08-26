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
public class IfEncadenados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        String resultado;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un numero entero: ");
        num = Integer.parseInt(input.nextLine());
        
        if (num != 0) {  
            if (num > 0) {
                resultado = "Positivo";
            } else {
                resultado = "Negativo";
            }
        } else {
            resultado = "Neutro";
        }
        System.out.println("El numero ingresado es " + resultado);
    }
    
}
