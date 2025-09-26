/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author notvo
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro;
        Editorial editorial;
        Autor autor;
        
        
        editorial = new Editorial("Libros Buenos", "San Martin 123, Mendoza.");
        libro = new Libro("El principito", "a1231212j", editorial);
        autor = new Autor("Antoine de Saint-Exupéry", "Frances"); //podria ser un enum no? la nac
        
        libro.infoLibro();
        libro.setAutor(autor);
        libro.infoLibro();
        
        
    }
    
}
