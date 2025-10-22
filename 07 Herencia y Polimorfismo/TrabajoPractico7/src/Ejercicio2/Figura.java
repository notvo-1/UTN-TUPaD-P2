/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;


/**
 *
 * @author notvo
 */
public abstract class Figura {
    private String nombre;


    public Figura(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract double calcularArea();

    public String getNombre() {
        return nombre;
    }
    

}
