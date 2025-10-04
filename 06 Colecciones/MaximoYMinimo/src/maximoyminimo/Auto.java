/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maximoyminimo;

/**
 *
 * @author notvo
 */
public class Auto {
    private String patente;
    private String color;
    private int kmRecorridos;

    public Auto(String patente, String color, int kmRecorridos) {
        this.patente = patente;
        this.color = color;
        this.kmRecorridos = kmRecorridos;
    }

    public int getKmRecorridos() {
        return kmRecorridos;
    }

    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", color=" + color + ", kmRecorridos=" + kmRecorridos + '}';
    }
    
    
}
