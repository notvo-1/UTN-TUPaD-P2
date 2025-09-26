/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asociacionbidireccional1a1;

/**
 *
 * @author notvo
 */
public class Matricula {

    private String numero;
    private Coche coche; // Referencia al coche asociado

    public Matricula(String numero) {
        this.numero = numero;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
// Evita un bucle infinito y asegura la consistencia de la relación
        if (coche != null && coche.getMatricula() != this) {
            coche.setMatricula(this);
        }
    }

    public String getNumero() {
        return numero;
    }

    public Coche getCoche() {
        return coche;
    }

    public void infoMatricula() {
        if (this.coche != null) {
            System.out.println(numero + " esta relacionado con el coche modelo: "
                    + coche.getModelo());
        } else {
            System.out.println(numero + " no tiene un coche relacionado.");
        }
    }
}
