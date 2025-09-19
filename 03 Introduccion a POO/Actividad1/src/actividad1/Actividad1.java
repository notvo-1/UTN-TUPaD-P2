/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad1;

import java.util.Scanner;

/**
 *
 * @author notvo
 */
public class Actividad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Auto miAuto = new Auto();
        
        System.out.println(miAuto.patente + " " + miAuto.color + " " + miAuto.kms + " " + miAuto.conAire);
        miAuto.patente = "ABC123";
        miAuto.color = "Verde";
        miAuto.kms = 500;
        miAuto.conAire = true;
        System.out.println(miAuto.patente + " " + miAuto.color + " " + miAuto.kms + " " + miAuto.conAire);
        
        
        Auto auto2 = new Auto();
        System.out.println(auto2.patente + " " + auto2.color + " " + auto2.kms + " " + auto2.conAire);
        auto2.patente = "SFU444";
        auto2.color = "Gris";
        auto2.kms = 150;
        auto2.conAire = true; 
        System.out.println(auto2.patente + " " + auto2.color + " " + auto2.kms + " " + auto2.conAire);
        System.out.println(auto2);
        
        Auto auto3 = new Auto();
        System.out.println(auto3);
        auto2.patente = "LOL454";
        auto2.color = "Azul";
        auto2.kms = 355;
        auto2.conAire = true; 
        System.out.println(auto3);
        
        Auto otroAuto;
        otroAuto = miAuto;
        System.out.println("ID miAuto: " + miAuto);
        System.out.println("ID otroAuto: " + otroAuto);
        
        System.out.println(miAuto.color);
        otroAuto.color = "Azul";
        System.out.println(miAuto.color);
        
    }
    
}
