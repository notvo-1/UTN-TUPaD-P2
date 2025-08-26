/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;

/**
 *
 * @author notvo
 */
public class Void {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        repetir('A', 5);
        repetir('Z', 7);
        repetir('C', 3);
        repetir('P', 8);
        
        String s = devolverSimbolo('D', 7);
        System.out.println(s);
    }
    static void repetir(char simbolo, int veces){
        for (int i = 0; i < veces; i++) {
            System.out.print(simbolo);
        }
        System.out.println();
    }
    
    static String devolverSimbolo(char simbolo, int veces){
        String cadena = "";
        for (int i = 0; i < veces; i++) {
            cadena = cadena + simbolo;
        }
        System.out.println("");
        return cadena;
        
    }
}
