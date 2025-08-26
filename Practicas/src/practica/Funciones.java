/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;

/**
 *
 * @author notvo
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = siguiente(9);
        int y = doble(x);
        
        System.out.println(y);
        
    }
    static int siguiente (int num){
        return num + 1;
    }
    
    static int doble ( int num){
        return num * 2;
    }
}
