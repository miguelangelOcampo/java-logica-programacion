package com.example;

public class Operadores {
    public static void demostrarAritmeticos() {
        int a = 10;
        int b = 5;
        System.out.println("Operadores aritméticos:");
        System.out.println("Valores de a: " + a + " y b: " + b);
        System.out.println("Suma: " + (a + b)); // Suma de a y b
        System.out.println("Resta: " + (a - b)); // Resta de a y b
        System.out.println("Multiplicación: " + (a * b)); // Multiplicación de a y b
        System.out.println("División: " + (a / b)); // División de a entre b
        System.out.println("Módulo: " + (a % b)); // Resto de la división de a entre b
    }
    public static void demostrarIncrementoDecremento(){
        int x = 5;
        System.out.println("Operadores de incremento y decremento:");
        System.out.println("Valor inicial de x: " + x);
        System.out.println("Incremento (x++): " + (x++)); // Incrementa x después de usar su valor
        System.out.println("Valor de x después del incremento: " + x);
        System.out.println("Decremento (--x): " + (--x)); // Decrementa x antes de usar su valor
        System.out.println("Valor de x después del decremento: " + x);
    }
    
    public static void demostrarRelacionales(){
        int m = 10;
        int n = 20;
        System.out.println("Operadores relacionales:");
        System.out.println("Valores de m: " + m + " y n: " + n);
        System.out.println("Verificar relacion m>n: " + (m > n)); // Verifica si m es mayor que n
        System.out.println("Verificar relacion m>=n: " + (m >= n)); // Verifica si m es mayor o igual a n
        System.out.println("Verificar relacion m<n: " + (m < n)); // Verifica si m es menor que n
        System.out.println("Verificar relacion m<=n: " + (m <= n)); // Verifica si m es menor o igual a n
        System.out.println("Verificar relacion m==n: " + (m == n)); // Verifica si m es igual a n
        System.out.println("Verificar relacion m!=n: " + (m != n)); // Verifica si m es diferente de n
    }

    public static void demostrarLogicos(){
        boolean p = true;
        boolean q = false;
        System.out.println("Operadores lógicos:");
        System.out.println("Valores de p: " + p + " y q: " + q);
        System.out.println("operador de conjuncion 'Y' p AND q (p && q): " + (p && q)); // Verifica si p y q son verdaderos
        System.out.println("operador de disyuncion 'O' p OR q (p || q): " + (p || q)); // Verifica si al menos uno de p o q es verdadero
        System.out.println("operador de negacion NOT p (!p): " + (!p)); // Invierte el valor de p
    }

    public static void demostrarAsignacionCompuesta(){
    int a = 10;
    System.out.println("Operadores de asignación compuesta:");
    System.out.println("Valor inicial de a: " + a);
    a += 5; // Equivalente a a = a + 5
    System.out.println("Después de a += 5: " + a);
    a -= 3; // Equivalente a a = a - 3
    System.out.println("Después de a -= 3: " + a);
    a *= 2; // Equivalente a a = a * 2
    System.out.println("Después de a *= 2: " + a);
    a /= 4; // Equivalente a a = a / 4
    System.out.println("Después de a /= 4: " + a);
    a %= 3; // Equivalente a a = a % 3
    System.out.println("Después de a %= 3: " + a);
    }  

    public static void demostrarOperadorTernario(){
        int edad = 18;
        String resultado = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad"; // El operador ternario evalúa la condición y devuelve un valor u otro según el resultado
        System.out.println("Operador ternario:");
        System.out.println("Estos operadores evalúan una expresión booleana y devuelven un valor dependiendo de si la expresión es verdadera o falsa. La sintaxis es: condición ? valor_si_verdadero : valor_si_falso");
        System.out.println("evalua si la edad " + edad + " es >=18: ");
        System.out.println("Resultado del operador ternario: " + resultado);
    }
}
