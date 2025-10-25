/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciointerfaces;

/**
 *
 * @author notvo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CentroEducativo escuela1 = new CentroEducativo();

        Alumno a1 = new Alumno("1231231", "pepe", "mujica");
        Alumno a2 = new Alumno("2222", "jacqui", "tomsich");
        Alumno a3 = new Alumno("4444", "Pixe", "Reina Maxima");
        Alumno a4 = new Alumno("11111", "Dulcan", "Tomsich");
        Alumno a5 = new Alumno("3333", "Matias", "Orellana");
        escuela1.agregarAlumno(a1);
        escuela1.agregarAlumno(a2);
        escuela1.agregarAlumno(a3);
        escuela1.agregarAlumno(a4);
        escuela1.agregarAlumno(a5);
//
//        a1.agregarExamenes(NivelSatisfaccion.SUFICIENTE, "12/12/24");
//        a1.agregarExamenes(NivelSatisfaccion.EXCELENTE, "13/12/24");
//        a1.agregarExamenes(NivelSatisfaccion.EXCELENTE, "14/12/24");
//        a1.agregarExamenes(NivelSatisfaccion.EXCELENTE, "15/12/24");
//        a1.agregarExamenes(NivelSatisfaccion.SUFICIENTE, "16/12/24");
//
//        a2.agregarExamenes(NivelSatisfaccion.SUFICIENTE, "12/12/24");
//        a2.agregarExamenes(NivelSatisfaccion.INSUFICIENTE, "13/12/24");
//        a2.agregarExamenes(NivelSatisfaccion.EXCELENTE, "14/12/24");
//        a2.agregarExamenes(NivelSatisfaccion.EXCELENTE, "15/12/24");
//        a2.agregarExamenes(NivelSatisfaccion.SUFICIENTE, "16/12/24");
//
//        a3.agregarExamenes(NivelSatisfaccion.SUFICIENTE, "12/12/24");
//        a3.agregarExamenes(NivelSatisfaccion.EXCELENTE, "13/12/24");
//        a3.agregarExamenes(NivelSatisfaccion.EXCELENTE, "14/12/24");
//        a3.agregarExamenes(NivelSatisfaccion.EXCELENTE, "15/12/24");
//        a3.agregarExamenes(NivelSatisfaccion.SUFICIENTE, "16/12/24");
//
//        a4.agregarExamenes(NivelSatisfaccion.SUFICIENTE, "12/12/24");
//        a4.agregarExamenes(NivelSatisfaccion.EXCELENTE, "13/12/24");
//        a4.agregarExamenes(NivelSatisfaccion.INSUFICIENTE, "14/12/24");
//        a4.agregarExamenes(NivelSatisfaccion.EXCELENTE, "15/12/24");
//        a4.agregarExamenes(NivelSatisfaccion.SUFICIENTE, "16/12/24");
//
//        a5.agregarExamenes(NivelSatisfaccion.SUFICIENTE, "12/12/24");
//        a5.agregarExamenes(NivelSatisfaccion.EXCELENTE, "13/12/24");
//        a5.agregarExamenes(NivelSatisfaccion.EXCELENTE, "14/12/24");
//        a5.agregarExamenes(NivelSatisfaccion.EXCELENTE, "15/12/24");
//        a5.agregarExamenes(NivelSatisfaccion.SUFICIENTE, "16/12/24");

        a1.agregarExamenes(50, 6, "12/12/24");
        a1.agregarExamenes(30, 7, "13/12/24");
        a1.agregarExamenes(50, 9, "14/12/24");
        a1.agregarExamenes(50, 10, "15/12/24");
        a1.agregarExamenes(50, 8, "16/12/24");

        a2.agregarExamenes(50, 6, "12/12/24");
        a2.agregarExamenes(95, 7, "13/12/24");
        a2.agregarExamenes(50, 9, "14/12/24");
        a2.agregarExamenes(50, 10, "15/12/24");
        a2.agregarExamenes(50, 8, "16/12/24");

        a3.agregarExamenes(50, 6, "12/12/24");
        a3.agregarExamenes(30, 7, "13/12/24");
        a3.agregarExamenes(50, 2, "14/12/24");
        a3.agregarExamenes(50, 10, "15/12/24");
        a3.agregarExamenes(50, 8, "16/12/24");

        a4.agregarExamenes(50, 6, "12/12/24");
        a4.agregarExamenes(30, 7, "13/12/24");
        a4.agregarExamenes(50, 9, "14/12/24");
        a4.agregarExamenes(50, 10, "15/12/24");
        a4.agregarExamenes(50, 8, "16/12/24");

        a5.agregarExamenes(50, 6, "12/12/24");
        a5.agregarExamenes(30, 7, "13/12/24");
        a5.agregarExamenes(50, 9, "14/12/24");
        a5.agregarExamenes(100, 10, "15/12/24");
        a5.agregarExamenes(50, 8, "16/12/24");
        
        System.out.println("Aprobados: " + escuela1.cantAprobados());

        escuela1.nombreAprobados();
        


    }
}
