/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;

import static practica.Ejercicio16.esValido;
import java.util.Scanner;

/**
 *
 * @author notvo
 */
import java.util.Arrays;
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros;
        int [] mayores;
        double promedio;
        
        
        numeros = ingresarNumeros(8);
        promedio = promedio(numeros);
        mayores = mayoresQue(numeros, promedio);

        
        System.out.println("Los numeros ingresados son: " + Arrays.toString(numeros));
        System.out.println("El promedio es: " + promedio);
        System.out.println("Los numero mayores al promedio son: " + Arrays.toString(mayores));
    }

    static int validarEntero() {
        boolean valido = false;
        int num = 0;
        Scanner sc = new Scanner(System.in);
        while (!valido) {
            String texto;
            System.out.print("Ingrese un numero entero: ");
            texto = sc.nextLine();
            if (esValido(texto)) {
                num = Integer.parseInt(texto);
                valido = true;
            } else {
                System.out.println("No es un numero valido. Intente nuevamente");
            }

        }
        return num;
    }
    
    static int[] ingresarNumeros(int cantidad){
        int[] numeros = new int[cantidad];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i+1) +"° ");
            numeros[i] = validarEntero();
        }
        return numeros;
    }
    
    static double promedio(int[] array){
        double promedio, suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        promedio = suma / (array.length);
        return promedio;
    }
    
    static int[]  mayoresQue(int[] array, double numero){
                int cont = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > numero) {
                cont++;
            }
        }
        
        int[] mayores = new int[cont];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > numero) {
                mayores[j] = array[i];
                j++;
            }
        }
        return mayores;
    }
}
