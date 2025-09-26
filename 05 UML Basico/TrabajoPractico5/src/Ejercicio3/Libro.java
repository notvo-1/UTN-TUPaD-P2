/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author notvo
 */
public class Libro {

    private String titulo;
    private String isbn;
    private Editorial editorial; //adociacion unidireccional
    private Autor autor; //agregacion

    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void infoLibro() {
        System.out.println("Libro: " + titulo
                + ", ISBN: " + isbn
                + ", Autor: " + (autor != null ? autor.getNombre() : "Sin autor")
                + ", Editorial: " + (editorial != null ? editorial.getNombre() : "Sin editorial"));
    }

}
