/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author notvo
 */
public class Mesa {
    private String numero;
    private String capacidad;

    public Mesa(String numero, String capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }


    public String getNumero() {
        return numero;
    }


    public String getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        return "Mesa{" + "numero=" + numero + ", capacidad=" + capacidad + '}';
    }
    
    
}
