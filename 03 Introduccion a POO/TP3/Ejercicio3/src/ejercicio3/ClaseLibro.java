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
        tlor.setA�oPublicacion(2000);
        tlor.setTitulo("El Se�or de los Anillos");
        
        System.out.println("---------------------------");
        
        System.out.println("Titulo: " + tlor.getTitulo());
        System.out.println("Autor: " + tlor.getAutor());
        System.out.println("A�o de Publicaci�n: " + tlor.getA�oPublicacion());
        
        System.out.println("---------------------------");
        
        tlor.setA�oPublicacion(2026);
        System.out.println("A�o de Publicaci�n: " + tlor.getA�oPublicacion());

        System.out.println("---------------------------");
        
        tlor.setA�oPublicacion(-1954);
        System.out.println("A�o de Publicaci�n: " + tlor.getA�oPublicacion());
        
        System.out.println("---------------------------");
        
        tlor.setA�oPublicacion(1954);
        System.out.println("A�o de Publicaci�n: " + tlor.getA�oPublicacion());
        
        System.out.println("---------------------------");
        
        tlor.mostrarDatos();
        
    }
    
}
