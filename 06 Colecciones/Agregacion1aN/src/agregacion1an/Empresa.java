/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agregacion1an;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author notvo
 */
public class Empresa {
    private String nombre;
    private List<Empleado> empleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }
    
    public void agregarEmpleado(Empleado emp){
        if (emp != null && !empleados.contains(emp)) {
            this.empleados.add(emp);
        }
    }
    
    public void eliminarEmpleado(Empleado emp){
        if (emp != null && empleados.contains(emp)){
            this.empleados.remove(emp);
        }
    }
    
    public void mostarEmpleado(){
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println("Empleado: "+empleados.get(i).getNombre());
        }
    }
    
    
    public List<Empleado> getEmpleados(){
        return Collections.unmodifiableList(empleados); 
    }
}
