/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion1an;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 *
 * @author notvo
 */
public class Pedido {

    private String codigo;
    private Date fecha;
    private List<Item> items;

    public Pedido(String codigo, Date fecha) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.items = new ArrayList<>();
    }

    public void agregarItem(String nombre, int cantidad, double precio) {
        this.items.add(new Item(nombre, cantidad, precio));
    }

    public boolean removeItemPorNombre(String nombreItem) {
        for (Item item : items) {
            if (item.getNombre().equals(nombreItem)) {
                items.remove(item);
                return true;
            }
        }
        return false;
    }

    public double calcularTotal() {
        int total = 0;
        for (Item item : items) {
            total += item.getSubtotal();
        }
        return total;
    }

    public String getCodigo() {
        return codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }

    void mostrarPedido() {
        System.out.println("#########################################");
        System.out.println("#########################################");
        System.out.println("Pedido numero: " + codigo);
        System.out.println("Total: " + calcularTotal());
        System.out.println("Lista de items: ");
        System.out.println("---------------------------------");
        
        for (Item item : items) {
            System.out.println("Nombre: " + item.getNombre());
            System.out.println("Cantidad: " + item.getCantidad());
            System.out.println("Subtotal: " + item.getSubtotal());
            System.out.println("---------------------------------");
        }
        System.out.println("#########################################");
        System.out.println("#########################################");
    }
}
