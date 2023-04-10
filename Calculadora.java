package testjunit;

public class Calculadora{
    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multi(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero"); 
            //esta instrucción la usamos para que nos devuelva un mensaje de error
        }
        return a / b;
    }
}
