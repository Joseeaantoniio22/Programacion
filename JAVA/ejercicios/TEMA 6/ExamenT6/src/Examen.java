public class Examen {
        public static final String RED = "\033[0;91m"; // RED
        public static final String GREEN = "\033[0;92m"; // GREEN
        public static final String YELLOW = "\033[0;93m"; // YELLOW
        public static final String RESET = "\033[0m"; // Text Reset

        public static void main(String[] args) throws Exception {
                // AQUI DECLARO TODAS LAS VARIABLES QUE HE UTILIZADO
                int puntuacion = 2;
                int jugador1 = 0;
                int jugador2 = 0;
                int jugador3 = 0;
                int puntosJuador1 = 0;
                int puntosJuador2 = 0;
                int puntosJuador3 = 0;
                int dados1 = 0;
                int dados2 = 0;
                int dados3 = 0;
                int dados4 = 0;
                int dados5 = 0;
                int dados6 = 0;
                System.out.println(YELLOW + "CHICAGO" + RESET);
                // A PARTIR DE AQUI HAGO TODO EL RPOCESO PARA LOS NUMEROS ALEATORIOS Y PARA
                // SUMAR
                for (int i = 1; i <= 11; i++) {
                        dados1 = (int) (Math.random() * (6 - 1 + 1) + 1);
                        dados2 = (int) (Math.random() * (6 - 1 + 1) + 1);
                        dados3 = (int) (Math.random() * (6 - 1 + 1) + 1);
                        dados4 = (int) (Math.random() * (6 - 1 + 1) + 1);
                        dados5 = (int) (Math.random() * (6 - 1 + 1) + 1);
                        dados6 = (int) (Math.random() * (6 - 1 + 1) + 1);
                        System.out.println(RED + "Ronda " + i + " ; Puntuación objetivo: " + puntuacion + RESET);
                        if (dados1 + dados2 == puntuacion) {
                                jugador1 += 1;
                                System.out.println("Tirada del jugador 1: " + dados1 + "-" + dados2
                                                + " ; " + jugador1 + " puntos");
                        } else if (dados1 + dados2 != puntuacion) {
                                System.out.println("Tirada del jugador 1: " + dados1 + "-" + dados2
                                                + " ; " + jugador1 + " puntos");
                        }
                        puntosJuador1 = jugador1;
                        if (dados3 + dados4 == puntuacion) {
                                jugador2 += 1;
                                System.out.println("Tirada del jugador 2: " + dados3 + "-" + dados4
                                                + " ; " + jugador2 + " puntos");
                        } else if (dados3 + dados4 != puntuacion) {
                                System.out.println("Tirada del jugador 2: " + dados3 + "-" + dados4
                                                + " ; " + jugador2 + " puntos");
                        }
                        puntosJuador2 = jugador2;
                        if (dados5 + dados6 == puntuacion) {
                                jugador3 += 1;
                                System.out.println("Tirada del jugador 3: " + dados5 + "-" + dados6
                                                + " ; " + jugador2 + " puntos");
                        } else if (dados5 + dados6 != puntuacion) {
                                System.out.println("Tirada del jugador 3: " + dados5 + "-" + dados6
                                                + " ; " + jugador2 + " puntos");
                        }
                        puntosJuador3 = jugador3;
                        System.out.println("Puntuaciones generales: Jugador 1 - " + puntosJuador1
                                        + " puntos ; Jugador 2 - " + jugador2 + " puntos ; Jugador 3 - "
                                        + puntosJuador3 + " puntos");
                        puntuacion++;
                        System.out.println("Pulse INTRO para continuar");
                        System.console().readLine();
                }
        }
}