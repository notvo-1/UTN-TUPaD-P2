/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio14;

/**
 *
 * @author notvo
 */
public class EditorVideo {

    public EditorVideo() {
    }
    
    public void exportar(String formato, Proyecto proyecto){
        Render nuevoRender = new Render(formato, proyecto);
        System.out.println("El proyecto se esta exportando: "+ proyecto.getNombre()+ " En formato "+ formato);
    }
}
