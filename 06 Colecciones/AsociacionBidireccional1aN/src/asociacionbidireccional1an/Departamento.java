/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asociacionbidireccional1an;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author notvo
 */
public class Departamento {

    private String nombre;
    private List empleados = new ArrayList<>();

    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
// Método crítico para mantener la coherencia bidireccional

    public void agregarEmpleado(Empleado emp) {
// Validación
        if (emp == null) {
            throw new IllegalArgumentException("El empleado no puede ser nulo");
        }
// Evitar duplicados
        if (!empleados.contains(emp)) {
            empleados.add(emp); // Mantener consistencia bidireccional
// Esta verificación evita recursión infinita
            if (emp.getDepartamento() != this) {
                emp.setDepartamento(this);
            }
        }
    }

    public void eliminarEmpleado(Empleado emp) {
        if (emp != null && empleados.contains(emp)) {
            empleados.remove(emp);
// Mantener consistencia bidireccional
            if (emp.getDepartamento() == this) {
                emp.setDepartamento(null);
            }
        }
    }

    public List<Empleado> getEmpleados() {
        return Collections.unmodifiableList(empleados);
    }

}
