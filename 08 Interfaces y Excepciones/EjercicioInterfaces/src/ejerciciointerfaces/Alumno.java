/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointerfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author notvo
 */
public class Alumno implements Aprobable{
    private ArrayList<Examen> examenes;
    private String dni;
    private String nombre;
    private String apellido;

    public Alumno(String dni, String nombre, String apellido) {
        this.examenes = new ArrayList<>();
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public void agregarExamenes(int duracion, int nota, String fecha){
        this.examenes.add(new ExamenEscrito(duracion, nota, fecha));
    }
    public void agregarExamenes(NivelSatisfaccion satisfaccion, String fecha){
        this.examenes.add(new ExamenOral(satisfaccion, fecha));
    }
    
    
    @Override
    public boolean aprobo() {
        int aprobados = 0;
         while (aprobados < examenes.size() && this.examenes.get(aprobados).aprobo()) {            
            aprobados++;
        }
        return aprobados == examenes.size() && !examenes.isEmpty();
    }

    public String getNombre() {
        return this.nombre;
    }

    public List<Examen> getExamenes() {
        return Collections.unmodifiableList(examenes);
    }
    
}
