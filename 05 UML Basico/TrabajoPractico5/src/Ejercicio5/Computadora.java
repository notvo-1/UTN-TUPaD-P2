/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author notvo
 */
public class Computadora {

    private String marca;
    private String numeroSerie;
    private Propietario propietario;
    private PlacaMadre placa;

    public Computadora(String marca, String numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placa = new PlacaMadre(modelo, chipset);
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }

    void mostrarInfo() {
        if (propietario != null) {
            System.out.println("La pc marca: " + marca + " pertenece a: " 
                    + propietario.getNombre() + " (DNI: " + propietario.getDni() + ")"
                    + "y su chipset es : " + placa.getChipset());
        } else {
            System.out.println("La pc " + marca + " no tiene dueño asignado.");
        }
    }

    public String getMarca() {
        return marca;
    }

}
