/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Parte1;

/**
 *
 * @author notvo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Cliente c1 = new Cliente("Matias", true);
//        c1.agregarProductoAPedido("papa", 500);
//        c1.agregarProductoAPedido("tomate", 1000);
//        c1.agregarProductoAPedido("cebolla", 500);
//        c1.agregarProductoAPedido("lechuga", 700);
//
//        c1.setTotal();
//        System.out.println("El total es: " + c1.getTotal());
//
//        c1.agregarMetodoPagoPaypal("matias@gmail.com", 2700);
//        c1.agregarMetodoPagoTarjeta("123121", 3000);
//
//        c1.pagarPedido();
//        
        // Test con tarjeta (con descuento)
        Cliente c1 = new Cliente("Matias", true);
        c1.agregarProductoAPedido("papa", 500);
        c1.agregarProductoAPedido("tomate", 1000);
        c1.agregarMetodoPagoTarjeta("123121", 3000);
        c1.setTotal();
        System.out.println("El total es: " + c1.getTotal());
        c1.pagarPedido();

        // Test con PayPal (sin descuento)
        Cliente c2 = new Cliente("Ana", true);
        c2.agregarProductoAPedido("arroz", 800);
        c2.agregarMetodoPagoPaypal("ana@gmail.com", 1000);
        c2.setTotal();
        System.out.println("El total es: " + c2.getTotal());
        c2.pagarPedido();

    }

}
