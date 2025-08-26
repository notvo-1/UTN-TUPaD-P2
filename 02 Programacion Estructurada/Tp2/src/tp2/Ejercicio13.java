/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

/**
13. Impresi�n recursiva de arrays antes y despu�s de modificar un elemento.
Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Use una funci�n recursiva para mostrar los precios originales.
c. Modifique el precio de un producto espec�fico.
d. Use otra funci�n recursiva para mostrar los valores modificados.
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
? Recorrido del array con una funci�n recursiva en lugar de un bucle.
? Modificaci�n de un valor en un array mediante un �ndice.
? Uso de un �ndice como par�metro en la recursi�n para recorrer el
array.

 */
public class Ejercicio13 {

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
        mostrarArratRec(precios, 0);
        
        precios[2]= 129.99;
        System.out.println("Precios modificados: ");
        mostrarArratRec(precios, 0);

    }
    static void mostrarArratRec(double[] array, int indice){
        if (indice >= array.length) {
            return;
        }
        System.out.println("Precios: "+array[indice]);
        indice++;
        mostrarArratRec(array, indice);
        
    }
}
