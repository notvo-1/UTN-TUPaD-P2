/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Punto1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author notvo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inventario inv1 = new Inventario();
        //Punto 1
        cargarProductos(inv1);

        //Punto2
//        inv1.listarProductos();
        //Punto3
//        Producto pe = inv1.buscarProductoPorId("aA001");
//        if (pe == null) {
//            System.out.println("No se encontro ninguna coincidencia. ");
//        }else{
//            pe.mostrarInfo();
//        }
        //Punto4
//        List<Producto> resultado = inv1.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
//        if (resultado.size() != 0) {
//            for (Producto producto : resultado) {
//                producto.mostrarInfo();
//            }
//        }else{
//            System.out.println("No se encontraros coincidencias.");
//        }
        //Punto5
//        Producto borrado = inv1.eliminarProducto("A00");
//        if (borrado != null) {
//            System.out.print("Borrado"); 
//            System.out.println("---------------");
//            borrado.mostrarInfo();
//            System.out.println("---------------");
//        }
//        else{
//            System.out.println("No se encontraron coincidencias.");
//        }
//        inv1.listarProductos();
        //Punto6
//            String id = "A001";
//            if (inv1.actualizarStock(id, 50)){
//                inv1.buscarProductoPorId(id).mostrarInfo();
//            }else{
//                System.out.println("No se encontraron coincidencias.");
//            }
        //Punto7
        int totalStock = inv1.obtenerTotalStock();
        System.out.println("El total del stock es: " + totalStock + " productos");
        System.out.println("Cantidad por producto: ");
        System.out.println("######################");
        for (Producto producto : inv1.getProductos()) {
            totalStock += producto.getCantidad();
            System.out.println("Nombre: " + producto.getNombre() + "\nCantidad: " + producto.getCantidad());
            System.out.println("######################");
        }

        //Punto8
//            Producto resultado = inv1.obtenerProductoConMayorStock();
//            resultado.mostrarInfo();
        //Punto9
//            List<Producto> resultado = inv1.filtrarProductosPorPrecio(2, 10);
//            if (!resultado.isEmpty()) {
//                for (Producto producto : resultado) {
//                    producto.mostrarInfo();
//                    System.out.println("-----------");
//                }
//        }
//            else{
//                System.out.println("NO se encontraron coincidencias.");
//            }
        //Punto10
//        inv1.mostrarCategoriasDisponibles();

    }

    public static void cargarProductos(Inventario inv) {
        Producto producto1 = new Producto("A001", "Arroz Integral", 2.50, 100, CategoriaProducto.ALIMENTOS);
        Producto producto2 = new Producto("E001", "Smartphone Samsung", 299.99, 25, CategoriaProducto.ELECTRONICA);
        Producto producto3 = new Producto("R001", "Camisa de Algodón", 25.99, 75, CategoriaProducto.ROPA);
        Producto producto4 = new Producto("H001", "Juego de Sábanas", 32.75, 45, CategoriaProducto.HOGAR);
        Producto producto5 = new Producto("A002", "Aceite de Oliva", 5.75, 150, CategoriaProducto.ALIMENTOS);
        Producto producto6 = new Producto("E002", "Laptop HP", 599.99, 15, CategoriaProducto.ELECTRONICA);
        Producto producto7 = new Producto("R002", "Jeans Clásicos", 35.50, 60, CategoriaProducto.ROPA);
        Producto producto8 = new Producto("H002", "Olla de Acero", 28.90, 30, CategoriaProducto.HOGAR);
        Producto producto9 = new Producto("A003", "Leche Deslactosada", 1.80, 80, CategoriaProducto.ALIMENTOS);
        Producto producto10 = new Producto("E003", "Tablet Android", 159.99, 35, CategoriaProducto.ELECTRONICA);

        inv.agregarProducto(producto1);
        inv.agregarProducto(producto2);
        inv.agregarProducto(producto3);
        inv.agregarProducto(producto4);
        inv.agregarProducto(producto5);
        inv.agregarProducto(producto6);
        inv.agregarProducto(producto7);
        inv.agregarProducto(producto8);
        inv.agregarProducto(producto9);
        inv.agregarProducto(producto10);

    }

}
