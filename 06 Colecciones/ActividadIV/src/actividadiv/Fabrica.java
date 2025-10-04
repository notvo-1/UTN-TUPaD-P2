/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadiv;

import java.util.ArrayList;

/**
 *
 * @author notvo
 */
public class Fabrica {

    private String nombre;
    private ArrayList<Sucursal> sucursales;

    public Fabrica() {
        this.sucursales = new ArrayList<>();
    }


    public void agregarSucursal(Sucursal sucursal) {
        this.sucursales.add(sucursal);
    }

    public double[] porcInstrumentosPorTipo(String nombreSucursal) {
        double[] porcentajes = new double[TipoInstrumento.values().length];
        Sucursal sucursalEntontrada = buscarSucursal(nombreSucursal);
        if (sucursalEntontrada != null) {
            porcentajes = sucursalEntontrada.porcInstrumentosPorTipo();
        }

        return porcentajes;
    }

    private Sucursal buscarSucursal(String nombreSucursal) {
        Sucursal sucursal = null;
        int i = 0;
        while (i < sucursales.size() && !sucursales.get(i).getNombre().equalsIgnoreCase(nombreSucursal)) {
            i++;
        }
        if (i < sucursales.size()) {
            sucursal = sucursales.get(i);
        }
        return sucursal;
    }

    void listarInstrumentos() {
        for (Sucursal sucursal : sucursales) {
            System.out.println(sucursal.getNombre());
            sucursal.listarInstrumentos();
        }
    }

    ArrayList<Instrumento> instrumentosPorTipo(TipoInstrumento tipo) {
        ArrayList<Instrumento> listaInstrumentos = new ArrayList<>();
        
        for (Sucursal sucursal : sucursales) {
            listaInstrumentos.addAll(sucursal.instrumentosPorTipo(tipo));
        }
        
        return listaInstrumentos;
    }

    public Instrumento borrarInstrumento(String ID) {
        Instrumento borrado = null;
        int i = 0;
        while (i < sucursales.size() && borrado == null) {
            borrado = sucursales.get(i).borrarInstrumento(ID);
            i++;
        }
        return borrado;
    }
}
