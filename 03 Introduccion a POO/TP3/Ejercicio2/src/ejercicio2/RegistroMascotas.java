/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author notvo
 */
public class RegistroMascotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascota m1 = new Mascota();
        
        m1.nombre = "Kumori";
        m1.especie = "Gato";
        m1.edad = 1;
        
        
        m1.mostrarInfo();
        m1.cumplirAnios(1);
        m1.mostrarInfo();
        m1.cumplirAnios(1);
        m1.mostrarInfo();
        m1.cumplirAnios(1);
        m1.mostrarInfo();
        
    }
    
}
