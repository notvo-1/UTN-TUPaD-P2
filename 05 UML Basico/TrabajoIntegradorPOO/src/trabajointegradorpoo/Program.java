/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajointegradorpoo;

/**
 *
 * @author notvo
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Posnet posnet = new Posnet();
        Usuario titular1 = new Usuario("3434343", "Matias", "Orellana", "29299395", "coso@gmail.com");
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito(EntidadFinanciera.BIRZA, titular1, "Banco pepe", "00001001001", 15000);

        System.out.println("Tarjeta antes del pago");
        System.out.println(tarjeta1);

        Ticket ticket1 = posnet.efectuarPago(tarjeta1, 10000, 5);
        System.out.println(ticket1);

        System.out.println("Tarjeta despues del pago");
        System.out.println(tarjeta1);
        
        System.out.println("-----------------------");
        
        TarjetaDeCredito tarjeta2 = new TarjetaDeCredito(EntidadFinanciera.BIRZA, titular1, "Banco pepe", "00001001001", 9000);

        System.out.println("Tarjeta antes del pago");
        System.out.println(tarjeta2);

        Ticket ticket2 = posnet.efectuarPago(tarjeta2, 9000, 1);
        System.out.println(ticket2);

        System.out.println("Tarjeta despues del pago");
        System.out.println(tarjeta2);

    }

}
