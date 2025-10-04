/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadiv;

import actividadiv.TipoInstrumento;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author notvo
 */
public class Sucursal {

    private String nombre;
    private ArrayList<Instrumento> instrumentos;

    public Sucursal(String nombre) {
        this.nombre = nombre;
        this.instrumentos = new ArrayList<>();
    }

    public void agregarInstrumento(Instrumento instrumento) {
        this.instrumentos.add(instrumento);
    }

    public void listarInstrumentos() {
        for (Instrumento instrumento : instrumentos) {
            System.out.println(instrumento);
        }
    }

    public Instrumento borrarInstrumento(String ID) {
        Instrumento insABorrar = buscarInstrumento(ID);
        this.instrumentos.remove(insABorrar);
        return insABorrar;
    }

    private Instrumento buscarInstrumento(String ID) {
        int i = 0;
        Instrumento insEncontrado = null;
        while (i < instrumentos.size() && !this.instrumentos.get(i).getId().equals(ID)) {
            i++;
        }
        if (i < instrumentos.size()) {
            insEncontrado = this.instrumentos.get(i);
        }
        return insEncontrado;
    }

    public int tamañoLista() {
        return instrumentos.size();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Instrumento> getInstrumentos() {
        return Collections.unmodifiableList(instrumentos);
    }

    public ArrayList<Instrumento> instrumentosPorTipo(TipoInstrumento tipo) {
        ArrayList<Instrumento> listaXTipo = new ArrayList<>();
        for (Instrumento instrumento : instrumentos) {
            if (instrumento.getTipo() == tipo) {
                listaXTipo.add(instrumento);
            }
        }
        return listaXTipo;
    }

//    public double[] porcInstrumentosPorTipo() {
//        double[] porcentaje = {porcentajeTipo(TipoInstrumento.PERCUSION), porcentajeTipo(TipoInstrumento.VIENTO), porcentajeTipo(TipoInstrumento.CUERDA)};
//        return porcentaje;
//    }
//
//    private double porcentajeTipo(TipoInstrumento tipo) {
//        return instrumentosPorTipo(tipo).size() / (double) instrumentos.size()*100;
//        
//    }
    
    public double[] porcInstrumentosPorTipo(){
        final int CANT_INSTRUMENTOS = TipoInstrumento.values().length;
        double[] porcentaje = new double[CANT_INSTRUMENTOS];
        
        for (Instrumento intrumento : instrumentos) {
            porcentaje[intrumento.getTipo().ordinal()]++;
        }
        multPor100(porcentaje);
        return porcentaje;     
    }

    private void multPor100(double[] porcentaje) {
        for (int i = 0; i < porcentaje.length; i++) {
            porcentaje[i] = porcentaje[i] * 100 / instrumentos.size();
        }
    }
    
}
