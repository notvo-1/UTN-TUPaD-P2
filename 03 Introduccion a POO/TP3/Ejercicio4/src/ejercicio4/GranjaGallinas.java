/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author notvo
 */
public class GranjaGallinas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Gallina g1; 
        Gallina g2;
        Gallina g3;
        //aca estoy creando la variable tipo Gallina pero no he instanciado el objeto Gallina todavia. Si trato de llamar a un metodo de la clase va a dar error. 
        
        g1 = new Gallina(2, 3);
        g2 = new Gallina(3,0);
        g3 = new Gallina(1,0);
        
        System.out.println("GALLINA 1");
        
        g1.mostrarEstado();
        g1.ponerHuevo();
        g1.mostrarEstado();
        g1.envejecer();
        g1.mostrarEstado();
        g1.ponerHuevo();
        g1.ponerHuevo();
        g1.envejecer();
        g1.mostrarEstado();
        
        System.out.println("###############################");
        System.out.println("GALLINA 2");
                
        g2.mostrarEstado();
        g2.ponerHuevo();
        g2.ponerHuevo();
        g2.mostrarEstado();
        g2.envejecer();
        g2.envejecer();
        g2.mostrarEstado();
        g2.ponerHuevo();
        g2.ponerHuevo();
        g2.ponerHuevo();
        g2.envejecer();
        g2.mostrarEstado();
        
        System.out.println("###############################");
        System.out.println("GALLINA 3");
        
        g3.mostrarEstado();
        g3.ponerHuevo();
        g3.ponerHuevo();
        g3.mostrarEstado();
        g3.envejecer();
        g3.envejecer();
        g3.mostrarEstado();
        g3.ponerHuevo();
        g3.ponerHuevo();
        g3.ponerHuevo();
        g3.envejecer();
        g3.mostrarEstado();
        g3.ponerHuevo();
        g3.ponerHuevo();
        g3.ponerHuevo();
        g3.envejecer();
        g3.mostrarEstado();
        
        
        
    }
    
}
