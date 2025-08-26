/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

import java.util.Scanner;

/**
9. Composición de funciones para calcular costo de envío y total de compra.
a. calcularCostoEnvio(double peso, String zona): Calcula el costo de
envío basado en la zona de envío (Nacional o Internacional) y el peso del
paquete.
Nacional: $5 por kg
Internacional: $10 por kg
b. calcularTotalCompra(double precioProducto, double
costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con
el costo de envío.
Desde main(), solicita el peso del paquete, la zona de envío y el precio
del producto. Luego, muestra el total a pagar.
Ejemplo de entrada/salida:
Ingrese el precio del producto: 50
Ingrese el peso del paquete en kg: 2
Ingrese la zona de envío (Nacional/Internacional): Nacional
El costo de envío es: 10.0
El total a pagar es: 60.0
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio, peso,precioTotalCompra, costoEnvio = 0;
        String zona;
        
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(sc.nextLine());
                
        System.out.print("Ingrese el peso del paquete en kg: ");
        peso = Integer.parseInt(sc.nextLine());
        
        boolean flag = true;
        while (flag) { 
            System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
            zona = sc.nextLine();
            
            if (zona.toLowerCase().equals("nacional") || zona.toLowerCase().equals("internacional")){
                costoEnvio = calcularCostoEnvio(peso, zona);
                flag = false;
            }
        }
        
        precioTotalCompra = calcularTotalCompra(precio, costoEnvio);
        
        System.out.println("El costo de envío es: "+costoEnvio);
        System.out.println("El total a pagar es: "+precioTotalCompra);
        
    }

    private static double calcularCostoEnvio(double peso, String zona) {
        if (zona.toLowerCase().equals("nacional")){
            return  peso * 5;
        }else {
            return peso * 10;
        }
    }

    private static double calcularTotalCompra(double precio, double costoEnvio) {
        return precio + costoEnvio;
    }
    
    
}
