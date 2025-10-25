/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1;

/**
 *
 * @author notvo
 */
public abstract class MedioDePago implements PagoConDescuento {

    private double saldo;
    private double pagoFinal;

    public double getPagoFinal() {
        return pagoFinal;
    }

    public void setPagoFinal(double pagoFinal) {
        this.pagoFinal = pagoFinal;
    }

    public MedioDePago(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldoNuevo) {
        this.saldo = saldoNuevo;
    }

}
