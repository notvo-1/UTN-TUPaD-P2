/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author notvo
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Celular c1;
        Bateria b1;
        Usuario u1;
        
        b1 = new Bateria("Super grande", "5000");
        c1 = new Celular("MMSM123", "S21", "Samsung", b1);
        u1 = new Usuario("Matias Orellana", "2312312312");
        
        c1.mostarInfo();
        c1.setUsuario(u1);
        c1.mostarInfo();
    }
    
}
