/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asociacion1a1unidireccional;

/**
 *
 * @author notvo
 */
public class Persona {

    private String nombre;
    private Pasaporte pasaporte; // Asociación 1:1

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    public void mostrarPasaporte() {
        if (pasaporte != null) {
            System.out.println(nombre + " tiene pasaporte con número: "
                    + pasaporte.getNumero());
        } else {
            System.out.println(nombre + " no tiene pasaporte.");
        }
    }

}
