/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad3.Buscar;

import java.util.ArrayList;

/**
 *
 * @author notvo
 */
public class Concesionaria {
    private String nombre;
    private ArrayList<Auto> autos; 

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.autos = new ArrayList<>();
    }
    
    public void agregarAuto(Auto a){
        autos.add(a);
    }
    
    public int cantAutos(){
        return autos.size();
    }
   
    public Auto buscarAuto(String patente){
        Auto autoEncontrado = null;
        int i = 0;
        
        while (i < cantAutos() && !this.autos.get(i).getPatente().equalsIgnoreCase(patente)) {            
            i++;
        }
        if (i<cantAutos()) {
            autoEncontrado = this.autos.get(i);
        }
        return autoEncontrado;
        
    }
}
