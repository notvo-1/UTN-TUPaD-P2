/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

import java.util.Scanner;

/**
 * 8. C�lculo del Precio Final con impuesto y descuento. Crea un m�todo
 * calcularPrecioFinal(double impuesto, double descuento) que calcule el precio
 * final de un producto en un e-commerce. La f�rmula es: PrecioFinal =
 * PrecioBase + (PrecioBase�Impuesto) ? (PrecioBase�Descuento) PrecioFinal =
 * PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times Descuento)
 * Desde main(), solicita el precio base del producto, el porcentaje de impuesto
 * y el porcentaje de descuento, llama al m�todo y muestra el precio final.
 * Ejemplo de entrada/salida: Ingrese el precio base del producto: 100 Ingrese
 * el impuesto en porcentaje (Ejemplo: 10 para 10%): 10 Ingrese el descuento en
 * porcentaje (Ejemplo: 5 para 5%): 5 El precio final del producto es: 105.0
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double impuesto, descuento, precioFinal, precioBase;
        
        System.out.print("Ingrese el precio base del producto: ");
        precioBase = Double.parseDouble(sc.nextLine());
        
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        impuesto = Double.parseDouble(sc.nextLine());
        
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo 5 para 5%): ");
        descuento = Double.parseDouble(sc.nextLine());
        
        precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.println("El precio final del producto es: "+precioFinal);
    }

    static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioFinal = precioBase + (precioBase*(impuesto / 100)) - (precioBase*(descuento/100));
        return precioFinal;
    }
}
