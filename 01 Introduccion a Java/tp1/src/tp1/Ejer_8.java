
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
Manejar conversiones de tipo y división en Java.
a. Escribe un programa que divida dos números enteros ingresados por el
usuario.
b. Modifica el código para usar double en lugar de int y compara los
resultados.

 * @author notvo
 */
public class Ejer_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.##");
        
        int num1, num2, res1;
        double res2;
        String resFormateado;
        
        System.out.print("Ingrese el primer numero entero: ");
        num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el primer numero entero: ");
        num2 = Integer.parseInt(sc.nextLine());
        
        res1 = num1/num2;
        res2 = (double)num1/num2;
        resFormateado = df.format(res2);
        System.out.println("El resultado dividiendo dos numeros enteros es "+res1);
        System.out.println("El resultado dividiendo un numero entero usando casting por otro entero es "+ res2);
        System.out.println("El mismo numero formateado es "+ resFormateado);
    }
    
}
