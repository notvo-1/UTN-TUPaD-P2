/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asociacionbidireccional1a1;

/**
 *
 * @author notvo
 */
public class Coche {

    private String modelo;
    private Matricula matricula; //asociacion 1 a 1

    public Coche(String modelo) {
        this.modelo = modelo;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
        if (matricula != null && matricula.getCoche() != this) {
            matricula.setCoche(this);
        }
    }

    public String getModelo() {
        return modelo;
    }

    public Matricula getMatricula() {
        return matricula;
    }
    
    public void infoCoche(){
        if (this.matricula != null) {
            System.out.println(modelo + " tiene numero de matricula: "
                    + matricula.getNumero());
        } else {
            System.out.println(modelo + " no tiene matricula.");
        }
    }
}
