/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto2;

/**
 *
 * @author notvo
 */
public class Autor {

    private String ID;
    private String nombre;
    private String nacionalidad;



    public Autor(String ID, String nombre, String nacionalidad) {
        this.ID = ID;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void mostrarInfo() {
        System.out.println("Autor{" + "ID=" + ID + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}');
    }
}
