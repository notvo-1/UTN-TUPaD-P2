/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author notvo
 */
public class Auto extends Vehiculo {

    private boolean tieneAire;
    private boolean aireEncendido = false;

    public Auto(String marca, String modelo, String patente) {
        super(marca, modelo, patente);
    }
    
    public void prenderAire() {
        if (aireEncendido) {
            System.out.println("El aire esta encendido.");
        } else {
            if (tieneAire) {
                System.out.println("Aire encendido");
                aireEncendido = true;
            } else {
                System.out.println("El vehiculo no tiene aire");
            }
        }
    }

}
