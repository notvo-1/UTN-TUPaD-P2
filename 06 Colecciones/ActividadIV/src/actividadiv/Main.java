/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadiv;

import java.util.ArrayList;

/**
 *
 * @author notvo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fabrica f = new Fabrica();
        cargarFabrica(f);

//        PRUEBA PUNTO A
        
//         f.listarInstrumentos();
//        PRUEBA PUNTO B
        
        
//        ArrayList<Instrumento> lista = f.instrumentosPorTipo(TipoInstrumento.PERCUSION);
//        for (Instrumento instrumento : lista) {
//            System.out.println(instrumento);
//        }
        
//         PRUEBA PUNTO C
      
        
//        Instrumento borrado = f.borrarInstrumento("ABC123");
//        System.out.println("Se borró: " + borrado);
//        f.listarInstrumentos();
        
//         PRUEBA PUNTO D
    

    


        
        double[] porcs = f.porcInstrumentosPorTipo("Sucursal A");

        for (int i = 0; i < porcs.length; i++) {
            System.out.println(porcs[i]);
        }
         
    }
    
     private static void cargarFabrica(Fabrica f) {
        Sucursal s1 = new Sucursal("Sucursal A");
        Sucursal s2 = new Sucursal("Sucursal B");

        s1.agregarInstrumento(new Instrumento("ABC123", 13214, TipoInstrumento.CUERDA));
        s1.agregarInstrumento(new Instrumento("BCD456", 13432, TipoInstrumento.VIENTO));
        s1.agregarInstrumento(new Instrumento("DEF567", 15464, TipoInstrumento.PERCUSION));
        s1.agregarInstrumento(new Instrumento("DEF568", 15464, TipoInstrumento.PERCUSION));
        s1.agregarInstrumento(new Instrumento("DEF569", 15464, TipoInstrumento.PERCUSION));

        s2.agregarInstrumento(new Instrumento("ASD353", 52432, TipoInstrumento.CUERDA));
        s2.agregarInstrumento(new Instrumento("VXCBE2", 45645, TipoInstrumento.VIENTO));
        s2.agregarInstrumento(new Instrumento("VXCBE2", 45645, TipoInstrumento.PERCUSION));
        s2.agregarInstrumento(new Instrumento("VXCBE3", 45645, TipoInstrumento.PERCUSION));
        s2.agregarInstrumento(new Instrumento("VXCBE4", 45645, TipoInstrumento.PERCUSION));

        f.agregarSucursal(s1);
        f.agregarSucursal(s2);
    }

}
