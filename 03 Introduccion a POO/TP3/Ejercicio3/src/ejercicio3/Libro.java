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
    final int AÑO_ACTUAL = 2025;
    private String titulo;
    private String autor;
    private int añoPublicacion;
    
//    public Libro(String titulo, String autor, int añoPublicacion){
//        setAñoPublicacion(añoPublicacion);
//        setAutor(autor);
//        setTitulo(titulo);
//        
//    }
    
    public void mostrarDatos(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Año de Publicación: " + getAñoPublicacion());
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

    public int getAñoPublicacion() {
        return añoPublicacion;
    }
    
    public void setAñoPublicacion(int añoPublicacion) {
        String str_año = String.valueOf(añoPublicacion);
        if (añoPublicacion > 0 && añoPublicacion < AÑO_ACTUAL && str_año.length()== 4 ) {
            this.añoPublicacion = añoPublicacion;
        }
    }
    
    
}
