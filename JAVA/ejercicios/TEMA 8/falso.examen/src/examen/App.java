package examen;

import funciones.calculadora.Calculadora;
import funciones.primo.Esprimo;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Que quieres hacer:");
        System.out.println("1-Calculadora Aleatorio");
        System.out.println("2- Numero Primo entre dos valores");
        int eleccion = Integer.parseInt(System.console().readLine());
        switch (eleccion) {
            case 1:
                System.out.println("Seleccione que operacion quiere realizar:");
                System.out.println("1- Suma");
                System.out.println("2- Resta");
                System.out.println("3- Multiplicacion");
                System.out.println("4- Division");
                int opcion = Integer.parseInt(System.console().readLine());
                Calculadora.menu(opcion);
                break;
            case 2:
            System.out.print("Dime el valor minimo que quieres q empieza a contar los numeros primos: ");
            int min=Integer.parseInt(System.console().readLine());
            System.out.print("Dime el valor maximo que quieres que cuente: ");
            int max=Integer.parseInt(System.console().readLine());
            Esprimo.comprimo(min, max);
            break;
            default:
                break;
        }
    }
}
