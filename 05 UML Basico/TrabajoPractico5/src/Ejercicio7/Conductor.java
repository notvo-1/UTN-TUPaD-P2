/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author notvo
 */
public class Conductor {

    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        if (vehiculo != null && vehiculo.getConductor() != this) {
            vehiculo.setConductor(this);
        }
    }

    public void mostrarInfo() {
        if (vehiculo != null) {
            System.out.println("Vehiculo: " + vehiculo.getPatente() + " modelo: " + vehiculo.getModelo() + " conductor: " + nombre);
        } else {
            System.out.println("Condunctor: " + nombre  + " licencia: " + licencia + " no tiene vehiculo asociado");
        }
    }

}
