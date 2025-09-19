/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author notvo
 */
public class RegistroEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante();
        
        e1.apellido = "Orellana";
        e1.nombre = "Matias";
        e1.curso = "Programacion 2";
        e1.calificacion = 7;
        
        e1.mostrarinfo();
        e1.subirCalificacion(2);
        e1.mostrarinfo();
        e1.bajarCalificacion(4);
        e1.mostrarinfo();
        e1.subirCalificacion(9);
        e1.mostrarinfo();
        e1.bajarCalificacion(6);
        e1.mostrarinfo();
    }
    
}
