/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author notvo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    static List<Animal> animales = new ArrayList<>();
    public static void main(String[] args) {
        
        Animal vaca1 = new Vaca();
        Animal perro = new Perro();
        Animal gato = new Gato();
        
        agregarAnimal(vaca1);
        agregarAnimal(perro);
        agregarAnimal(gato);
        
        mostrarAnimales();  
        
    }
    public static void agregarAnimal(Animal animal){
        animales.add(animal);
    }
    
    public static void mostrarAnimales(){
        for (Animal animal : animales) {
            animal.describirAnimal();
            animal.hacerSonido();
        }
    }
}
