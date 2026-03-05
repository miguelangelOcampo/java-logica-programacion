package com.example;

public class TiposDeDatosPrimitivos {

    public static void demostrarEnteros(){
        byte numeroByte = -128; // Rango: -128 a 127
        short numeroShort = 32767; // Rango: -32,768 a 32,767
        int numeroInt = 2147456412; // Rango: -2,147,483,648 (+-1)
        long numeroLong = 9223372036854775807L; // Rango: -9,223,372,036,854,775,808 (+-1) (se utiliza principalmente para Id largos)
        System.out.println("Tipos de datos enteros:"); //imprime el valor de cada tipo de dato entero a continuacion
        System.out.println("byte: " + numeroByte);
        System.out.println("short: " + numeroShort);
        System.out.println("int: " + numeroInt);
        System.out.println("long: " + numeroLong);
    }
    public static void demostrarFlotantes(){   
        float flotantes = 3.1416f; // Rango: 1.4E-45 a 3.4028235E38 y se utiliza principalmente para procesos que no requieran mucha precisión
        double flotantemayor = 3.141592653589793; // Rango: 4.9E-324 a 1.7976931348623157E308
        System.out.println("Tipos de datos flotantes:"); 
        System.out.println("float: " + flotantes);
        System.out.println("double: " + flotantemayor);
    }
        public static void demostrarCaracteres(){
        char letra = 'A'; //imprime un unico caracte o su valor en ASCII
        char letraUnicode = 64;
        System.out.println("Tipos de datos de caracteres:");
        System.out.println("char: " + letra);
        System.out.println("char(pero imprimiendo su valor en codigo ASCII): " + letraUnicode);
    }
        public static void demostrarBooleanos(){
        boolean esVerdadero = true; // a diferencia de otros lenguajes en java solo se puede obtener valores booleanos true o false y no 0 o 1
        System.out.println("Tipos de datos booleanos:");
        System.out.println("boolean: " + esVerdadero);

    }
        public static void demostrarValoresPordeFecto(){ //al estar dentro de una clase no se imprimen los valores por defecto de los tipos de datos primitivos
        System.out.println("En java los tipos de datos primitivos tienen valores por defecto como los siguientes:");
        System.out.println("byte: 0\n" + "short: 0\n" + "int: 0\n" + "long: 0L\n" + "float: 0.0f\n" + "double: 0.0d\n" + "char: '\\u0000'\n" + "boolean: false");
        System.out.println("hay que resaltar que estos valores por defecto solo se asignan a variables de\nclase, no a variables locales, por lo que si intentamos imprimir una variable local sin inicializarla, obtendremos un error.");
    }
    }