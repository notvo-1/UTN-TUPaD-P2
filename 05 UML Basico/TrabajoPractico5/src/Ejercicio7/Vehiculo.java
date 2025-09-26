/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author notvo
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Conductor conductor;
    private Motor motor;

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }

    public Motor getMotor() {
        return motor;
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    public void mostrarInfo(){
        if (conductor != null) {
            System.out.println("Vehiculo: "+patente+" modelo: "+modelo+ " conductor: "+ conductor.getNombre());
        }
        else{
            System.out.println("Vehiculo: "+patente+" modelo: "+modelo+ " no tiene conductor asociado");
        }
    }
    
}
