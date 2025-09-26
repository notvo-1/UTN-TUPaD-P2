/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author notvo
 */
public class Titular {

    private String nombre;
    private String dni;
    private Pasaporte pasaporte;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if (pasaporte != null && pasaporte.getTitular() != this){
            pasaporte.setTitular(this);
        }
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void infoTitular() {
        if (this.pasaporte != null) {
            System.out.println(nombre + " esta relacionado con el pasaporte: "
                    + pasaporte.getNumero());
        } else {
            System.out.println(nombre + " no tiene un coche relacionado.");
        }
    }
    
    

}
