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
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        System.out.print("Ingrese un numero entero positivo: ");
        numero = Integer.parseInt(sc.nextLine());
        if (numero > 0) {
            
            if (numero%2 != 0) {
                numero = numero -1;
            }
            int count;
            count = numero;
            while (count >= 0) {
                System.out.print(count + " ");
                count -= 2;
            }
        }else{
            System.out.println("El numero debe ser positivo");
        }
        
        System.out.println("chau");
    }
    
}
