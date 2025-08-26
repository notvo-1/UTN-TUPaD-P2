/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

/**
6. Contador de Positivos, Negativos y Ceros (for).
Escribe un programa que pida al usuario ingresar 10 n�meros enteros y
cuente cu�ntos son positivos, negativos y cu�ntos son ceros.
Ejemplo de entrada/salida:
Ingrese el n�mero 1: -5
Ingrese el n�mero 2: 3
Ingrese el n�mero 3: 0
Ingrese el n�mero 4: -1
Ingrese el n�mero 5: 6
Ingrese el n�mero 6: 0
Ingrese el n�mero 7: 9
Ingrese el n�mero 8: -3
Ingrese el n�mero 9: 4
Ingrese el n�mero 10: -8
Resultados:
Positivos: 4
Negativos: 4
Ceros: 2
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, pos = 0, neg = 0, ceros = 0;
        
        
        for (int i = 0; i < 10; i++) {
            num = Funciones.validarEntero("Ingrese el numero " + (i+1) , "todos");
            if (num < 0) {
                neg++;
            }else if (num > 0) {
                pos++;
            }else {
                ceros++;
            }
        }
        System.out.println("Positivos :" + pos);
        System.out.println("Negativos :" + neg);
        System.out.println("Ceros :" + ceros);
    }
    
}
