/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

import java.util.Scanner;

/**
 * 3. Clasificaci�n de Edad. Escribe un programa en Java que solicite al usuario
 * su edad y clasifique su etapa de vida seg�n la siguiente tabla: Menor de 12
 * a�os: "Ni�o" Entre 12 y 17 a�os: "Adolescente" Entre 18 y 59 a�os: "Adulto"
 * 60 a�os o m�s: "Adulto mayor" Ejemplo de entrada/salida: Ingrese su edad: 25
 * Eres un Adulto. Ingrese su edad: 10 Eres un Ni�o.
 *
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        

        edad = Funciones.validarEntero("Ingrese su edad", "positivo");
        Funciones.clasificarEdad(edad);
        
        int[] ages;
        
        ages = Funciones.crearArray(7);
        
        for (int i = 0; i < ages.length; i++) {
            Funciones.clasificarEdad(ages[i]);
        }
//        int[] edades;
//        edades = Funciones.crearArray(4);
//        Funciones.clasificacionRangos(edades, 4);
    }



    
}
