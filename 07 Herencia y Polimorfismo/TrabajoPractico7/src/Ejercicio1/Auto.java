/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author notvo
 */
public class Auto extends Vehiculo {
    private int cantidadDePuertas;

    public Auto(int cantidadDePuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadDePuertas = cantidadDePuertas;
    }
    
    
    @Override
    public String mostrarInfo(){
        return "Cantidad de Puertas: "+cantidadDePuertas + super.mostrarInfo();
    }
    
}
