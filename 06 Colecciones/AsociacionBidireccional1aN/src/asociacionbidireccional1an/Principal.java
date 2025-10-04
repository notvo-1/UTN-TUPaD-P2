/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asociacionbidireccional1an;

/**
 *
 * @author notvo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear departamentos
        Departamento rrhh = new Departamento("Recursos Humanos");
        Departamento ventas = new Departamento("Ventas");
// Crear empleados
        Empleado ana = new Empleado("Ana Martínez", "Gerente RRHH");
        Empleado carlos = new Empleado("Carlos López", "Asistente");
        Empleado elena = new Empleado("Elena Sánchez", "Vendedora");
// Establecer relaciones bidireccionales (por lado del departamento)
        rrhh.agregarEmpleado(ana);
        rrhh.agregarEmpleado(carlos);
        ventas.agregarEmpleado(elena);
// Verificar la relación bidireccional
        System.out.println("Departamento de Ana: "
                + ana.getDepartamento().getNombre());
// Cambiar un empleado de departamento (por lado del empleado)
        carlos.setDepartamento(ventas);
// Mostrar empleados por departamento
        System.out.println("\nEmpleados de RRHH:");
        for (Empleado e : rrhh.getEmpleados()) {
            System.out.println(" - " + e.getNombre());
        }
        System.out.println("\nEmpleados de Ventas:");
        for (Empleado e : ventas.getEmpleados()) {
            System.out.println(" - " + e.getNombre());
        }

    }

}
