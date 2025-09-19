/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author notvo
 */
public class CuentaBancaria {
    private String CBU;
    private String alias;
    private double saldo;
    
    public void mostrarDatos(){
        System.out.println("CBU: " + CBU + " " + "Alias: " + alias + " " + "Saldo: " + saldo);
    }

    public String getCBU() {
        return CBU;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        if (alias != null) {
            this.alias = alias;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto){
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depositado: " + monto);
        }
    }
    
    
    
    
    private boolean saldoDisponible(double monto){
        return saldo > monto;
    }
    
    public void extraer(double monto){
        if (saldoDisponible(monto)) {
            saldo -= monto;
            System.out.println("Retirado: " + monto);
        }
        System.out.println("No se puede retirar ese monto.");
    }
}
