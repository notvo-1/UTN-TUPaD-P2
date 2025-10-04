/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asociacionunidireccional1an;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author notvo
 */
public class Profesor {
    private String nombre;
    private List<Curso> cursos = new ArrayList<Curso>();

    public Profesor(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarCurso(Curso curso){
        this.cursos.add(curso);
    }
    
    public void eliminarCurso(Curso curso){
        this.cursos.remove(curso);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursos() {
        return Collections.unmodifiableList(cursos);
    }
    
    public void mostrarCursos(){
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println("Curso: "+ cursos.get(i).getNombre());
        }
    }
    
    
}
