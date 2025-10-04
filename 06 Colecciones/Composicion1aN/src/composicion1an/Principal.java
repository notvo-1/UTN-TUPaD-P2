/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composicion1an;

import java.util.Date;

/**
 *
 * @author notvo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pedido pedido = new Pedido("PC100", new Date());
        
        pedido.agregarItem("Placa de video", 1, 500);
        pedido.agregarItem("Memoria ram", 2, 300);
        pedido.agregarItem("Procesador", 1, 800);
        
        pedido.mostrarPedido();
        
        pedido.removeItemPorNombre("Memoria ram");
        
        pedido.mostrarPedido();
        
        
    }
    
}
