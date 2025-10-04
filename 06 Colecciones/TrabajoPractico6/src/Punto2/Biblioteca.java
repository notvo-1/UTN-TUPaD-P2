/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author notvo
 */
public class Biblioteca {

    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }

    public void listarLibros() {
        int index = 1;
        for (Libro libro : libros) {
            System.out.print("\n"+index+"- ");
            libro.mostrarInfo();
            index++;
        }
    }

    public Libro buscarLibrosPorIsbn(String isbn) {
        Libro libroEncontrado = null;
        int index = 0;
        while (index < libros.size() && !libros.get(index).getIsbn().equalsIgnoreCase(isbn)) {            
            index++;
        }
        if (index < libros.size()) {
            libroEncontrado = libros.get(index);
        }
        return libroEncontrado;
    }
    
    public Libro eliminarLibro(String isbn){
        Libro borrado = buscarLibrosPorIsbn(isbn);
        if (borrado != null) {
            this.libros.remove(borrado);
        }
        return borrado;
    }
    
    public int obtenerCantidadLibros(){
        return libros.size();
    }
    
    public List<Libro> filtrarLibrosPorAnio(int anio){
        List<Libro> resultado = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                resultado.add(libro);
            }
        }
        return Collections.unmodifiableList(resultado);
    }
    
    public List<Autor> mostrarAutoresDisponibles(){
        List<Autor> autores = new ArrayList<>();
        for (Libro libro : libros) {
            if (!autores.contains(libro.getAutor())){
                autores.add(libro.getAutor());
            }
        }
        return Collections.unmodifiableList(autores);
    }

}
