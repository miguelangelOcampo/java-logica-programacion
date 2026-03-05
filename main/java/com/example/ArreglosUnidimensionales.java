package com.example;

public class ArreglosUnidimensionales {

    public static void declararCrearInicializar() {
        // Diferentes formas
        int[] notas = {90, 85, 70};
        String[] nombres = new String[2];
        nombres[0] = "Ana";
        nombres[1] = "Luis";

        System.out.println("--- Declarar, Crear e Inicializar ---");
        System.out.println("Primer elemento de notas: " + notas[0]);
        System.out.println("Primer nombre: " + nombres[0]);
    }

    public static void mostrarLongitud() {
        double[] precios = {10.5, 20.9, 30.0, 40.2};
        System.out.println("\n--- Longitud de Array ---");
        System.out.println("Tamaño del arreglo precios: " + precios.length);
    }

    public static void recorrerConForClasico() {
        int[] numeros = {10, 20, 30};
        System.out.println("\n--- Recorrido For Clásico ---");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
    }

    public static void recorrerConForEach() {
        String[] frutas = {"Manzana", "Pera", "Uva"};
        System.out.println("\n--- Recorrido For-Each ---");
        for (String fruta : frutas) {//tipo de variable temporal(la que toma cada valor individual) : nombre del arreglo
            System.out.println("Fruta: " + fruta);
        }
    }

    public static int[] arrayComoParametroYRetorno(int[] entrada) {
        System.out.println("\n--- Array como Parámetro y Retorno ---");
        // Duplicamos el valor de cada elemento
        for (int i = 0; i < entrada.length; i++) {
            entrada[i] *= 2;
        }
        return entrada;
    }
}
