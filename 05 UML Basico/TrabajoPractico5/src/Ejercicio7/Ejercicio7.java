/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author notvo
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor motor;
        Conductor conductor;
        Vehiculo vehiculo;
        
        conductor = new Conductor("Matias Orellana", "12312312312");
        motor = new Motor("V8", "1212312312");
        vehiculo = new Vehiculo("ABC123", "Alta Nave", motor);
        
        conductor.mostrarInfo();
        vehiculo.mostrarInfo();
        System.out.println(motor);
        
        conductor.setVehiculo(vehiculo);
                
        conductor.mostrarInfo();
        vehiculo.mostrarInfo();
        System.out.println(motor);
                
    }
    
}
