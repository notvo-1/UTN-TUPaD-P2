/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enums;

/**
 *
 * @author notvo
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private NivelEstudio nivelEstudio;

    public Persona(String nombre, String apellido, NivelEstudio nivelEstudio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nivelEstudio = nivelEstudio;
    }

    public NivelEstudio getNivelEstudio() {
        return nivelEstudio;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", nivelEstudio=" + nivelEstudio + '}';
    }
}
