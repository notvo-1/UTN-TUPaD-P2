/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author notvo
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean valido = false;

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
        if (esPrimoWhile(num)) {
            System.out.println("El numero " + num + " es primo.");
        } else {
            System.out.println("No es primo.");
        }

    }

    static boolean esValido(String entero) {
        try {
            Integer.parseInt(entero);
            int n = Integer.parseInt(entero);
            if (n > 0) {
                return true;
            }else {
                System.out.println("No es un numero positivo.");
                return false;
            }
        } catch (NumberFormatException error) {
            return false;
        }
    }
    
    static boolean esPrimoWhile ( int numero){
        int mitad = numero / 2;
        int cont = 2;
        while (cont <= mitad && !esMultiplo(numero, cont)) {            
            cont++;
        }
        return cont > mitad ;
    }
    
    static boolean esMultiplo (int num1,int num2){
        return num1%num2 == 0;
    }
    
    static boolean esPrimo(int numero) {
        int divisores = 0;
        for (int i = numero; i > 0; i--) {
            if (numero % i == 0) {
                divisores++;
            }
        }
        if (divisores == 2) {
            return true;
        } else {
            return false;
        }
    }
}

