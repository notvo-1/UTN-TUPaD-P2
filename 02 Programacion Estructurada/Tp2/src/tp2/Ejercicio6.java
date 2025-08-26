/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

/**
6. Contador de Positivos, Negativos y Ceros (for).
Escribe un programa que pida al usuario ingresar 10 números enteros y
cuente cuántos son positivos, negativos y cuántos son ceros.
Ejemplo de entrada/salida:
Ingrese el número 1: -5
Ingrese el número 2: 3
Ingrese el número 3: 0
Ingrese el número 4: -1
Ingrese el número 5: 6
Ingrese el número 6: 0
Ingrese el número 7: 9
Ingrese el número 8: -3
Ingrese el número 9: 4
Ingrese el número 10: -8
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
