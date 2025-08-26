/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

import java.util.Scanner;

/**
 * Metodos que voy usando para el tp
 *
 * @author notvo
 */
public class Funciones {

    /**
     *
     * @param mensaje mensaje que se imprimira con el formato "Ingresar " +
     * mensaje+ " :"
     * @param signo Ingresar "positivo", "negativo" o "todos". Positivos incluye
     * cero
     * @return Devuelve un int validado positivo.
     */
    static int validarEntero(String mensaje, String signo) {
        boolean valido = false;
        int num = 0;
        Scanner sc = new Scanner(System.in);
        if (signo.toLowerCase() == "positivo") {
            while (!valido) {
                String texto;
                System.out.print(mensaje + ": ");
                texto = sc.nextLine();
                if (esValidoPositivo(texto)) {
                    num = Integer.parseInt(texto);
                    valido = true;
                } else {
                    System.out.println("No es un numero valido. Intente nuevamente");
                }
            }
        } else if (signo.toLowerCase() == "negativo") {
            while (!valido) {
                String texto;
                System.out.print(mensaje + ": ");
                texto = sc.nextLine();
                if (esValidoNegativo(texto)) {
                    num = Integer.parseInt(texto);
                    valido = true;
                } else {
                    System.out.println("No es un numero valido. Intente nuevamente");
                }
            }
        } else if (signo.toLowerCase() == "todos") {
            while (!valido) {
                String texto;
                System.out.print(mensaje + ": ");
                texto = sc.nextLine();
                if (esValidoTodo(texto)) {
                    num = Integer.parseInt(texto);
                    valido = true;
                } else {
                    System.out.println("No es un numero valido. Intente nuevamente");
                }
            }
        }
            return num;
    }

    

    static boolean esValidoPositivo(String entero) {
        try {
            int n = Integer.parseInt(entero);
            if (n >= 0) {
                return true;
            } else {
                System.out.print("No es un numero positivo. ");
                return false;
            }
        } catch (NumberFormatException error) {
            return false;
        }
    }
    static boolean esValidoNegativo(String entero) {
        try {
            int n = Integer.parseInt(entero);
            if (n < 0) {
                return true;
            } else {
                System.out.print("No es un numero Negativo. ");
                return false;
            }
        } catch (NumberFormatException error) {
            return false;
        }
    }
    static boolean esValidoTodo(String entero) {
        try {
            int n = Integer.parseInt(entero);
            return true;
        } catch (NumberFormatException error) {
            return false;
        }}
    


    static int[] crearArray(int length) {
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = validarEntero(" el " + (i + 1) + "° numero", "positivo");
        }
        return array;
    }

    static int mayorArray(int[] numeros) {
        int mayor = Integer.MIN_VALUE;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        return mayor;
    }

    /**
     * Una funcion para crear dos arrays a modo de diccionarios con el mismo
     * length. Primero se ingresa el nombre de la categoria y despues el limite
     * superior no inclusive del rango de la categoria.
     *
     * @param comparando Recibe un array de numeros enteros a comparar por un
     * rango asociado a una categoria
     * @param categorias Recibe un numero que indica el numero de categorias que
     * se deberan creas
     */
    static void clasificacionRangos(int[] comparando, int categorias) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a definir los rangos");
        ordenarArrayIntBubble(comparando);
        String[] cat = new String[categorias];
        int[] rango = new int[categorias];
        for (int i = 0; i < categorias; i++) {
            System.out.print("Ingresar el nombre de la categoria ° " + (i + 1) + " :");
            cat[i] = sc.nextLine();
            rango[i] = validarEntero("el limite superior de la categoria °" + (i + 1) + " " + cat[i] + "", "positivo");
        }

        for (int i = 0; i < comparando.length; i++) {
            boolean encontrado = false;
            for (int j = 0; j < rango.length; j++) {
                if (comparando[i] < rango[j]) {
                    System.out.println(comparando[i] + " pertenece a la categoria " + cat[j]);
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println(comparando[i] + " no pertenece a ninguna categoria");
            }
        }
    }

    static int[] ordenarArrayIntBubble(int[] array) {
        boolean bandera = true;
        int temp;
        int n = array.length;
        while (bandera) {
            bandera = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    bandera = true;
                }
            }
            n--;
        }

        return array;
    }

    static void clasificarEdad(int edad) {
        if (edad < 12) {
            System.out.println("Eres un Niño.");
        } else if (edad < 18) {
            System.out.println("Eres un Adolescente");
        } else if (edad < 60) {
            System.out.println("Eres un Adulto.");
        } else {
            System.out.println("Eres un adulto mayor.");
        }
    }

    static double validarDouble(String mensaje) {
        boolean valido = false;
        double num = 0;
        Scanner sc = new Scanner(System.in);
        while (!valido) {
            String texto;
            System.out.print(mensaje + ": ");
            texto = sc.nextLine();
            if (esValidoPositivoDouble(texto)) {
                num = Double.parseDouble(texto);
                valido = true;
            } else {
                System.out.println("No es un numero valido. Intente nuevamente");
            }

        }
        return num;
    }

    static boolean esValidoPositivoDouble(String numero) {
        try {
            double n = Double.parseDouble(numero);
            if (n >= 0) {
                return true;
            } else {
                System.out.print("No es un numero positivo. ");
                return false;
            }
        } catch (NumberFormatException error) {
            return false;
        }
    }
}
