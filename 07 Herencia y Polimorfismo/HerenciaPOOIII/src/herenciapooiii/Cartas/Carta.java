/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapooiii.Cartas;

/**
 *
 * @author notvo
 */
public abstract class Carta {

    private boolean faceup;

    public void darVuelta() {
        this.faceup = !faceup;
    }

    public void mostrar() {
        if (faceup) {
            System.out.println(getRepresentacion());
        }
        else {
            System.out.println("******************");
        }

    }

    public String getRepresentacion() {
        return "carta pocha";
    }
}
