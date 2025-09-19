/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author notvo
 */
public class Gallina {
    private static int contadorId = 1;
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    /**
    * Constructor de Gallina.
    *
    * @param edad Edad inicial de la gallina (en meses).
    * @param huevosPuestos Cantidad inicial de huevos que ya puso puede ser 0, no           tiene que ser negativo.
    */
    public Gallina(int edad, int huevosPuestos){
        setHuevosPuestos(huevosPuestos);
        setEdad(edad);
        this.idGallina = idGenerator();
    }

    
    private static int idGenerator() {
        return contadorId++;
    }
    
    public void ponerHuevo(){
        this.huevosPuestos++;
        System.out.println("¡Huevo puesto!");
        System.out.println("----------");
    }
    
    public void envejecer(){
        this.edad++;
        System.out.println("Getting older... sad");
        System.out.println("----------");
    }
    
    public void mostrarEstado(){
        System.out.println("Id: " + this.idGallina);
        System.out.println("Edad: " + this.edad);
        System.out.println("Huevos Puestos: " + this.huevosPuestos);
        System.out.println("----------");
    }
    
    public int getIdGallina() {
        return idGallina;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        if (huevosPuestos >= 0) {
            this.huevosPuestos = huevosPuestos;
        }
    }


    
    
}
