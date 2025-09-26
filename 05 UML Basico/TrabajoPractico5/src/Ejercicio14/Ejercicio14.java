/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio14;

/**
 *
 * @author notvo
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proyecto proyecto;
        EditorVideo editor;
        
        proyecto = new Proyecto("Video final", "100");
        editor = new EditorVideo();
        
        editor.exportar("mp4", proyecto);
    }
    
}
