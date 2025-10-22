/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapooiii.Cartas;

import herenciapooiii.Palo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author notvo
 */
public class CartaLiteral extends CartaBasica {

    private String letra;
    private static final List<String> LETRAS_VALIDAS = new ArrayList<String>(Arrays.asList("J", "Q", "K", "A"));

    public CartaLiteral(String letra, Palo palo) {
        super(palo);
        this.letra = letra;
    }

    private void setLetra(String letra) {
        letra = letra.toUpperCase();
        if (!letraValida(letra)) {
            throw new IllegalArgumentException("Letra no valida" + letra);
        } else {
            this.letra = letra;
            System.out.println("Letra valida: " + this.letra);
        }
    }

    private boolean letraValida(String letra) {

        return LETRAS_VALIDAS.contains(letra);
    }
    
    @Override
    public String getRepresentacion(){
        return letra + super.getRepresentacion();
    }


}
