/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

import java.util.Arrays;


/**
2. Determinar el Mayor de Tres Números.
Escribe un programa en Java que pida al usuario tres números enteros y
determine cuál es el mayor.
Ejemplo de entrada/salida:
Ingrese el primer número: 8
Ingrese el segundo número: 12
Ingrese el tercer número: 5
El mayor es: 12

 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] numeros;
        int mayor;
        
        numeros = Funciones.crearArray(3);
        System.out.println(Arrays.toString(numeros));
        mayor = Funciones.mayorArray(numeros);
        
        System.out.println("El mayor es "+mayor);
    }
}
