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
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        int num;
        
        System.out.print("Ingrese un numero entre 1 y 10: ");
        num = Integer.parseInt(sc.nextLine());
        
        if (num >= 1 && num <= 10) {
            for (int count = 1; count <= 10; count++) {
                System.out.println(num + " x "+ count+ " = " + (count * num));
            }
        }else {
            System.out.println("ERROR. Ingrese un numero valido");
        }
        
    }
    
}
