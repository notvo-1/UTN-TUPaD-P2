/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1;

/**
 *
 * @author notvo
 */
public class Cliente implements Notificable {

    private String nombre;
    private Pedido pedido;
    private MedioDePago medioPago;
    private double total;

    public void agregarProductoAPedido(String nombre, double precio) {
        pedido.agregarProducto(nombre, precio);
    }

    public Cliente(String nombre, boolean descuento) {
        this.nombre = nombre;
        this.pedido = new Pedido(descuento);
    }

    public void agregarMetodoPagoPaypal(String email, double saldo) {
        this.medioPago = new PayPal(email, saldo);
    }

    public void agregarMetodoPagoTarjeta(String numTarjeta, double saldo) {
        this.medioPago = new TarjetaCredito(numTarjeta, saldo);
    }

    public void setTotal() {
        this.total = pedido.calcularTotal();
    }

    public void getSaldoTarjeta() {
        if (medioPago != null) {
            System.out.println("saldo: " + medioPago.getSaldo());
        }
    }

    public double getTotal() {
        return this.total;
    }

    public void pagarPedido() {
        this.total = pedido.calcularTotal();
        boolean pagado = medioPago.procesarPago(this.total, pedido.isDescuento());

        notificar(pagado);

    }

    @Override
    public void notificar(boolean estado) {
        if (estado) {
            System.out.println("Pedido pagado! total: " + medioPago.getPagoFinal());
        } else {
            System.out.println("El pedido no pagado.");
        }
    }

}
