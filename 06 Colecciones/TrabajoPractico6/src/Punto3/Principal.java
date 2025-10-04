/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Punto3;

import java.util.List;

/**
 *
 * @author notvo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Universidad uni = new Universidad("UTN");

        //Punto1 y 2
        cargarDatos(uni);

//        Punto3
        String codigo = "C001";
        String id = "P001";
        uni.asignarProfesorACurso(codigo, id);
//        uni.buscarCursoPorCodigo(codigo).mostrarInfo();
//        System.out.println("-----------------");
//        uni.buscarProfesorPorID(id).mostrarInfo();

        //Punto4
//        System.out.println("Lista Cursos:");
//        uni.listarCursos();
//        System.out.println("-----------------");
//        System.out.println("Lista profesores: ");
//        uni.listarProfesores();

        //Punto5
        
//        System.out.println("Antes del cambio");
//        uni.buscarCursoPorCodigo("C004").mostrarInfo();
//        uni.buscarProfesorPorID("P002").mostrarInfo();
//        System.out.println("-----------------");
//        System.out.println("Asignar cambio");
//        System.out.println("-----------------");
        uni.asignarProfesorACurso("C004", "P002");
//        uni.buscarCursoPorCodigo("C004").mostrarInfo();
//        uni.buscarProfesorPorID("P002").mostrarInfo();

        //Punto6
//        System.out.println("-------------------");
//        uni.buscarProfesorPorID("P002").listarCursos();
//        System.out.println("-------------------");
//        uni.eliminarCurso("C004");
//        System.out.println("Curso C004 eliminado.");
//        uni.buscarProfesorPorID("P002").listarCursos();
//        System.out.println("-------------------");
        
        //Punto7
//        System.out.println("--------------");
//        uni.listarCursos();
//        System.out.println("--------------");
//        System.out.println("Curso eliminado");
//        uni.eliminarProfesor("P002");
//        uni.listarCursos();
//        System.out.println("--------------");
        
        //Punto8
        
        System.out.println("Reporte:");
        List<Profesor> profesores = uni.getProfesores();
        for (Profesor profesor : profesores) {
            System.out.println("-----");
            System.out.println("Profesor: " + profesor.getNombre() + "\nCantidad de cursos: "+ profesor.getCursos().size());
            profesor.listarCursos();
        }
        
        
    }
    

    private static void cargarDatos(Universidad uni) {
        Profesor ana = new Profesor("P001", "Ana García", "Programación");
        Profesor carlos = new Profesor("P002", "Carlos López", "Base de Datos");
        Profesor maria = new Profesor("P003", "María Fernández", "Matemáticas");

        Curso p1 = new Curso("C001", "Programación I");
        Curso bd = new Curso("C002", "Base de Datos");
        Curso al = new Curso("C003", "Algoritmos");
        Curso md = new Curso("C004", "Matemática Discreta");
        Curso ed = new Curso("C005", "Estructuras de Datos");

        uni.agregarProfesor(ana);
        uni.agregarProfesor(carlos);
        uni.agregarProfesor(maria);

        uni.agregarCurso(p1);
        uni.agregarCurso(bd);
        uni.agregarCurso(al);
        uni.agregarCurso(md);
        uni.agregarCurso(ed);

        uni.asignarProfesorACurso("C002", "P002");
        uni.asignarProfesorACurso("C003", "P002");
        uni.asignarProfesorACurso("C004", "P003");
        uni.asignarProfesorACurso("C005", "P003");

    }

}
