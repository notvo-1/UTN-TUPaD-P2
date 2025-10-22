/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author notvo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    static List<Empleado> empleados = new ArrayList<>();

    public static void main(String[] args) {
        
        agregarEmpleado("Matias", "Desarrollador", 45, 2);
        agregarEmpleado("Lucas", "Doctor", 40, 3);
        agregarEmpleado("Nico", "FrontEnd", 48, 1);
        agregarEmpleado("Martin", "Redes", 30, 8);
        
        agregarEmpleado("Fernando", "Desarrollador", 30, "Marzo");
        agregarEmpleado("Rodrigo", "Desarrollador", 20, "Abril");
        agregarEmpleado("Agustin", "Desarrollador", 40, "Enero");

        mostrarEmpleados();
        System.out.println(empleados.size());

    }

    public static void agregarEmpleado(String nombre, String area, double horas, int antiguedad ) {
        empleados.add(new EmpleadoPlanta(nombre, area, horas, antiguedad));
    }

    public static void agregarEmpleado(String nombre, String area, double horas, String mesIngreso ) {
        empleados.add(new EmpleadoTemporal(nombre, area, horas, mesIngreso));
    }

    public static void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoPlanta) {
                EmpleadoPlanta empleado1 = (EmpleadoPlanta) empleado;
                System.out.println("Nombre: " + empleado1.getNombre() + " Antiguedad: " + empleado1.getAntiguedad() +" Sueldo: $"+ empleado1.calcularSueldo());
            } else if (empleado instanceof EmpleadoTemporal) {
                EmpleadoTemporal empleado1 = (EmpleadoTemporal) empleado;
                System.out.println("Nombre: " + empleado1.getNombre() + " Mes Ingreso: " + empleado1.getMesIngreso() +" Sueldo: $"+ empleado1.calcularSueldo());
            }
        }
    }
}
