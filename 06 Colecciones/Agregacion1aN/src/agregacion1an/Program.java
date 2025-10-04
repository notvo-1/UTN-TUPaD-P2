/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agregacion1an;

/**
 *
 * @author notvo
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa claro = new Empresa("Claro");
        Empleado matias = new Empleado("Matias", "Programador jr");
        Empleado jacqui = new Empleado("Jacqui", "Cientifica de datos");
        Empleado dulkan = new Empleado("Dulkan", "Adornito");
        Empleado pixie = new Empleado("Pixie", "Reina de todo");
        Empleado mori = new Empleado("Mori", "Adornito");
        Empleado shiroi = new Empleado("Shiroi", "Duquesa");
        
        
        claro.agregarEmpleado(matias);
        claro.agregarEmpleado(jacqui);
        claro.agregarEmpleado(dulkan);
        claro.agregarEmpleado(pixie);
        claro.agregarEmpleado(mori);
        claro.agregarEmpleado(shiroi);
        
        System.out.println(claro.getEmpleados());
        claro.mostarEmpleado();
    }
    
}
