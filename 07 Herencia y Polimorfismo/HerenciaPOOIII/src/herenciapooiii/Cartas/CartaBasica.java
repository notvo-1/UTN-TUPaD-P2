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
public abstract class CartaBasica extends Carta{
    private Palo palo;
    
    public CartaBasica(Palo palo){
        this.palo = palo;
    }

    @Override
    public String getRepresentacion() {
        return " de palo " + palo;
    }


    
    
    
}

