/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

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
    static List<Figura> figuras = new ArrayList<>();

    public static void main(String[] args) {

        agregarFigura("circulo", 2);
        agregarFigura("circulo2", 8);
        agregarFigura("circulo3", 15);
        agregarFigura("Rectangulo", 8,10);
        agregarFigura("Rectangulo1", 5, 20);
        agregarFigura("Rectangulo2", 3, 10);
        agregarFigura("Rectangulo3", 20, 30);
        
        mostrarFiguras();
        

    }

    public static void agregarFigura(String nombre, double radio) {
        figuras.add(new Circulo(radio, nombre));
    }

    public static void agregarFigura(String nombre, double lado1, double lado2) {
        figuras.add(new Rectangulo(nombre, lado1, lado2));
    }
    
    public static void mostrarFiguras(){
        for (Figura figura : figuras) {
            System.out.println(figura.getNombre() +" "+ figura.calcularArea());
        }
    }
}
