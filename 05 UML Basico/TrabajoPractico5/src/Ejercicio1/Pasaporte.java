/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author notvo
 */
public class Pasaporte {

    private String numero;
    private String fechaEmision;
    private Titular titular;
    private Foto foto;

    public Pasaporte(String numero, String fechaEmision, String foto, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(foto, formato);
    }

    public Titular getTitular() {
        return titular;
    }

    public void infoPasaporte() {
        if (this.titular != null) {
            System.out.println(numero + " esta relacionado con el titular: "
                    + titular.getNombre());
        } else {
            System.out.println(numero + " no tiene un coche relacionado.");
        }
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this){
            titular.setPasaporte(this);
        }
    }

    public String getNumero() {
        return numero;
    }
}
