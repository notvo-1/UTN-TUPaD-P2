/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author notvo
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente;
        Reserva reserva;
        Mesa mesa;
        
        cliente = new Cliente("Matias Orellana", "231312");
        mesa = new Mesa("12", "2");
        reserva = new Reserva("22/09/2025", "21:00", mesa);
        
        reserva.mostrarReserva();
        System.out.println(reserva);
        System.out.println(mesa);
        reserva.setCliente(cliente); //puedo usar toString sin drama, se complica con la asociacion bidireccional. Explota de recursivo.
        System.out.println(mesa);
        reserva.mostrarReserva(); 
        System.out.println(reserva);
    }
    
}
