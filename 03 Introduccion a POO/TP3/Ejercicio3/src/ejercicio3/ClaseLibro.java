/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author notvo
 */
public class ClaseLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro tlor = new Libro();
        
        tlor.setAutor("J. R. Tolkien");
        tlor.setAñoPublicacion(2000);
        tlor.setTitulo("El Señor de los Anillos");
        
        System.out.println("---------------------------");
        
        System.out.println("Titulo: " + tlor.getTitulo());
        System.out.println("Autor: " + tlor.getAutor());
        System.out.println("Año de Publicación: " + tlor.getAñoPublicacion());
        
        System.out.println("---------------------------");
        
        tlor.setAñoPublicacion(2026);
        System.out.println("Año de Publicación: " + tlor.getAñoPublicacion());

        System.out.println("---------------------------");
        
        tlor.setAñoPublicacion(-1954);
        System.out.println("Año de Publicación: " + tlor.getAñoPublicacion());
        
        System.out.println("---------------------------");
        
        tlor.setAñoPublicacion(1954);
        System.out.println("Año de Publicación: " + tlor.getAñoPublicacion());
        
        System.out.println("---------------------------");
        
        tlor.mostrarDatos();
        
    }
    
}
