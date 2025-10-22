/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Herencia;

/**
 *
 * @author notvo
 */
public class Pincipal {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto auto = new Auto("Honda", "noseque", "takas123");
        Moto moto = new Moto(30, "Zannella", "Patagonian", "sdasdad");
        
        auto.encender();
        System.out.println(auto.getMarca());
        
        
        auto.prenderAire();
        Vehiculo a = auto;
        // a.prenderAire();  // no lo encuentra El upcasting oculta los metodos de la subclase para poder generalizar.
        // Auto a3 = a; // no se puede porque java pide que hagamos el downcasting explicito simplemente, no como el upcasting.

        Auto a2 = (Auto) a; // esto seria forzar el downcasting como castear un double en una multiplicacion. 
        a2.prenderAire();
        //puedo hacer asi para no gastar una variable. Pero no tengo persistencia del downcasting
        ((Auto) a).prenderAire(); // no gasto un espacio, no creo una variable pero tampoco persiste el downcasting.
        
        // las clases abstractas son clases que no se pueden isntancias pero si puedo declarar un objeto de tipo clase abstracta porque nomrlamente una clase abstracta es una clase
        // padre. Enotnces puedo declarar un Vehiculo v = new Auto(); pero no Vehiculo v = new Vehiculo();
        
        
        
        System.out.println(auto);
        System.out.println(moto);
        
        
    }
    
}
