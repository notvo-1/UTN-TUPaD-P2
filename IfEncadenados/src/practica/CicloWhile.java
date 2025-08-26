/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;

/**
 *
 * @author notvo
 */
public class CicloWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hola");
        int cont = 1;
        
        while (cont <= 5) {            
            System.out.println(cont + " Debo aprender ciclos");
            cont++; //cont = cont + 1;
        }
        System.out.println("/////////////////////");
        cont = 5;
        
        while (cont >= 1 ) {            
            System.out.println(cont + " Debo aprender ciclos");
            cont--;// cont = cont - 1;
        }
        
        System.out.println("Chau");
    }
}
