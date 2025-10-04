/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto3;

/**
 *
 * @author notvo
 */
public class Curso {
   private String codigo;
   private String nombre;
   private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
        if (profesor != null && !profesor.getCursos().contains(this)) {
        profesor.agregarCurso(this);
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }
    
    public void mostrarInfo(){
        System.out.println("Codigo: "+ codigo + "\nNombre: "+ nombre + "\nProfesor: "+ (profesor != null ? profesor.getNombre() : "Sin asignar"));
    }

    public void eliminarProfesor() {
        if (profesor != null) {
           profesor.eliminarCurso(this);
           profesor = null;
        }
    }
}
