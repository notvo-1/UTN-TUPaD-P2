/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejericicio10;

/**
 *
 * @author notvo
 */
public class CuentaBancaria {

    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo, ultimaModificacion);
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuenta() != this) {
            titular.setCuenta(this);
        }
    }

    public ClaveSeguridad getClave() {
        return clave;
    }
    

    
    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public void mostrarInfo() {
        if (titular != null) {
            System.out.println("La cuenta con cbu: " + cbu + " tiene de titular: " + titular.getNombre() + " con DNI: " + titular.getDni());
        } else {
            System.out.println("La cuenta con cbu: " + cbu + " no tiene titular asociado.");
        }
    }

}
