package com.example;

public class EntradaDeDatos {

    // Método 1: Solo leer distintos tipos
    public static void leerVariosTipos() {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Ingrese un entero: ");
        int numero = sc.nextInt();

        System.out.print("Ingrese un decimal: ");
        double decimal = sc.nextDouble();

        System.out.print("Ingrese una palabra: ");
        String palabra = sc.next();   // Lee solo hasta el primer espacio

        System.out.print("Ingrese una linea completa: ");
        sc.nextLine(); // Limpiamos el Enter pendiente de next()

        String linea = sc.nextLine();

        System.out.println("Entero: " + numero);
        System.out.println("Decimal: " + decimal);
        System.out.println("Palabra: " + palabra);
        System.out.println("Linea: " + linea);
    }

    public static void manejarSaltoDeLineaPendiente() {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        //  Si quitamos esta línea, nextLine() se salta la entrada
        sc.nextLine();  // SOLUCIÓN al salto pendiente

        System.out.print("Ingrese su nombre completo: ");
        String nombre = sc.nextLine();

        System.out.println("Edad: " + edad);
        System.out.println("Nombre: " + nombre);
    }
}