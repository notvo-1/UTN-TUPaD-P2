/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author notvo
 */
public class Gato extends Animal {

    @Override
    public void describirAnimal() {
        System.out.println("Soy un gato. Mi humano me sirve");
    }

    @Override
    public void hacerSonido() {
        System.out.println("Te ignora... ");
    }
}
