/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadsatic;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 *
 * @author notvo
 */
public class Ticket {

    private static int contTicket = 0;
    private final int numTicket;
    private final int dni;
    private final LocalDate fechaCompra;

    //constructor solo con dni
    public Ticket(int dni) {
        this.dni = dni;
        this.numTicket = numTicketGenerator();
        this.fechaCompra = LocalDate.now();
    }

    //constructor 2 parametros
    /**
     * 
     * @param dni 
     * @param fechaCompra Formato ISO: "yyyy-MM-dd" 
     */
    public Ticket(int dni, String fechaCompra) {
        this.dni = dni;
        this.fechaCompra = parsearFecha(fechaCompra);
        this.numTicket = numTicketGenerator();
    }

    //Metodo privado para asigar y aumentar el contador numticket static.
    private static int numTicketGenerator() {
        return ++Ticket.contTicket;
    }

    private static String leerFecha() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (true) {
            System.out.println("Ingrese la fecha en el formato yyyy-MM-dd");
            try {
                parsearFecha(input);
                return input;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static LocalDate parsearFecha(String fechaStr) {
        try {
            return LocalDate.parse(fechaStr); // Formato ISO: "yyyy-MM-dd"
        } catch (DateTimeParseException e) {
            System.out.println("Formato de fecha inválido. Use yyyy-MM-dd.");
            throw new IllegalArgumentException("Formato de fecha inválido. Use yyyy-MM-dd.");
        }
    }

    @Override
    public String toString() {
        return "Ticket{" + "Numero: " + numTicket
                + " -- Fecha: " + fechaCompra
                + " -- DNI: " + dni + "}";
    }
    
    public int getContTicket(){
        return contTicket;
    }
}
