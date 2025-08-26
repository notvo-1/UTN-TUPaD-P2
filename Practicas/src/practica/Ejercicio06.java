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
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcion;
        int num1, num2;
        
        System.out.print("Ingrese el primer numero entero: ");
        num1 = Integer.parseInt(sc.nextLine());
        
        System.out.print("Ingrese el segundo numero entero: ");
        num2 = Integer.parseInt(sc.nextLine());
        
        System.out.println("MENU DE OPCIONES");
        System.out.println("[+] SUMA");
        System.out.println("[-] RESTA");
        System.out.println("[*] MULTIPLICACION");
        System.out.println("[/] DIVISION");
        System.out.println("SELECCIONE UNA OPCION");
        opcion = sc.nextLine().charAt(0);
        
        switch (opcion) {
            case '+':
                System.out.println("El resultado de la suma es "+ (num1 + num2));
                break;
            case '-':
                System.out.println("El resultado de la resta es " + (num1 - num2));
                break;
            case '*':
                System.out.println("El resultado de la multiplicacion es " + (num1 * num2));
                break;
            case '/':
                System.out.println("El resultado de la division es " + (num1/num2));
            default:
                System.out.println("Operacion invalida");
        }
        System.out.println("FIN");
    }
    
}
