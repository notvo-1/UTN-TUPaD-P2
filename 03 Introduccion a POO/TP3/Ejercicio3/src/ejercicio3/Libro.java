/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author notvo
 */
public class Libro {
    final int A�O_ACTUAL = 2025;
    private String titulo;
    private String autor;
    private int a�oPublicacion;
    
//    public Libro(String titulo, String autor, int a�oPublicacion){
//        setA�oPublicacion(a�oPublicacion);
//        setAutor(autor);
//        setTitulo(titulo);
//        
//    }
    
    public void mostrarDatos(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("A�o de Publicaci�n: " + getA�oPublicacion());
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getA�oPublicacion() {
        return a�oPublicacion;
    }
    
    public void setA�oPublicacion(int a�oPublicacion) {
        String str_a�o = String.valueOf(a�oPublicacion);
        if (a�oPublicacion > 0 && a�oPublicacion < A�O_ACTUAL && str_a�o.length()== 4 ) {
            this.a�oPublicacion = a�oPublicacion;
        }
    }
    
    
}
