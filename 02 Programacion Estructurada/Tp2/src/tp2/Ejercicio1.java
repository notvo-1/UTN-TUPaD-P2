/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

import java.util.Scanner;

/*
1. Verificaci�n de A�o Bisiesto.
Escribe un programa en Java que solicite al usuario un a�o y determine si es
bisiesto. Un a�o es bisiesto si es divisible por 4, pero no por 100, salvo que sea
divisible por 400.
Ejemplo de entrada/salida:
Ingrese un a�o: 2024
El a�o 2024 es bisiesto.
Ingrese un a�o: 1900
El a�o 1900 no es bisiesto.

 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a�o;
        a�o = validarEntero("Ingrese un a�o para validar");
        esBisiesto(a�o);
    }
    
    static void esBisiesto(int a�o){
        if ((a�o % 4 == 0 && a�o % 100 != 0)|| a�o % 400 == 0) {
            System.out.println("El a�o "+a�o+" es bisiesto.");
        } else {
            System.out.println("El a�o "+a�o+" no es bisiesto.");
        }
        
    }
    
    static int validarEntero(String mensaje) {
        boolean valido = false;
        int num = 0;
        Scanner sc = new Scanner(System.in);
        while (!valido) {
            String texto;
            System.out.print(mensaje+": ");
            texto = sc.nextLine();
            if (esValidoPositivo(texto)) {
                num = Integer.parseInt(texto);
                valido = true;
            } else {
                System.out.println("No es un numero valido. Intente nuevamente");
            }

        }
        return num;
    }

    static boolean esValidoPositivo(String entero) {
        try {
            Integer.parseInt(entero);
            int n = Integer.parseInt(entero);
            if (n > 0) {
                return true;
            } else {
                System.out.println("No es un numero positivo.");
                return false;
            }
        } catch (NumberFormatException error) {
            return false;
        }
    }
}
