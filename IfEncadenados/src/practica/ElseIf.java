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
public class ElseIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num;
        String resultado;
        
        System.out.print("Ingrese un numero entero: ");
        num = Integer.parseInt(input.nextLine());
        
        if (num == 0) {
            resultado = "Neutro";
        }else if (num < 0) {
            resultado = "Negativo";
        }else {
            resultado = "Positivo";
        }
        System.out.println("El numero ingresado es: "+ resultado);
    }
    
}
