/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajointegradorpoo;

/**
 *
 * @author notvo
 */
public class Usuario {
    private String dni;

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    public Usuario(String dni, String nombre, String apellido, String telefono, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }
   
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Usuario{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", email=" + email + '}';
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
    

    }
