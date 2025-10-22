/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author notvo
 */
public class Vehiculo {

    private String marca;
    private String modelo;
    private String patenta;
    private int velocidad = 0;
    private boolean encendido = false;

    public Vehiculo(String marca, String modelo, String patenta) {
        this.marca = marca;
        this.modelo = modelo;
        this.patenta = patenta;
    }

    public void acelerar(int kilometrosHora) {
        if (encendido) {
            System.out.println("Aceleranto");
            velocidad = +kilometrosHora;
        } else {
            System.out.println("Encienda el auto primero.");
        }

    }

    public void frenar() {
        if (velocidad != 0) {
            System.out.println("frenando");
        } else {
            System.out.println("El vehiculo esta detenido.");
        }
    }

    public void encender() {
        if (!encendido) {
            System.out.println("El vehiculo esta encendido");
            encendido = true;
        } else {
            System.out.println("El vehiculo ya esta encendido.");
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPatenta() {
        return patenta;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", patenta=" + patenta + ", velocidad=" + velocidad + ", encendido=" + encendido + '}';
    }
}
