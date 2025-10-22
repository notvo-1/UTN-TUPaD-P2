/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapooiii;

/**
 *
 * @author notvo
 */
public enum Palo {
    PICA(Color.NEGRO),
    TREBOL(Color.NEGRO),
    DIAMANTE(Color.ROJO),
    CORAZON(Color.ROJO);
    
    private Color color;
    
    private Palo(Color color){
        this.color = color;
    }
     public Color getColor(){
         return this.color;
     }
}
