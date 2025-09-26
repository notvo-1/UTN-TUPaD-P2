/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author notvo
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CitaMedica cita;
        Profesional medico;
        Paciente paciente;

        cita = new CitaMedica("22/'9/2025", "15:00");
        medico = new Profesional("Doctor Vega", "Oftalmologo");
        paciente = new Paciente("Matias Orellana", "Social Mutual");
        
        
        System.out.println(cita);
        System.out.println(medico);
        System.out.println(paciente);
        cita.setPaciente(paciente);
        cita.setProfesional(medico);
        System.out.println(cita);
        System.out.println(medico);
        System.out.println(paciente);
        
        
    }

}
