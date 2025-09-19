/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author notvo
 */
public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;
    
    void mostrarinfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }
    
    void subirCalificacion(double calificacion){
        if (calificacion > 0 && calificacion <= (10-this.calificacion)) {
            this.calificacion += calificacion;
        }
    }
    
    void bajarCalificacion(double calificacion){
        if (calificacion <= this.calificacion && calificacion > 0) {
            this.calificacion -= calificacion;
        }
    }
}
