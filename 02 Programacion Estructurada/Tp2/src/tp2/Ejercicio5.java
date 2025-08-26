/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

/**
5. Suma de N�meros Pares (while).
Escribe un programa que solicite n�meros al usuario y sume solo los
n�meros pares. El ciclo debe continuar hasta que el usuario ingrese el n�mero
0, momento en el que se debe mostrar la suma total de los pares ingresados.
Ejemplo de entrada/salida:
Ingrese un n�mero (0 para terminar): 4
Ingrese un n�mero (0 para terminar): 7
Ingrese un n�mero (0 para terminar): 2
Ingrese un n�mero (0 para terminar): 0
La suma de los n�meros pares es: 6

 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        int suma = 0;
        boolean bandera = false;
        
        while (!bandera) {            
            
            num = Funciones.validarEntero("Ingrese un n�mero (0 para terminar)", "positivo");
            if (num % 2 == 0) {
                suma += num;
            }
            
            if (num == 0) {
                bandera = true;
            }
        }
        
        System.out.println("La suma de los n�meros pares es: "+ suma);
        
   }
    
}
