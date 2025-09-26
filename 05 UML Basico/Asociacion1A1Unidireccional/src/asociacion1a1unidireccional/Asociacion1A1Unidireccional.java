/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asociacion1a1unidireccional;

/**
 *
 * @author notvo
 */
public class Asociacion1A1Unidireccional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pasaporte pasaporte = new Pasaporte("a123123");
        Persona persona = new Persona("99999");
        
        persona.setPasaporte(pasaporte);
        
        persona.mostrarPasaporte();
        
        System.out.println("-----------");
        
        Persona cristina = new Persona("123123");
        cristina.mostrarPasaporte();
    }
    
}
