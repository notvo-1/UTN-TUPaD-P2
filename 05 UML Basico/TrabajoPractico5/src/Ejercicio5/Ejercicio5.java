/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author notvo
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computadora computadora;
        Propietario due�o;
        
        computadora = new Computadora("Asus", "2131231231", "A1", "Z790");
        due�o = new Propietario("Matias Orellana", "123131312");
        
        computadora.mostrarInfo();
        due�o.mostrarInfo();
        computadora.setPropietario(due�o);
        computadora.mostrarInfo();
        due�o.mostrarInfo();
        
        
    }
    
}
