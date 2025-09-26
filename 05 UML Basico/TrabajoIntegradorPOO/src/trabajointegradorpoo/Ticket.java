/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajointegradorpoo;

/**
 *
 * @author notvo
 */
public class Ticket {
    private String cliente;
    private double montoTotal;
    private double montoPorCuota;

    public Ticket(String cliente, double montoTotal, double montoPorCuota) {
        this.cliente = cliente;
        this.montoTotal = montoTotal;
        this.montoPorCuota = montoPorCuota;
    }

    @Override
    public String toString() {
        return "##############Ticket##############" + "\nCLIENTE: " + cliente + "\nTOTAL:" + montoTotal + "\nMONTO POR CUOTA: " + montoPorCuota + "\n##################################";
    }
    
    
}
