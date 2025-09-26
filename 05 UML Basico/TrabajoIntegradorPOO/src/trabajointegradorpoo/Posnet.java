/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajointegradorpoo;

/**
 *
 * @author notvo
 */
public class Posnet {

    final static double RECARGO_POR_CUOTA = 0.03;
    final static int MIN_CANT_CUOTAS = 1;
    final static int MAX_CANT_CUOTAS = 6;

    public Ticket efectuarPago(TarjetaDeCredito tarjeta, double montoCobrar, int cuotas) {
        Ticket ticketCompra = null;
        if (validarDatosCompra(tarjeta, montoCobrar, cuotas)) {
            double montoTotal = montoCobrar + montoCobrar * interesesCuotas(cuotas);
            double montoPorCuota = montoTotal / cuotas;
            String cliente = tarjeta.getCliente();
            cobrar(tarjeta, montoTotal);
            ticketCompra = new Ticket(cliente, montoTotal, montoPorCuota);
        }
        return ticketCompra;
    }

    private boolean validarDatosCompra(TarjetaDeCredito tarjeta, double montoCobrar, int cuotas) {
        return (tarjeta != null && tarjeta.validarGasto(montoCobrar) && montoCobrar > 0 && validarCuotas(cuotas));
    }

    private boolean validarCuotas(int cuotas) {
        return cuotas >= MIN_CANT_CUOTAS && cuotas <= MAX_CANT_CUOTAS;
    }

    private double interesesCuotas(int cuotas) {
        return (cuotas -1) * RECARGO_POR_CUOTA;
    }

    private void cobrar(TarjetaDeCredito tarjeta, double montoTotal) {
        tarjeta.realizarGasto(montoTotal);
    }

}
