/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

/**
12. Modificación de un array de precios y visualización de resultados.
Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Muestre los valores originales de los precios.
c. Modifique el precio de un producto específico.
d. Muestre los valores modificados.
Salida esperada:
Precios originales:
Precio: $199.99
Precio: $299.5
Precio: $149.75
Precio: $399.0
Precio: $89.99
Precios modificados:
Precio: $199.99
Precio: $299.5
Precio: $129.99
Precio: $399.0
Precio: $89.99
Conceptos Clave Aplicados:
? Uso de arrays (double[]) para almacenar valores.
? Recorrido del array con for-each para mostrar valores.
? Modificación de un valor en un array mediante un índice.
? Reimpresión del array después de la modificación.

 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] precios = new double[5];
        precios[0] = 199.99;
        precios[1] = 299.5;
        precios[2] = 149.75;
        precios[3] = 399.0;
        precios[4] = 89.99;
        
        System.out.println("Precios originales: ");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio: $"+precios[i]);
        }
        
        precios[2]= 129.99;
        System.out.println("Precios modificados: ");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precios: $"+ precios[i]);
        }
    }
    
}
