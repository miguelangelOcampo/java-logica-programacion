package com.example;

public class ArreglosBidimensionales {

    public static void declararCrearMatrices() {
        // Declaración y creación de una matriz 2x3
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("--- Declaración y Creación de Matrices ---");
        System.out.println("Elemento en fila 0, columna 1: " + matriz[0][1]);
    }

    public static void recorrerMatriz() {
        int[][] tabla = {
            {10, 20},
            {30, 40}
        };

        System.out.println("\n--- Recorrido con For Anidados ---");
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print("[" + tabla[i][j] + "] ");
            }
            System.out.println();
        }
    }

    public static void ejemploUsosTipicos() {
        // Suma de todos los elementos de una matriz
        int[][] datos = {{3, 3}, {10, 10}};
        int suma = 0;
        
        for (int[] fila : datos) {
            for (int valor : fila) {
                suma += valor;
            }
        }
        System.out.println("\n--- Uso Típico: Suma de Matriz ---");
        System.out.println("La suma total es: " + suma);
    }
}
