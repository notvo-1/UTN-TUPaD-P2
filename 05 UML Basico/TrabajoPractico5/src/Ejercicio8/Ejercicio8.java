/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author notvo
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario;
        FirmaDigital firma;
        Documento doc;
        
        usuario = new Usuario("Matias Orellana", "programerpochardo@gmail.com");
        doc = new Documento("Contato trabajo", "Clausulas leonicas para programar mucho y largo","hash123123", "12/12/2023", usuario);
        
        
        System.out.println(usuario);
        System.out.println(doc.getFirma());
        System.out.println(doc);
        
        System.out.println(doc.getUsuario()); // usuario no es accesible desde Documentos porque a pesar de tener la variable ahi la instancia se crea en el main  porque es un agregado de firmadigintal. Debo crearla variable para poder "parcearla" por documento hasta firmadigital que es donde se utiliza. Por el contrario, firmadigital es una composicion de documento y se instancia en el constructor de su clase. 
    }
    
}
