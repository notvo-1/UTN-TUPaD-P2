/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asociacionbidireccional1an;

/**
 *
 * @author notvo
 */
class Empleado {

    private String nombre;
    private String puesto;
    private Departamento departamento;

    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setDepartamento(Departamento departamento) {
// Si es el mismo departamento, no hacer nada
        if (this.departamento == departamento) {
            return;
        }
// Si tenía un departamento anterior, eliminarse de él
        if (this.departamento != null) {
            this.departamento.eliminarEmpleado(this);
        }
// Establecer el nuevo departamento
        this.departamento = departamento;
// Añadirse al nuevo departamento (si no es nulo)
        if (departamento != null && !departamento.getEmpleados().contains(this)) {
            departamento.agregarEmpleado(this);
        }
    }

    public Departamento getDepartamento() {
        return departamento;
    }

}
