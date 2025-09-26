/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agregacion1a1;

/**
 *
 * @author notvo
 */
public class Agregacion1A1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor v8 = new Motor("V8");
        Auto cadillac = new Auto("Cadillac", v8);
        
        cadillac.mostrarMotor();
        
        cadillac.setMotor(null);
        
        cadillac.mostrarMotor();
        
    }
    
}
