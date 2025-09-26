/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion1a1;

/**
 *
 * @author notvo
 */
public class Libro {

    private String titulo;
    private Portada portada; // Composición 1:1

    public Libro(String titulo, String ilustracion) {
        this.titulo = titulo;
        this.portada = new Portada(ilustracion); // Se crea internamente
    }

    public void setPortada(Portada portada) {
        this.portada = portada;
    }

    public void mostrarPortada() {
        System.out.println("Libro: " + titulo
                + " tiene portada: " + portada.getIlustracion());
    }

}
