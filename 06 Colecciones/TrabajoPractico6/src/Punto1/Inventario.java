/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author notvo
 */
public class Inventario {

    private ArrayList<Producto> productos = new ArrayList<>();

    public Inventario() {
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void listarProductos() {
        for (Producto producto : productos) {
            producto.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id) {
        Producto prodEncon = null;
        int index = 0;
        while (index < productos.size() && !productos.get(index).getId().equalsIgnoreCase(id)) {
            index++;
        }
        if (index < productos.size()) {
            prodEncon = productos.get(index);
        }
        return prodEncon;
    }

    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> listaEncont = new ArrayList<>();

        for (Producto producto : productos) {
            if (producto.getCategoria() == categoria) {
                listaEncont.add(producto);
            }
        }
        return Collections.unmodifiableList(listaEncont);
    }

    public Producto eliminarProducto(String id) {
        Producto borrado = buscarProductoPorId(id);
        if (borrado != null) {
            this.productos.remove(borrado);
        }
        return borrado;
    }

    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto prodAct = buscarProductoPorId(id);
        if (prodAct != null) {
            prodAct.setCantidad(nuevaCantidad);
            return true;
        }
        return false;
    }

    public int obtenerTotalStock() {
        int totalStock = 0;
        for (Producto producto : productos) {
            totalStock += producto.getCantidad();
        }

        return totalStock;
    }

    public Producto obtenerProductoConMayorStock() {
        int mayorStock = Integer.MIN_VALUE;
        Producto mayorProducto = null;
        for (Producto producto : productos) {
            if (producto.getCantidad() > mayorStock) {
                mayorStock = producto.getCantidad();
                mayorProducto = producto;
            }
        }
        return mayorProducto;
    }

    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        List<Producto> resultado = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
                resultado.add(producto);
            }
        }
        return Collections.unmodifiableList(resultado);
    }

    public void mostrarCategoriasDisponibles() {
        CategoriaProducto[] categorias = CategoriaProducto.values();
        System.out.println("Categoria:");
        for (int i = 0; i < categorias.length; i++) {
            System.out.println((i + 1) + ")" + categorias[i]);
        }
    }

    List<Producto> getProductos() {
        return Collections.unmodifiableList(productos);
    }

}
