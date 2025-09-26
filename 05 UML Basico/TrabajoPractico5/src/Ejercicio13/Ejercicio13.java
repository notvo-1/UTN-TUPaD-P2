/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author notvo
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario;
        GeneradorQR generador;
        
        usuario = new Usuario("Matias Orellana", "matias@gmail.com");
        generador = new GeneradorQR();
        generador.Generar("42342342342", usuario);
    }
    
}
