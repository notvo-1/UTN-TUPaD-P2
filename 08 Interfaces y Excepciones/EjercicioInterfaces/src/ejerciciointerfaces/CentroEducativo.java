/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointerfaces;

import java.util.ArrayList;

/**
 *
 * @author notvo
 */
public class CentroEducativo {
    private ArrayList<Alumno> alumnos;

    public CentroEducativo() {
        this.alumnos = new ArrayList<>();
    }
    
    public void agregarAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }
    
    public void agregarAlumno(String dni, String nombre, String apellido){
        this.alumnos.add(new Alumno(dni, nombre, apellido));
    }
    
    public int cantAprobados(){
        int aprobados = 0;
        for (Alumno alumno : alumnos) {
            if (alumno.aprobo()) {
                aprobados++;
            }
        }
        return aprobados;
    }
    
    public void nombreAprobados(){
        for (Alumno alumno : alumnos) {
//            System.out.println("alumno: " + alumno.getNombre() + "examenes: "+alumno.getExamenes().size());
            if (alumno.aprobo()) {
                System.out.println(alumno.getNombre());
            }
        }
    }
}
