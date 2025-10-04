/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maximoyminimo;

/**
 *
 * @author notvo
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Concesionaria c = new Concesionaria("FakeCar");

        // Autos para testear
        c.agregarAuto(new Auto("ABC123", "Rojo", 1003));
        c.agregarAuto(new Auto("DEF456", "Negro", 4000));
        c.agregarAuto(new Auto("BCD234", "Verde", 2000));
        c.agregarAuto(new Auto("DEF458", "Blanco", 4000));
        c.agregarAuto(new Auto("CDE345", "Azul", 3000));
        c.agregarAuto(new Auto("DEF457", "Gris", 4000));

        System.out.println("Autos con mayor cant de kms recorridos: " + c.autosMasKmsRecorridos());
        //System.out.println("Auto con menor cant de kms recorridos: " + c.autoMenosKmsRecorridos());    }

    }
}
