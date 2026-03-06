package com.example;

public class ManipulacionCadenas {

    public static void demostrarConcatenacion() {
        String parte1 = "Hola";
        String parte2 = " Mundo";
        
        System.out.println("--- Concatenación ---");
        System.out.println("Con operador +: " + (parte1 + parte2));
        System.out.println("Con método concat(): " + parte1.concat(parte2));
    }

    public static void demostrarMetodosUtiles() {
        String texto = "  Java es Genial  ";
        
        System.out.println("\n--- Métodos Útiles ---");
        System.out.println("Original: '" + texto + "'");
        System.out.println("Largo: " + texto.length());
        System.out.println("Mayúsculas: " + texto.toUpperCase());
        System.out.println("Sin espacios extremos (trim): '" + texto.trim() + "'");
        System.out.println("¿Contiene 'Java'?: " + texto.contains("Java"));
        System.out.println("¿Empieza con '  J'?: " + texto.startsWith("  J"));
    }

    public static void demostrarInmutabilidad() {
        String s1 = "Hola";
        s1.concat(" Java"); // Esto crea un nuevo String, pero no cambia s1
        
        System.out.println("\n--- Inmutabilidad ---");
        System.out.println("s1 sigue siendo: " + s1);
        
        s1 = s1.concat(" Java"); // Aquí sí reasignamos la referencia
        System.out.println("s1 reasignado: " + s1);
    }

    public static void usarStringBuilder() {
        // Más eficiente para muchas concatenaciones
        StringBuilder sb = new StringBuilder();
        sb.append("Eficiencia").append(" con ").append("StringBuilder");
        
        System.out.println("\n--- StringBuilder ---");
        System.out.println(sb.toString());
    }
}
