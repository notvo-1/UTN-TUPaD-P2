/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author notvo
 */
public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora;

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public String getDni() {
        return dni;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if (computadora != null && computadora.getPropietario() != this) {
            computadora.setPropietario(this);
        }
    }

    void mostrarInfo() {
        if (computadora != null) {
            System.out.println("La persona : " +nombre+ " es dueño de la pc modelo "+computadora.getMarca());
        }
        else
        {
            System.out.println("La persona no tiene pcs asociadas.");
        }
    }
    
    
}
