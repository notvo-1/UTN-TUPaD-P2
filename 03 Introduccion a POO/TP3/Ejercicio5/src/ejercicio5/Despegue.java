/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author notvo
 */
public class Despegue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        NaveEspacial nave1 = new NaveEspacial("El Coloso", 50);
        
        nave1.mostrarEstado();
        nave1.avanzar(1000);
        nave1.despegar();
        nave1.mostrarEstado();
        nave1.avanzar(1000);
        nave1.recargarCombustible(1600);
        nave1.mostrarEstado();
        nave1.recargarCombustible(1500);
        nave1.avanzar(1000);
        nave1.mostrarEstado();
        nave1.avanzar(500);
        nave1.mostrarEstado();

        
    }
    
}
