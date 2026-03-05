package com.example;

public class EstructurasDeRepeticion {
    public static void ejemploWhile(){
        int contador = 0;
        System.out.println("Ejemplo de estructura de repetición while:\nSe repite el bloque mientras una condicion sea verdadera");
        while (contador < 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }
    }    
    public static void ejemploDoWhile(){
        int contador = 0;
        System.out.println("Ejemplo de estructura de repetición do-while:\nSe ejecuta el bloque al menos una vez cumplase o no la condicion y luego se repite mientras la condicion sea verdadera");
        do {
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador < 5);
    }
    public static void ejemploForClasico(){
        System.out.println("Ejemplo de estructura de repetición for clásico:\nSe repite el bloque un numero determinado de veces, se compone de tres partes: inicialización, condición y actualización");
        for (int i = 0; i < 5; i++) {
            System.out.println("Contador: " + i);
        }
    }
    public static void ejemploForAnidado(){
        System.out.println("Ejemplo de estructura de repetición for anidado:\nEs un for dentro de otro for, se utiliza para recorrer estructuras de datos multidimensionales o para generar combinaciones de valores");
        for(int i = 1; i <=5; i++){
            System.out.println("Iterador principal i: " + i);
            for(int j = 1; j <=3; j++){
                System.out.println("    Iterador secundario j: " + j);
            }
        }
    }
    public static void ejemploBreakContinue(){
        System.out.println("Ejemplo de uso de break y continue en estructuras de repetición:\nbreak se utiliza para salir completamente de un ciclo, mientras que continue se utiliza para saltar a la siguiente iteración del ciclo");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("El iterador cuenta hasta 10 pero una condicion lo hizo salir al llegar al número 5, saliendo del ciclo con break.");
                break; // Sale completamente del ciclo cuando i es igual a 5
            }
            if (i % 2 == 0) {
                System.out.println("Al i ser par este se continuara ejecutando pero saldra por igual de la condicion: " + i + ", saltando con continue.");
                continue; // Salta a la siguiente iteración si el número es par
            }
            System.out.println("Número impar: " + i);
        }
    }
    public static void ejemploDeEtiquetas(){
        System.out.println("Ejemplo de etiquetas con break y continue:\nLas etiquetas permiten identificar el grado o orden del ciclo al que se desea aplicar break o continue");
        externoLoop: // Etiqueta para el ciclo externo o 1r ciclo al usarlo se tomara en cuenta todo el bloque en adelante hasta el cierre de este ciclo
        for (int i = 1; i <= 3; i++) {
            internoLoop: // Etiqueta para el ciclo interno o el 2do ciclo al usarlo se tomara en cuenta todo el bloque en adelante hasta el cierre de este ciclo
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Se encontró la condición i=2 y j=2, se salta a la siguiente iteración del ciclo externo con continue externoLoop.");
                    continue externoLoop; // Salta a la siguiente iteración del ciclo externo
                }
                if (i == 3 && j == 3) {
                    System.out.println("Se encontró la condición i=3 y j=3, se sale completamente del ciclo externo con break externoLoop.");
                    break externoLoop; // Sale completamente del ciclo externo
                }
                System.out.println("Iteradores i: " + i + ", j: " + j);
            }
        }
    }
}
