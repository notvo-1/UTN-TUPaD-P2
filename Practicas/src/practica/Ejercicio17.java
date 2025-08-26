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
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 0;
        Scanner sc = new Scanner(System.in);
        //numero = validarEntero();
        
        for (int i = 1; i < 10000; i++) {
            if (esPerfecto(i)){  
                informarResultado(i, " Es Perfecto");
            }
            
        }
    }
    
    static int validarEntero(){
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
    
    static int sumaDivisores(int numero){
        int sumDiv = 0;
        int mitad = numero / 2;
        for (int i = 1; i <= mitad; i++) {
            if (numero % i == 0) {
                sumDiv += i;
            }
        }
        return sumDiv;
    }
    
    static boolean esPerfecto(int numero){
        return sumaDivisores(numero) == numero;
    }
    
    static void informarResultado(int numero, String texto){
        System.out.println(numero + texto); 
    }
}
