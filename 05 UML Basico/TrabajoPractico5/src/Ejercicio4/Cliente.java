/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author notvo
 */
public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }


    public String getDni() {
        return dni;
    }


    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
        if (tarjeta != null && tarjeta.getTitular() != this){
            tarjeta.setTitular(this);
        }
    }
    
        public void mostrarInfo() {
        if (tarjeta != null) {
            System.out.println("El cliente " + nombre + " tiene la tarjeta asociada numero " 
                    + tarjeta.getNumero() + " que pertenece al banco: " 
                    + tarjeta.getNombreBanco());
        } else {
            System.out.println("El cliente " + nombre + " no tiene tarjeta asociada.");
        }
    }

    
    
}
