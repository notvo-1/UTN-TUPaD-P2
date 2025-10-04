/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Punto2;

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
        Libro resultado;
        List<Libro> resultados;
        //Punto1
        Biblioteca b = new Biblioteca("Biblio");
        //Punto2 y 3
        cargarLibros(b);

        //Punto4
//        b.listarLibros();
        //Punto5
//        resultado = b.buscarLibrosPorIsbn("978-8478884452");
//        if (resultado != null) {
//            resultado.mostrarInfo();
//        }else{
//            System.out.println("NO se enontraron coincidencias.");
//        }
        //Punto6
//        int fecha = 1997;
//        resultados = b.filtrarLibrosPorAnio(fecha);
//        if (resultados.size() != 0) {
//            System.out.println("Libros que coinciden con la fecha "+ fecha +": ");
//            for (Libro libro : resultados) {
//                libro.mostrarInfo();
//            }
//        }else{
//            System.out.println("No se encontraron coincidencias");
//        }
        //Punto7
//        String idBorrar = "978-8478884452";
//        resultado = b.eliminarLibro(idBorrar);
//        if (resultado != null) {
//            System.out.println("Libro eliminado: ");
//            resultado.mostrarInfo();
//        }else{
//            System.out.println("No se encontraron coincidencias.");
//        }
        //Punto8
//        System.out.println("La cantidad de libros totales es: "+ b.obtenerCantidadLibros());
        //Punto9
        List<Autor> autores = b.mostrarAutoresDisponibles();
        if (autores.size() != 0) {
            System.out.println("Los autores disponibles son: ");
            for (Autor autor : autores) {
                autor.mostrarInfo();
            }
        }
    }

    public static void cargarLibros(Biblioteca b) {
        Autor jkRowling = new Autor("A001", "J.K. Rowling", "Británica");
        Autor gabrielGarciaMarquez = new Autor("A002", "Gabriel García Márquez", "Colombiana");
        Autor isabelAllende = new Autor("A003", "Isabel Allende", "Chilena");
        Autor georgeOrwell = new Autor("A004", "George Orwell", "Británica");
        Autor janeAusten = new Autor("A005", "Jane Austen", "Británica");
        Autor pabloNeruda = new Autor("A005", "Pablo Neruda", "Chilena");
        Autor octavioPaz = new Autor("A009", "Octavio Paz", "Mexicano");
        Autor alfonStorni = new Autor("A010", "Alfonsina Storni", "Argentina");
        Autor juanRulfo = new Autor("A011", "Juan Rulfo", "Mexicano");

        b.agregarLibro("978-8478884452", "Harry Potter y la piedra filosofal", 1997, jkRowling);
        b.agregarLibro("978-8478884957", "Harry Potter y la cámara secreta", 1998, jkRowling);
        b.agregarLibro("978-8437604947", "Cien años de soledad", 1967, gabrielGarciaMarquez);
        b.agregarLibro("978-8420471831", "1984", 1949, georgeOrwell);
        b.agregarLibro("978-8466338141", "La casa de los espíritus", 1982, isabelAllende);
        b.agregarLibro("978-8491050355", "Rebelión en la granja", 1945, georgeOrwell);
        b.agregarLibro("978-8497940155", "Orgullo y prejuicio", 1813, janeAusten);
        b.agregarLibro("978-8437604954", "El amor en los tiempos del cólera", 1985, gabrielGarciaMarquez);
    }

}
