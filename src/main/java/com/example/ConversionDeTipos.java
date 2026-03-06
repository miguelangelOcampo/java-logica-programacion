package com.example;

public class ConversionDeTipos {
    
public static void demostrarCastingImplicito(){
    System.out.println("Demostrando casting implícito:");//Al hablar de implicidad hablamos de cosas intuitivas que por logica se pueden entender sin necesidad de explicarse 
    int numeroInt = 100;//el valor de numeroInt se convierte a tipo double pasa de 100 a 100.0 sin manipularse la variable
    double numeroLong = numeroInt; //para este caso no es necesario especificar el tipo de dato al que se convertira el valor de numeroInt por que no hay perdida de informacion
    System.out.println("Valor de numeroInt: " + numeroInt);
    System.out.println("Valor de numeroLong: " + numeroLong);
}
public static void demostrarCastingExplicito(){
    System.out.println("Demostrando casting explícito:");//Al referirnos a explicidad hablamos de informacion muy detallada sobre el proceso de conversion
    double numeroDouble = 4.87; //el valor de numeroDouble se convierte a tipo int pasa de 4.87 a 4 pero se pierde la parte decimal
    int numeroInt = (int) numeroDouble; // hay que dejar claro el valor al que valor de numeroDouble sera de tipo int por que habra perdida de informacion al convertir un numero con decimales a un numero entero
    System.out.println("Valor de numeroDouble: " + numeroDouble);
    System.out.println("Valor de numeroInt: " + numeroInt);
}
public static void demostrarProblemasDePrecision(){
    System.out.println("Demostrando problemas de precisión:");
    double numeroDouble = 0.1; //el valor de numeroDouble se convierte a tipo float pasa de 0.1 a 0 por que el tipo de dato int no tiene la capacidad de almacenar numeros con tanta precision
    int numeroInt = (int) numeroDouble; 
    System.out.println("Valor de numeroDouble: " + numeroDouble);
    System.out.println("Valor de numeroInt: " + numeroInt);
}
}