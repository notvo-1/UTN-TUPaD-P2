/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author notvo
 */
public class EmpleadoPlanta extends Empleado {
    final private int EXTRA_PLANTA = 300;
    private int antiguedad;

    public EmpleadoPlanta(String nombre, String area, double horasTrabajadas, int antiguedad) {
        super(nombre, area, horasTrabajadas);
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }
    
    @Override
    public double calcularSueldo() {
        return super.calcularSueldo() + EXTRA_PLANTA;
    }
}
