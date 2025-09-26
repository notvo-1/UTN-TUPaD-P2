/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author notvo
 */
public class GeneradorQR {

    public GeneradorQR() {
    }

    public void Generar(String valor, Usuario usuario) {
        CodigoQR nuevoQR = new CodigoQR(valor, usuario);
        System.out.println("Creando QR: " + nuevoQR.getValor());
        System.out.println(nuevoQR.getUsuario());
    }
}
