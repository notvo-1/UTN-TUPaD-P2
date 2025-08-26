/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

import java.util.Scanner;

/**
7. Validaci�n de Nota entre 0 y 10 (do-while).
Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
usuario ingresa un n�mero fuera de este rango, debe seguir pidi�ndole la nota
hasta que ingrese un valor v�lido.
Ejemplo de entrada/salida:
Ingrese una nota (0-10): 15
Error: Nota inv�lida. Ingrese una nota entre 0 y 10.
Ingrese una nota (0-10): -2
Error: Nota inv�lida. Ingrese una nota entre 0 y 10.
Ingrese una nota (0-10): 8
Nota guardada correctamente
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        
        do {            
            System.out.print("Ingrese un nota (0-10): ");
            try {
                nota = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Nota inv�lida. Ingrese una nota entre 0 y 10.");
                continue;
            }
            if (nota <= 10 && nota >= 0) {
                System.out.println("Nota guardada correctamente.");
                flag = false;
            }else {
                System.out.println("Error: Nota inv�lida. Ingrese una nota entre 0 y 10.");
            }
        } while (flag);
    }
    
    }
