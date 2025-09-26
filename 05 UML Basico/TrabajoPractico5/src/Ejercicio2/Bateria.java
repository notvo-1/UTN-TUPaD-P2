/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author notvo
 */
public class Bateria {
    private String modelo;
    private String capacidad;

    public Bateria(String modelo, String capaidad) {
        this.modelo = modelo;
        this.capacidad = capaidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapaidad(String capaidad) {
        this.capacidad = capaidad;
    }
}
