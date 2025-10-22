/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author notvo
 */
public class Moto extends Vehiculo {
    private int anchoDeManubrio;

    public Moto(int anchoDeManubrio, String marca, String modelo, String patenta) {
        super(marca, modelo, patenta);
        this.anchoDeManubrio = anchoDeManubrio;
    }
    
    public void hacerWheelie(){
        System.out.println("Hace wheelie.");
    }
}
