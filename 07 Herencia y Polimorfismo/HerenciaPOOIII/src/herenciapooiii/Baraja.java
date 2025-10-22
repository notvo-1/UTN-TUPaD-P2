/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapooiii;

import herenciapooiii.Cartas.Carta;
import herenciapooiii.Cartas.CartaLiteral;
import herenciapooiii.Cartas.CartaNumerica;
import herenciapooiii.Cartas.Joker;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author notvo
 */
public class Baraja {

    private List<Carta> cartas;

    public Baraja() {
        this.cartas = new ArrayList<Carta>(); 
        generarCartas();
        System.out.println(cartas.size());
    }

    public void mostrarBaraja() {
        for (Carta carta : cartas) {
            carta.darVuelta();
            carta.mostrar();
        }
    }

    public void generarCartas() {
        generarCartasNumericas();
        generarCartasLiterales();
        generarJoker();

    }

    private void generarCartasNumericas() {
        final int MIN_VALOR = 2;
        final int MAX_VALOR = 10;
        Palo[] palos = Palo.values();
        for (int i = MIN_VALOR; i <= MAX_VALOR; i++) {
            for (int j = 0; j < palos.length; j++) {
                this.cartas.add(new CartaNumerica(i, palos[j]));
            }
        }
    }

    private void generarCartasLiterales() {
        Palo[] palos = Palo.values();
        final String[] CARTAS_VALIDAS = {"J","Q","K","A"};
        for (int i = 0; i < CARTAS_VALIDAS.length; i++) {
            for (int j = 0; j < palos.length; j++) {
                this.cartas.add(new CartaLiteral(CARTAS_VALIDAS[i], palos[j]));
            }
        }
    }

    private void generarJoker() {
        this.cartas.add(new Joker(true));
        this.cartas.add(new Joker(false));
    }
    
    
}
