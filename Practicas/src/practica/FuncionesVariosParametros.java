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
public class FuncionesVariosParametros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1, num2;
    
        System.out.print("Ingrese el primer numero: ");
        num1 = Integer.parseInt(sc.nextLine());
        
        System.out.print("Ingrese el segudno numero: ");
        num2 = Integer.parseInt(sc.nextLine());
        
        System.out.println("El resto es : " + resto(num1, num2));
        System.out.println("el resto es: " + num1%num2);
        
        if (esMultiplo(num1, num2)) {
            System.out.println("El numero "+ num1 + " es multiplo del numero " + num2);
        }
    }
    static int resto(int num1, int num2){
        return num1 - (num1/num2)*num2;
    }
    
    static boolean esMultiplo(int num1, int num2){
        return resto(num1, num2) == 0;
    }
}
