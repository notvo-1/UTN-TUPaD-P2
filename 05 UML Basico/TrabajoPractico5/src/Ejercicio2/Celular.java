/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author notvo
 */
public class Celular {

    private String imen;
    private String modelo;
    private String marca;
    private Bateria bateria;
    private Usuario usuario;

    public Celular(String imen, String modelo, String marca, Bateria bateria) {
        this.imen = imen;
        this.modelo = modelo;
        this.marca = marca;
        this.bateria = bateria;
    }

    public void mostarInfo() {
        if (usuario != null) {
            System.out.println("El celular " + marca + " modelo:" + modelo
                    + " usuario: " + usuario.getNombre()
                    + " tiene una batería: " + bateria.getModelo()
                    + " (" + bateria.getCapacidad() + "mAh)");
        } else {
            System.out.println("El celular " + marca + " modelo:" + modelo
                    + " usuario: " + "No tiene usuario"
                    + " tiene una batería: " + bateria.getModelo()
                    + " (" + bateria.getCapacidad() + "mAh)");;
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }

}
