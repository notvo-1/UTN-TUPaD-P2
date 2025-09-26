/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio12;

/**
 *
 * @author notvo
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora calc;
        Contribuyente cont;
        Impuesto impuesto;
        
        cont = new Contribuyente("Matias Orellana", "12312312312");
        impuesto = new Impuesto(10000);
        calc = new Calculadora();
        
        
        System.out.println(impuesto);
        System.out.println(cont);
        impuesto.setCont(cont);
        
        calc.calcular(impuesto);
        System.out.println(impuesto);
        System.out.println(cont);
    }
    
}
