/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author notvo
 */
public class TarjetaDeCredito {

    private String numero;
    private String fechaVencimiento;
    private Banco banco;
    private Cliente titular;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
        if (titular != null && titular.getTarjeta() != this) {
            titular.setTarjeta(this);
        }
    }
    
    public String getNombreBanco(){
        return banco.getNombre();
    }
    
    public String getNumero() {
        return numero;
    }

    public void mostrarInfo() {
        if (titular != null) {
            System.out.println("La tarjeta " + numero + " pertenece a: "
                    + titular.getNombre() + " (DNI: " + titular.getDni() + ")"
                    + "Banco: "+ (banco != null ? banco.getNombre() : "sin banco asociado"));
        } else {
            System.out.println("La tarjeta " + numero + " no tiene cliente asignado.");
        }
    }

}
