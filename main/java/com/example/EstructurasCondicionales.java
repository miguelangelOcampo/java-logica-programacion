package com.example;

public class EstructurasCondicionales {
    public static void ejemploIf() { //solo se evalua una unica condicion
        int numero = 10;
        System.out.println("El número es: " + numero);
        if (numero > 5) {
            System.out.println("Condicion unica El número es mayor que 5");
        }
    }

    public static void ejemploIfElse() { //se evalua la condicion y su excepcion
        int edad = 16;
        System.out.println("La edad es: " + edad);
        if (edad >= 18) {
            System.out.println("1ra condicion Mayor de edad");
        } else {
            System.out.println("Si la condicion no fue cumplida, se considera Menor de edad");
        }
    }

    public static void ejemploIfElseIfElse() { //se evaluan varias condiciones y sus excepciones
        int nota = 75;
        System.out.println("La nota es: " + nota);
        if (nota >= 90) {
            System.out.println("1ra condicion Excelente");
        } else if (nota >= 70) {
            System.out.println("2da condicion Aprobado");
        } else {
            System.out.println("si ninguna condicion fue cumplida, se considera Reprobado");
        }
    }

    public static void ejemploSwitch() { //Se evaluan varios casos posibles, a diferencia de if-else, switch es mas eficiente para evaluar multiples casos de una misma variable
        int dia = 3;
        System.out.println("El número del día es: " + dia);
        switch (dia) {
            case 1:
                System.out.println("1r caso `Lunes");
                break;
            case 2:
                System.out.println("2do caso Martes");
                break;
            case 3:
                System.out.println("3ro caso Miércoles");
                break;
            default:
                System.out.println("Caso por defecto Otro día");
        }
    }
    public static void ejemploSwitchExpression() {//Es una forma mas concisa de escribir un switch, introducida en Java 12, que permite asignar el resultado de la evaluación a una variable
        int dia = 2;
        String resultado = switch (dia) { //se almacena el resultado de la evaluacion del switch en la variable resultado
            case 1 -> "1r caso Lunes";
            case 2 -> "2do caso Martes";
            case 3 -> "3ro caso Miércoles";
            default -> "Caso por defecto Otro día";
        };
        System.out.println(resultado);
    }
}
