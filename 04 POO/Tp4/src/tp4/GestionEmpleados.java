/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;

/**
 *
 * @author notvo
 */
public class GestionEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado e1 = new Empleado("Matias", "Junior", 30000);
        Empleado e2 = new Empleado("jacqui", "Data");
        Empleado e3 = new Empleado("Vale", "Kine", 20000);
        Empleado e4 = new Empleado("Posho", "Modista", 20000);
        Empleado e5 = new Empleado("Pixie", "Reina");
        Empleado e6 = new Empleado("Robert", "Agente Secreto");
        Empleado e7 = new Empleado("Elva", "Teacher", 30000);
        Empleado e8 = new Empleado("Dulkan", "Gato Cursos", 5000);
        Empleado e9 = new Empleado("Mori", "La Sombra", 6000);
        
        System.out.println(e1);
        e1.actualizarSalario(20);
        System.out.println(e1);
        System.out.println("---------------------------------");
        System.out.println(e2);
        e2.actualizarSalario(30);
        System.out.println(e2);
        System.out.println("---------------------------------");
        System.out.println(e3);
        e3.actualizarSalario();
        System.out.println(e3);
        System.out.println("---------------------------------");
        System.out.println(e4);
        e4.actualizarSalario(14);
        System.out.println(e4);
        System.out.println("---------------------------------");
        System.out.println(e5);
        e5.actualizarSalario();
        System.out.println(e5);
        System.out.println("---------------------------------");
        System.out.println(e6);
        e6.actualizarSalario(32);
        System.out.println(e6);
        System.out.println("---------------------------------");
        System.out.println(e7);
        e7.actualizarSalario(12);
        System.out.println(e7);
        System.out.println("---------------------------------");
        System.out.println(e8);
        e8.actualizarSalario(5);
        System.out.println(e8);
        System.out.println("---------------------------------");
        System.out.println(e9);
        e9.actualizarSalario(100);
        System.out.println(e9);
        System.out.println("---------------------------------");
        
        System.out.println("Total de empleados: " +Empleado.mostrarTotalEmpleados());
        
        
        
        
        
        
        
        
        
        
    }
    
}
