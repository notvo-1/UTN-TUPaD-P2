/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author notvo
 */
public class Profesor {

    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
        }
    }

    public void eliminarCurso(Curso c) {
        if (c != null) {
            cursos.remove(c);
        }
    }

    public void listarCursos() {
        int index = 1;
        for (Curso curso : cursos) {
            System.out.println("\n" + index + "- "+curso.getNombre());
//            curso.mostrarInfo();
            index++;
        }
    }

    public void mostrarInfo() {
        System.out.println("Id: " + id + "\nNombre: " + nombre + "\nEspecialidad: " + especialidad + "\nCursos: " + cursos.size());
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Curso> getCursos() {
        return Collections.unmodifiableList(cursos);
    }

    void eliminarTodosCursos() {
        for (Curso curso : cursos) {
            curso.setProfesor(null);
        }
    }

}
