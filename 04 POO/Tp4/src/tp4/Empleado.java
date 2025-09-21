/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author notvo
 */
public class Empleado {

    private static final int SALARIO_BASE = 15000;
    private static final double AUMENTO_FIJO = 1500;
    private static int totalEmpleados = 0;
    private static int idContador = 0;
    private final int id;
    private String nombre;
    private String puesto;
    private double salario;

    //constuctor 1
    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.id = idGenerator();
        this.salario = Empleado.SALARIO_BASE;
        Empleado.totalEmpleados++;
    }

    //constuctor 2
    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.id = idGenerator();
        this.salario = salario;
        Empleado.totalEmpleados++;
    }

    //metodo que hace un aumento fijo
    public double actualizarSalario() {
        this.salario += Empleado.AUMENTO_FIJO;
        return this.salario;
    }

    //metodo que recibe el aumento por pocentaje
    public double actualizarSalario(double porcAumento) {
        double aumento = this.salario * (porcAumento / 100);
        this.salario += aumento;
        return this.salario;
    }

    private static int idGenerator() {
        return ++Empleado.idContador;
    }

    public static int mostrarTotalEmpleados() {
        return Empleado.totalEmpleados;
    }

    @Override
    public String toString() {
        return "Empelado{"
                + "Id = " + this.id
                + " // Nombre = " + this.nombre
                + " // Puesto = " + this.puesto
                + " // Salario = " + this.salario
                + "}";
    }

    public static int getIdContador() {
        return idContador;
    }

    //GETTERS AND SETTERS
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo");
        }
        this.salario = salario;
    }

}
