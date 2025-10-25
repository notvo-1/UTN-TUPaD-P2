/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1;

import java.util.ArrayList;

/**
 *
 * @author notvo
 */
public class Pedido implements Pagable, Notificable {

    ArrayList<Producto> productos;
    private boolean estado;
    private double totalPedido;
    private boolean descuento;

    public Pedido(boolean descuento) {
        this.productos = new ArrayList<>();
        this.descuento = descuento;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public void agregarProducto(String nombre, double precio) {
        productos.add(new Producto(nombre, precio));
    }
    

    
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }
        return total;
    }

    @Override
    public void notificar(boolean estado) {
        // no se que puede notificar aca
        this.estado = estado;
    }

}
