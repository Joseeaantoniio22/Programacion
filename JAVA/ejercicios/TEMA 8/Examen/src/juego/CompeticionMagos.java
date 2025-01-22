package juego;

import utilidades.GeneradorAleatorio;
import utilidades.ImpresoraResultados;
import utilidades.CalculadorPuntuacion;
/*
 * @Author Jose Antonio Fernandez Guerrero
 * Lo realizado anteriormente es la importacion de las funciones.
 */

public class CompeticionMagos {
    /*
     * 
     * A partir de aqui empieza el codigo que he realizado, llamando a las
     * funciones, colores, etc.
     */

    public static final String RED = "\033[0;91m"; // RED
    public static final String GREEN = "\033[0;92m"; // GREEN
    public static final String YELLOW = "\033[0;93m"; // YELLOW
    public static final String RESET = "\033[0m"; // Text Reset

    public static void main(String[] args) throws Exception {
        double acumulativo1 = 0;
        double acumulativo2 = 0;
        /*
         * Aqui le damos la bienvenida a los usuarios del juego con este mensaje
         */
        System.out.println(RED + "Bienvenido a la competicion de magos" + RESET);
        System.out.println("Pulse enter cuando quieras inciar el juego");
        System.console().readLine();
        for (int i = 1; i <= 5; i++) {
            System.out.println(GREEN + "RONDA " + i + RESET);
            System.out.println(" ");
            System.out.println("Empieza el mago 1 jugando: ");
            int dados1 = 0;
            /*
             * Aqui nombramos a la primera funcion para que nos diga los dados aleatorios,
             * para los usuarios
             */
            dados1 = GeneradorAleatorio.generarDados();
            System.out.println("Ha obtenido la cara " + dados1 + " del dado.");
            int carta1 = 0;
            carta1 = GeneradorAleatorio.generarCarta();
            System.out.println("Ha obtenido la carta " + carta1 + ".");
            System.out.println(" ");
            System.out.println("Ahora es turno del mago 2 : ");
            int dados2 = 0;
            dados2 = GeneradorAleatorio.generarDados();
            System.out.println("Ha obtenido la cara " + dados2 + " del dado.");
            int carta2 = 0;
            carta2 = GeneradorAleatorio.generarCarta();
            System.out.println("Ha obtenido la carta " + carta2 + ".");
            System.out.println(" ");
            double puntuacion1 = 0;
            /*
             * Aqui llamamos a la segunda funcion para que nos calcule
             */
            puntuacion1 = CalculadorPuntuacion.calcularPuntuacion(carta1, dados1);
            acumulativo1 = puntuacion1 + acumulativo1;
            System.out.printf(YELLOW + "La puntucacion del mago 1 es de: %4.2f\n" + RESET, puntuacion1);
            System.out.printf("La puntuacion acumulada del mago 1 es de: %4.2f\n", acumulativo1);
            double puntuacion2 = 0;
            puntuacion2 = CalculadorPuntuacion.calcularPuntuacion(carta2, dados2);
            acumulativo2 = puntuacion2 + acumulativo2;
            System.out.printf(YELLOW + "La puntuacion del mago 2 es de: %4.2f\n" + RESET, puntuacion2);
            System.out.printf("La puntuacion acumulada del mago 2 es de: %4.2f\n", acumulativo2);
            System.out.println(" ");
            if (i <= 4) {
                System.out.println("Pulse ENTER para entrar en la siguiente ronda");
                System.console().readLine();
            }
        }
        System.out.println(GREEN + ImpresoraResultados.imprimirResultados(acumulativo1, acumulativo2) + RESET);
    }
}
