
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * Escribe un programa que solicite dos números enteros y realice las siguientes
operaciones:
a. Suma
b. Resta
c. Multiplicación
d. División
Muestra los resultados en la consola.

 * @author notvo
 */
public class Ejer_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.##");
        int num1, num2, suma, resta, mult;
        double div;
        String numFormateado;
        
        System.out.print("Ingrese el primer numero entero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el segundo numero entero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        suma = num1 + num2;
        resta = num1 - num2;
        mult = num1*num2;
        div = (double)num1 / num2;
        numFormateado = df.format(div);
        System.out.println("Para los numeros "+ num1 + " y " + num2+ ". Los resultados son: ");
        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + mult);
        System.out.println("Division: " + numFormateado);
    }
    
}
