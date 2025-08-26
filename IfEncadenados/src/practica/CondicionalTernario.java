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
public class CondicionalTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int invitados, sillas, faltantes;
        
        System.out.print("Ingrese un numero de invitados: ");
        invitados = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese un numero de sillas: ");
        sillas = Integer.parseInt(input.nextLine());
        
        if (invitados > sillas) {
            faltantes = invitados - sillas;
            System.out.println("Conseguir "+ faltantes + " silla" + (faltantes != 1 ? "s":""));
        }else {
            System.out.println("Alcanzan las sillas");
        }
        
    }
    
}
