/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author notvo
 */
public class NaveEspacial {

    final double CONSUMOMLLTxMIL_KM = 0.77;
    final int COMBUSTIBLE_DESPEGUE = 50;
    final int CAP_TANQUE = 1500;
    private String nombre;
    private int combustible;
    private boolean despegar;
    private int distanciaRecorrida;

    public NaveEspacial(String nombre, int combustible) {
        this.combustible = combustible;
        this.nombre = nombre;
        this.despegar = false;
        this.distanciaRecorrida = 0;
    }

    public void mostrarEstado() {
        String estado = (despegar ? "En viaje!" : "En tierra.");
        System.out.println("Nombre: " + this.nombre + " -- Combustible: " + this.combustible + " -- Estado: " + estado + " -- Distancia Recorrida: " + this.distanciaRecorrida + "km.");
    }

    public void despegar() {
        if (this.combustible >= COMBUSTIBLE_DESPEGUE) {
            this.combustible -= COMBUSTIBLE_DESPEGUE;
            this.despegar = true;
            System.out.println("Despegando!");
        } else {
            System.out.println("El combustible para despegar debe ser al menos 50 mil litros");
        }
    }
    /**
     * 
     * @param distancia distancia en miles de kilometros
     */
    public void avanzar(int distancia) {
        if (despegar) {
            if (checkItinerario(distancia)) {
                this.distanciaRecorrida += distancia;
                System.out.println("Viajando!");
                this.combustible -= distancia * CONSUMOMLLTxMIL_KM;
                System.out.println(nombre + " recorrió " + distancia + " km. Distancia total: " + distanciaRecorrida + " km.");

            } else {
                System.out.println("No hay suficiente combustible para el viaje");
                consultaComNecesario(distancia);
            }

        } else {
            System.out.println("La nave debe despegar!");
        }
    }

    private boolean checkItinerario(int distancia) {

        double combNecesario = distancia * CONSUMOMLLTxMIL_KM + COMBUSTIBLE_DESPEGUE;
        if (distancia > 0) {
            if (this.combustible >= combNecesario) {
                return true;
            }
        }
        return false;
    }
    
    public void recargarCombustible(int cantidad){
        if (cantidad > 0 && (cantidad+this.combustible) <= CAP_TANQUE){
            this.combustible += cantidad;
            System.out.println(nombre + " recargó " + cantidad + " ml. Combustible actual: " + combustible);

        }else {
            System.out.println("No se puede cargar esa cantidad.");
        }
    }
    
    public void consultaComNecesario(int distancia){
        double combustible = distancia * CONSUMOMLLTxMIL_KM + COMBUSTIBLE_DESPEGUE;
        System.out.println("Se necesita "+ combustible + " unidades para un viaje de "+ distancia + " miles de kilometros.");
    }

}
