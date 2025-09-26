/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author notvo
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pasaporte p1;
        Titular t1;
        
        p1 = new Pasaporte("1231412312", "12/03/2025", "mati.jpg", "4x4");
        t1 = new Titular("Matias Orellana", "3423523");
        
        p1.infoPasaporte();
        t1.infoTitular();
        p1.setTitular(t1);
        t1.infoTitular();
        p1.infoPasaporte();

        
        
        
    }
    
}
