/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio12;

/**
 *
 * @author notvo
 */
public class Impuesto {
    private double monto;
    private Contribuyente cont;

    public Impuesto(double monto) {
        this.monto = monto;
    }

    public Contribuyente getCont() {
        return cont;
    }

    public void setCont(Contribuyente cont) {
        this.cont = cont;
    }

    public double getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return "Impuesto{" + "monto=" + monto + ", cont=" + cont + '}';
    }
    
}
