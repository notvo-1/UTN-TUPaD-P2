/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1;

/**
 *
 * @author notvo
 */
public class PayPal extends MedioDePago{
    private String email;
    private final double DESCUENTO_PAYPAL = 0.1;

    public PayPal(String email, double saldo) {
        super(saldo);
        this.email = email;
    }

    @Override
    public boolean pagoConDescuento(double totalPedido) {
        double totalConDescuento = totalPedido * (1 - DESCUENTO_PAYPAL);
        return procesarPago(totalConDescuento, false);
    }

    @Override
    public boolean procesarPago(double totalPedido, boolean aplicarDescuento) {
        double saldo = getSaldo();
        if (aplicarDescuento) {
            return pagoConDescuento(totalPedido);
        }
        if (this.email != null && saldo >= totalPedido) {
            saldo -= totalPedido;
            setSaldo(saldo);
            setPagoFinal(totalPedido);
            return true;
        }
        return false;
    }




}
