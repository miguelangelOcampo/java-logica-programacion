package com.example;

public class VariablesYConstantes {
    public static void demostrarDeclaracionAsignacion() {
        int numero; // Declaración de una variable de tipo entero
        numero = 10; // Asignación de un valor a la variable
        String texto = "Hola, mundo!"; // Declaración y asignación en una sola línea
        System.out.println("Valor de la variable 'numero' de tipo entero: " + numero);
        System.out.println("Valor de la variable 'texto' de tipo cadena: " + texto);
    }
    public static void demostrarConvencionesNombres(){
        int edadUsuario;//camelCase es una forma de asignar nombres a las variables (sin espacios y la primera letra de cada palabra en mayuscula excepto la primera palabra)
        edadUsuario = 25;
        System.out.println("En java se recomienda seguir las siguientes convenciones de nombres para variables:\n" );
        System.out.println("1. Utilizar camelCase para nombrar variables, comenzando con una letra minúscula y siguiendo con mayúsculas para cada nueva palabra.");
        System.out.println("2. Evitar el uso de caracteres especiales y espacios en los nombres de variables.");
        System.out.println("Utilizar el valor de la variable 'edadUsuario': " + edadUsuario);
    }
    public static void demostrarConstantes(){
        final double PI = 3.1416; // Declaración de una constante de tipo double
        System.out.println("Valor de la constante 'PI': " + PI);
        System.out.println("En java las constantes se declaran utilizando la palabra clave 'final' y su valor no puede ser modificado después de su asignación inicial.");
        System.out.println("ademas, es una buena práctica nombrar las constantes utilizando mayúsculas y guiones bajos para separar las palabras, como por ejemplo: MAX_VALUE o MIN_VALUE.");
    }
}
