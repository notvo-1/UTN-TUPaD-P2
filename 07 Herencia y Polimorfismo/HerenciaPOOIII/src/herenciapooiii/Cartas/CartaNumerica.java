/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapooiii.Cartas;

import herenciapooiii.Palo;

/**
 *
 * @author notvo
 */
public class CartaNumerica extends CartaBasica {

    private int numero;

    public CartaNumerica(int numero, Palo palo) {
        super(palo);
        this.numero = numero;// = numero;
    }

    public void setNumero(int numero) {
        if (!numeroValido((numero))) {
            throw new IllegalArgumentException("Numero invalido");
        } else {
            this.numero = numero;
        }
    }

    private boolean numeroValido(int numero) {
        return numero >= 2 && numero <= 10;
    }
    
    @Override
    public String getRepresentacion(){
        return numero + super.getRepresentacion();
    }

    


    
    
    
}
