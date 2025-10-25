/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1;

/**
 *
 * @author notvo
 */
public class TarjetaCredito extends MedioDePago {

    private String numTarjeta;
    private final double DESCUENTO_TARJETA = 0.2;

    public TarjetaCredito(String numTarjeta, double saldo) {
        super(saldo);
        this.numTarjeta = numTarjeta;
    }

    @Override
    public boolean pagoConDescuento(double totalPedido) {
        double totalConDescuento = totalPedido * (1 - DESCUENTO_TARJETA);
        return procesarPago(totalConDescuento, false);
    }

    @Override
    public boolean procesarPago(double totalPedido, boolean aplicarDescuento) {
        double saldo = getSaldo();
        if (aplicarDescuento) {
            return pagoConDescuento(totalPedido);
        }
        if (numTarjeta != null && saldo >= totalPedido) {
            saldo -= totalPedido;
            setSaldo(saldo);
            setPagoFinal(totalPedido);
            return true;
        }
        return false;
    }

}
