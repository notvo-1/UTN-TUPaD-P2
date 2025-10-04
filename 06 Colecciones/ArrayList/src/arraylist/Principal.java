/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;

import java.util.ArrayList;

/**
 *
 * @author notvo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto a1 = new Auto("ABC123", "Verde");
        Auto a2 = new Auto("DEF456", "Rojo");
//        Auto a3 = new Auto("GHI789", "Azul");

        ArrayList<Auto> misAutos = new ArrayList<>();

        System.out.println(misAutos.size());
        System.out.println(misAutos);

        System.out.println("**********************");

        misAutos.add(a1);
        System.out.println(misAutos.size());
        System.out.println(misAutos);

        System.out.println("**********************");

        misAutos.add(a2);
        System.out.println(misAutos.size());
        System.out.println(misAutos);

        System.out.println("**********************");

        misAutos.add(new Auto("GHI789", "Azul"));
        System.out.println(misAutos.size());
        System.out.println(misAutos);

        System.out.println("**********************");

        System.out.println("El segundo auto de la lista es: " + misAutos.get(1));

        System.out.println("**********************");

        for (int i = 0; i < misAutos.size(); i++) {

            System.out.println("El auto en la posicion " + i + " es: " + misAutos.get(i));
        }

        System.out.println("**********************");

        misAutos.remove(0);
        System.out.println(misAutos.size());
        System.out.println(misAutos);

    }

}
