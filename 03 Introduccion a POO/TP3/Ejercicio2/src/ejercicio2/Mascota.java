/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author notvo
 */
public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    void mostrarInfo(){
        System.out.println("Nomre: "+nombre+"; Especie: "+especie+ "; Edad: "+edad);
    }
    void cumplirAnios(int anios){
        if (anios > 0) {
            edad += anios;
        }
    }
}
