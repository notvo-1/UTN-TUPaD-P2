/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asociacionbidireccional1a1;

/**
 *
 * @author notvo
 */
public class AsociacionBidireccional1A1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matricula m1 = new Matricula("1234");
        Matricula m2 = new Matricula("3333");
        Coche c1 = new Coche("Fitito");
        Coche c2 = new Coche("Huevito");

        c1.infoCoche();
        m1.infoMatricula();

        c1.setMatricula(m1);
        c1.infoCoche();

        m1.infoMatricula();
        m1.setCoche(c2);
        m1.infoMatricula();
        m2.infoMatricula();
        c1.infoCoche();
        c2.infoCoche();
        
        c1.setMatricula(m2);
        c1.infoCoche();
        m2.infoMatricula();

    }

}
