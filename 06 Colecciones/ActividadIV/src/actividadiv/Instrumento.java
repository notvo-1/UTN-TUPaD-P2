/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadiv;

/**
 *
 * @author notvo
 */
public class Instrumento {
    private String id;
    private double precio;
    private TipoInstrumento tipo;

    public Instrumento(String id, double precio, TipoInstrumento tipo) {
        this.id = id;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public TipoInstrumento getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Instrumento{" + "id=" + id + ", precio=" + precio + ", tipo=" + tipo + '}';
    }
    
    
}
