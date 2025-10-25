/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte2;

import com.sun.source.tree.TryTree;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author notvo
 */
public class Ejercicio {

    static Scanner scanner = new Scanner(System.in);

    public void divisorSeguro() {
        try {
            System.out.println("Ingrese el dividendo: ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("Ingrese el divisor: ");
            int b = Integer.parseInt(scanner.nextLine());

            int resultado = a / b;
            System.out.println("El resultado es: " + resultado);

        } catch (ArithmeticException ae) {
            System.out.println("No se puede dividir por cero");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }

    public void conversion() {
        System.out.print("Ingrese un numero: ");
        String texto = scanner.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Numero convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + texto + "' no es un numero valido");
        }
    }

    public void lecturaArchivo() {
        try {
            File archivo = new File("archivos.txt"); // correcto: archivos.txt
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }
            lector.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado");
        }
    }

    public void validarNota() {
        try {
            System.out.println("Ingrese un numero entre 0 y 10: ");
            int numero = Integer.parseInt(scanner.nextLine());
            validarNumero(numero);
            System.out.println("Numero ingresado correctamente: " + numero);
        } catch (NumeroInvalido ni) {
            System.out.println("error: " + ni.getMessage());
        }
    }

    public void tryWithResourses() {
        String archivo = "archivos.txt"; // correcto: archivos.txt

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error leyendo archivo: " + e.getMessage());
        }
    }

    public void validarNumero(int numero) throws NumeroInvalido {
        if (numero < 0 || numero > 10) {
            throw new NumeroInvalido("El numero '" + numero + "' esta fuera de rango, debe ser entre 0 y 10.");
        }
    }

}
