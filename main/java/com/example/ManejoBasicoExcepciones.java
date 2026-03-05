package com.example;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ManejoBasicoExcepciones {

    public static void ejemploTryCatchDivision() {
        System.out.println("--- Try-Catch: División por cero ---");
        try {
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No puedes dividir por cero.");
        }
    }

    public static void ejemploTryCatchInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Try-Catch: Entrada Inválida ---");
        System.out.print("Por favor, intenta ingresar una letra en lugar de un número: ");
        
        try {
            int numero = sc.nextInt();
            System.out.println("Ingresaste: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Error: ¡Eso no era un número entero!");
        }
    }

    public static void ejemploBloqueFinally() {
        System.out.println("\n--- Bloque finally ---");
        try {
            System.out.println("Ejecutando lógica...");
        } finally {
            System.out.println("Este bloque se ejecuta SIEMPRE (útil para cerrar recursos).");
        }
    }

    public static void evitarCierrePrograma() {
        System.out.println("\n--- Evitar Cierre del Programa ---");
        System.out.println("Gracias al manejo de excepciones, el programa sigue vivo.");
    }
}
