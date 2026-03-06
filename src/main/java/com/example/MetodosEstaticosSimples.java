package com.example;

public class MetodosEstaticosSimples {
    public static void ejemploDeclaracionLlamada() {
        System.out.println("Ejemplo de declaración y llamada a un método estático simple:\nUn método estático es un bloque de código que pertenece a la clase en lugar de a una instancia específica, se puede llamar directamente usando el nombre de la clase sin necesidad de crear un objeto");
    }
    public static void ejemploPasoParametros(String mensaje, int numero) {
        System.out.println("Ejemplo de método estático con paso de parámetros:\nLos métodos estáticos pueden recibir parámetros para realizar operaciones con ellos, se definen dentro de los paréntesis al declarar el método y se utilizan dentro del cuerpo del método");
        System.out.println("Mensaje: " + mensaje + ", Número: " + numero);
    }
    public static int ejemploRetornoValores(int a, int b) {
        int resultado = a + b;
        return resultado;
    }
    public static void ejemploSobrecarga(){
        System.out.println("Ejemplo de sobrecarga de métodos estáticos:\nLa sobrecarga de métodos permite definir varios métodos con el mismo nombre pero con diferentes parámetros, el compilador determina cuál método llamar en función de los argumentos proporcionados");
    }
    public static void ejemploSobrecarga(int numero){
        System.out.println("Sobrecarga de método con un parámetro entero: " + numero);
    }
    public static void ejemploSobrecarga(String texto, int numero){
        System.out.println("Sobrecarga de método con un parámetro String: " + texto + ", Número: " + numero);
    }

}
