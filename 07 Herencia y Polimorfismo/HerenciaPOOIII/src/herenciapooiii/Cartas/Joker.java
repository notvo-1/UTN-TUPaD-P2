/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapooiii.Cartas;

/**
 *
 * @author notvo
 */
public class Joker extends Carta {
    private boolean aColor;
    
    public Joker(boolean aColor){
        this.aColor = aColor;
    }
    
    public boolean cartaJoker(){
        return aColor;
    }

    @Override
    public String getRepresentacion() {
        return "Joker" + (aColor ? " a Color." : " Blanco y Negro");
    }
    
    
}
