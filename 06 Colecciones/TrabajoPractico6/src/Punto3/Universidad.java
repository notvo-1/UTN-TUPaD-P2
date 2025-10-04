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
public class Universidad {

    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        cursos.add(c);
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Profesor profesor = buscarProfesorPorID(idProfesor);
        if (!profesores.contains(profesor)) {
            agregarProfesor(profesor);
        }
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        if (!cursos.contains(curso)) {
            agregarCurso(curso);
        }
        if (curso.getProfesor()!= null) {
            curso.eliminarProfesor();
        }

        curso.setProfesor(profesor);
    }

    public Profesor buscarProfesorPorID(String idProfesor) {
        Profesor profesorEncontrado = null;
        int index = 0;
        while (index < profesores.size() && !profesores.get(index).getId().equalsIgnoreCase(idProfesor)) {
            index++;
        }
        if (index < profesores.size()) {
            profesorEncontrado = profesores.get(index);
        }
        return profesorEncontrado;
    }

    public Curso buscarCursoPorCodigo(String codigoCurso) {
        Curso cursoEncontrado = null;
        int index = 0;
        while (index < cursos.size() && !cursos.get(index).getCodigo().equalsIgnoreCase(codigoCurso)) {
            index++;
        }
        if (index < cursos.size()) {
            cursoEncontrado = cursos.get(index);
        }
        return cursoEncontrado;
    }

    public void listarProfesores() {
        for (Profesor profesor : profesores) {
            profesor.mostrarInfo();
        }
    }

    public void listarCursos() {
        for (Curso curso : cursos) {
            curso.mostrarInfo();
        }
    }

    public void eliminarCurso(String codigo) {
        Curso cursoABorrar = buscarCursoPorCodigo(codigo);
        if (cursoABorrar != null) {
            cursoABorrar.eliminarProfesor();
            cursos.remove(cursoABorrar);
        }
    }

    public void eliminarProfesor(String id) {
        Profesor profesorABorrar = buscarProfesorPorID(id);
        if (profesorABorrar != null) {
            profesorABorrar.eliminarTodosCursos();
            profesores.remove(profesorABorrar);
        }
    }

    public List<Profesor> getProfesores() {
        return Collections.unmodifiableList(profesores);
    }

}
