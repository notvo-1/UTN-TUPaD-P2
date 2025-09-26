/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejericicio10;

/**
 *
 * @author notvo
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria cuenta;
        Titular titular;
        ClaveSeguridad clave;
        
        titular = new Titular("Matias Orellana", "12312312" );
        cuenta = new CuentaBancaria("777311981412984", 10000, "pepe123", "22/'9/2025");
        
        titular.mostrarInfo();
        cuenta.mostrarInfo();
        System.out.println(cuenta.getClave());
        
        titular.setCuenta(cuenta);
        
        titular.mostrarInfo();
        cuenta.mostrarInfo();
        System.out.println(cuenta.getClave());
        
    }
    
}
