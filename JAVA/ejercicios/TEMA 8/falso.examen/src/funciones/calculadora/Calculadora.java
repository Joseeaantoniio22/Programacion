package funciones.calculadora;
import funciones.numeroaleatorio.Random;
public class Calculadora {
    public static void menu(int opcion) {
        System.out.println("El primer numero es: ");
        int a= Random.random(1, 100);
        System.out.println(a);
        System.out.println("Dime el segundo numero: ");
        int b= Random.random(1, 100);
        System.out.println(b);
        switch (opcion) {
            case 1:
            System.out.print("El resultado es: ");
                System.out.println(sumar(a,b));
                break;
            case 2:
                restar(a, b);
                System.out.println(restar(a,b));
                break;
            case 3:
                multiplicar(a, b);
                System.out.println(multiplicar(a, b));
                break;
            case 4:
                dividir(a, b);
                System.out.println(dividir(a, b));
                break;
            default:
            System.out.println("ERROR");
                break;
        }
    }

    public static int sumar(int a, int b) {
        return (a + b);
    }

    public static int restar(int a, int b) {
        return (a - b);
    }

    public static int multiplicar(int a, int b) {
        return (a * b);
    }

    public static int dividir(int a, int b) {
        return (a / b);
    }
}
