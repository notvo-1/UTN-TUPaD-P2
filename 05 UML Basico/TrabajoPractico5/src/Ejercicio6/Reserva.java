/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author notvo
 */
public class Reserva {

    private String fecha;
    private String hora;
    private Mesa mesa;
    private Cliente cliente;

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void mostrarReserva() {
        if (cliente != null) {
            System.out.println(cliente.getNombre() + " tiene una reserva para el dia: "
                    + fecha + " a las " + hora + " en la mesa: " + mesa.getNumero());
        } else {
            System.out.println("La reserva no tiene cliente asociado");
        }
    }

    @Override
    public String toString() {
        return "Reserva{" + "fecha=" + fecha + ", hora=" + hora + ", mesa=" + mesa + ", cliente=" + cliente + '}';
    }
    
}
