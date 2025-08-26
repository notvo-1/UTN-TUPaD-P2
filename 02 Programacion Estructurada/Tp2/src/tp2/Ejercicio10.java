/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

import java.util.Scanner;

/**
10. Actualización de stock a partir de venta y recepción de productos.
Crea un método actualizarStock(int stockActual, int cantidadVendida,
int cantidadRecibida), que calcule el nuevo stock después de una venta y
recepción
de productos:
NuevoStock = StockActual ? CantidadVendida + CantidadRecibida
NuevoStock = CantidadVendida + CantidadRecibida
Desde main(), solicita al usuario el stock actual, la cantidad vendida y la
cantidad recibida, y muestra el stock actualizado.
Ejemplo de entrada/salida:
Ingrese el stock actual del producto: 50
Ingrese la cantidad vendida: 20
Ingrese la cantidad recibida: 30
El nuevo stock del producto es: 60
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stockActual, cantidadVendida, cantidadRecibida, nuevoStock;
        
        System.out.print("Ingese el stock actual del producto : ");
        stockActual = Integer.parseInt(sc.nextLine());
        
        System.out.print("Ingese la cantidad vendida: ");
        cantidadVendida = Integer.parseInt(sc.nextLine());
        
        System.out.print("Ingese la cantidad recibida : ");
        cantidadRecibida = Integer.parseInt(sc.nextLine());
        
        actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
    }

    private static void actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        System.out.println("El nuevo stock del producto es: "+(stockActual - cantidadVendida + cantidadRecibida)); 
    }
    
}
