 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asociacionunidireccional1an;

/**
 *
 * @author notvo
 */
public class AsociacionUnidireccional1aN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profesor marcos = new Profesor("Marcos Marconi");
        
        Curso programacion2 = new Curso("Programacion 2", 30);
        Curso estadistica = new Curso("Probabilidad y Estadistica", 20);
        Curso basedatos1 = new Curso("Base de datos 1", 30);
        
        marcos.agregarCurso(programacion2);
        marcos.agregarCurso(estadistica);
        marcos.agregarCurso(basedatos1);
        
        marcos.mostrarCursos();
        
        marcos.eliminarCurso(basedatos1);
        
        marcos.mostrarCursos();
        
        System.out.println(basedatos1.getNombre());
        
        
    }
    
}
