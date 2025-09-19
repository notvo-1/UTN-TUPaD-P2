/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad2;

/**
 *
 * @author notvo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CuentaBancaria cb = new CuentaBancaria();
        
        cb.setAlias("matias.cb");
        
        System.out.println("El saldo es: " + cb.getSaldo());
        
        cb.depositar(200);
        System.out.println("El saldo es: " + cb.getSaldo());
        
        //System.out.println(cb.saldoDisponible(100));
        //System.out.println(cb.saldoDisponible(300));
        
        cb.extraer(100);
        System.out.println("El saldo es: " + cb.getSaldo());
        cb.extraer(200);
        System.out.println("El saldo es: " + cb.getSaldo());
        
        System.out.println("El alias es: " + cb.getAlias());
    }
    
}
