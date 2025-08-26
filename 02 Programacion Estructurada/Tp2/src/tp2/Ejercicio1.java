/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

import java.util.Scanner;

/*
1. Verificación de Año Bisiesto.
Escribe un programa en Java que solicite al usuario un año y determine si es
bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea
divisible por 400.
Ejemplo de entrada/salida:
Ingrese un año: 2024
El año 2024 es bisiesto.
Ingrese un año: 1900
El año 1900 no es bisiesto.

 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int año;
        año = validarEntero("Ingrese un año para validar");
        esBisiesto(año);
    }
    
    static void esBisiesto(int año){
        if ((año % 4 == 0 && año % 100 != 0)|| año % 400 == 0) {
            System.out.println("El año "+año+" es bisiesto.");
        } else {
            System.out.println("El año "+año+" no es bisiesto.");
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
