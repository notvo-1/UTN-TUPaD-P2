/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

import java.util.Scanner;

/**
4. Calculadora de Descuento según categoría.
Escribe un programa que solicite al usuario el precio de un producto y
su categoría (A, B o C).
Luego, aplique los siguientes descuentos:
Categoría A: 10% de descuento
Categoría B: 15% de descuento
Categoría C: 20% de descuento
El programa debe mostrar el precio original, el descuento aplicado y el
precio final
Ejemplo de entrada/salida:
Ingrese el precio del producto: 1000
Ingrese la categoría del producto (A, B o C): B
Descuento aplicado: 15%
Precio final: 850.0
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    final static double A = 0.1, B = 0.15, C = 0.2; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio;
        char cat;
        
        precio = Funciones.validarDouble("Ingrese el precio del produtcto");
        System.out.print("Ingrese la categoria del producto (A,B o C) : ");
        cat = Character.toLowerCase(sc.next().charAt(0)); 
        
        if (cat =='a') {
            System.out.println("Descuento aplicado: " + A*100 + "%");
            System.out.println("Precio final: "+ (precio - precio*A));
        } else if (cat == 'b') {
            System.out.println("Descuento aplicado: " + B*100 + "%");
            System.out.println("Precio final: "+ (precio - precio*B));
        }else if (cat == 'c') {
            System.out.println("Descuento aplicado: " + C*100 + "%");
            System.out.println("Precio final: "+ (precio - precio*C));
        }else {
            System.out.println("No corresponde a una categoria.");
        }
    }
    
}
