/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author notvo
 */
public abstract class Empleado {
    private String nombre;
    private String area;
    private double horasTrabajadas;

    public String getNombre() {
        return nombre;
    }
    final private double PRECIO_HORA = 20;

    public Empleado(String nombre, String area, double horasTrabajadas) {
        this.nombre = nombre;
        this.area = area;
        this.horasTrabajadas = horasTrabajadas;
    }


    
    public double calcularSueldo(){
        return horasTrabajadas * PRECIO_HORA;
    };


    
    
    
}
