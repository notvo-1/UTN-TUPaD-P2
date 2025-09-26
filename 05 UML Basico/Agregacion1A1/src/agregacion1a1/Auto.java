/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agregacion1a1;

/**
 *
 * @author notvo
 */
public class Auto {

    private String modelo;
    private Motor motor;

    public Auto(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public void mostrarMotor() {
        if (motor != null){
            System.out.println("El auto " + modelo
                    + " tiene un motor tipo: " + motor.getTipo());
        }
        else {
            System.out.println("El auto " + modelo + " no tiene motor.");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

}
