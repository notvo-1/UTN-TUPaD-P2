/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

import java.util.Scanner;

/**
 * 11. Cálculo de descuento especial usando variable global. Declara una
 * variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un método
 * calcularDescuentoEspecial(double precio) que use la variable global para
 * calcular el descuento especial del 10%. Dentro del método, declara una
 * variable local descuentoAplicado, almacena el valor del descuento y muestra
 * el precio final con descuento. Ejemplo de entrada/salida: Ingrese el precio
 * del producto: 200 El descuento especial aplicado es: 20.0 El precio final con
 * descuento es: 180.0
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    final static double DESCUENTO = 0.1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio;
        
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(sc.nextLine());
        
        calcularDescuentoEspecial(precio);
    }
    static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado = DESCUENTO;
        double descuentoEspecial = precio * descuentoAplicado;
        double precioFinal = precio - descuentoEspecial;
        System.out.println("El descuento especial aplicado es: "+descuentoEspecial );
        System.out.println("El precio final con descuento es: "+precioFinal);
    }
}

