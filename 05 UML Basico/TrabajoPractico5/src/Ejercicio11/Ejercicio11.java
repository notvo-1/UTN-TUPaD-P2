/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio11;

/**
 *
 * @author notvo
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Artista artista;
        Reproductor reproductor;
        Cancion cancion;
        
        artista = new Artista("Mathius Orshan", "Metal rei");
        cancion = new Cancion("Codeando mi alma - dark version");
        reproductor = new Reproductor();
        
        System.out.println(artista);
        System.out.println(cancion);
        
        cancion.setArtista(artista);
        
        System.out.println(artista);
        System.out.println(cancion);
        
        reproductor.Reproducir(cancion);
        
    }
    
}
