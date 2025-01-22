public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(
                "Porfavor, vaya introduciendo numeros enteros positivos, para terminar, introduzca un numero primo: ");
        int numeroIntroducido = Integer.parseInt(System.console().readLine());
        int contador = 0;
        int sumatorio = numeroIntroducido;
        int numeroMinimo = numeroIntroducido;
        int numeroMaximo = numeroIntroducido;
        while (!esPrimo(numeroIntroducido)) {
            numeroIntroducido = Integer.parseInt(System.console().readLine());
            contador++;
            if (!esPrimo(numeroIntroducido)) {
                sumatorio = numeroIntroducido + sumatorio;
            }
            if (!esPrimo(numeroIntroducido)) {
                if (numeroMinimo > numeroIntroducido) {
                    numeroMinimo = numeroIntroducido;
                }
            }
            if (!esPrimo(numeroIntroducido)) {
                if (numeroMaximo < numeroIntroducido) {
                    numeroMaximo = numeroIntroducido;
                }
            }
        }
        System.out.println("Has introducido " + contador + " numeros NO primos");
        System.out.println("El numero máximo introducido es: " + numeroMaximo);
        System.out.println("El numero mínimo introducido es: " + numeroMinimo);
        System.out.println("La media de todos los numeros es de: " + sumatorio / contador);
    }

    public static boolean esPrimo(int x) {
        int i = 2;
        while (i < x) {
            if (x % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
