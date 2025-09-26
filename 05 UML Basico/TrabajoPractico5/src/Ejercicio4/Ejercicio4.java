/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author notvo
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente;
        TarjetaDeCredito tarjeta;
        Banco banco;
        
        banco = new Banco("Santander", "12312312");
        cliente = new Cliente("Matias Orellana", "1231231231");
        tarjeta = new TarjetaDeCredito("000000000000", "06/30", banco);
        
        tarjeta.mostrarInfo();
        cliente.mostrarInfo();
        tarjeta.setTitular(cliente);
        tarjeta.mostrarInfo();
        cliente.mostrarInfo();
        
    }
    
}
