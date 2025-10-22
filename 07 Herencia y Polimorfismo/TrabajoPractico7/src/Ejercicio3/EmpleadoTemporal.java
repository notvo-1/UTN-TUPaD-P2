/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author notvo
 */
public class EmpleadoTemporal extends Empleado {
    final private double EXTRA_EVENTUAL = 200;
    private String mesIngreso;

    public EmpleadoTemporal(String nombre, String area, double horasTrabajadas, String mesIngreso) {
        super(nombre, area, horasTrabajadas);
        this.mesIngreso = mesIngreso;
    }

    public String getMesIngreso() {
        return mesIngreso;
    }



    @Override
    public double calcularSueldo() {
        return super.calcularSueldo() + EXTRA_EVENTUAL;
    }
    
    
}
