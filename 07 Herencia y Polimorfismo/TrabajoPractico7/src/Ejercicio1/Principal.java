/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author notvo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo auto = new Auto(4, "Toshota", "Hilux");
        Vehiculo auto2 = new Auto(4, "Toshota", "Corolla");
        
         System.out.println(auto.mostrarInfo());
         System.out.println(auto2.mostrarInfo());
         
    }
    
}
