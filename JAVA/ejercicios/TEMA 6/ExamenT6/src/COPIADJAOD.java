public class COPIADJAOD {
        public static final String RED = "\033[0;91m"; // RED
        public static final String GREEN = "\033[0;92m"; // GREEN
        public static final String YELLOW = "\033[0;93m"; // YELLOW
        public static final String RESET = "\033[0m"; // Text Reset

        public static void main(String[] args) throws Exception {
                //AQUI DECLARO LAS VARIABLES
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
                for (int i = 1; i <= 11; i++) {
                        //AQUI PONGO TODOS LO NUMERO ALEATORIOS
                        dados1 = (int) (Math.random() * (6 - 1 + 1) + 1);
                        dados2 = (int) (Math.random() * (6 - 1 + 1) + 1);
                        dados3 = (int) (Math.random() * (6 - 1 + 1) + 1);
                        dados4 = (int) (Math.random() * (6 - 1 + 1) + 1);
                        dados5 = (int) (Math.random() * (6 - 1 + 1) + 1);
                        dados6 = (int) (Math.random() * (6 - 1 + 1) + 1);
                        System.out.println(RED + "Ronda " + i + " ; Puntuación objetivo: " + puntuacion + RESET);
                        //A PARTIR DE AQUI REPITO TODO EL PROCESO
                        switch (i) {
                                case 1:
                                        if ((dados1 + dados2) == 2 || (dados3 + dados4) == 2
                                                        || (dados5 + dados6) == 2) {
                                                jugador1 = jugador1 + 1;
                                                jugador2 = jugador2 + 1;
                                                jugador3 = jugador3 + 1;
                                                System.out
                                                                .println("Tirada del jugador 1: " + dados1 + "-"
                                                                                + dados2 + " ;" + jugador1 + " punto");
                                                System.out
                                                                .println("Tirada del jugador 2: " + dados3 + "-"
                                                                                + dados4 + " ;" + jugador2 + " punto");
                                                System.out
                                                                .println("Tirada del jugador 3: " + dados5 + "-"
                                                                                + dados6 + " ;" + jugador3 + " punto");
                                                puntosJuador1 = jugador1 + puntosJuador1;
                                                puntosJuador2 = jugador2 + puntosJuador2;
                                                puntosJuador3 = jugador3 + puntosJuador3;
                                                System.out.println(
                                                                "Puntuaciones generales: Jugador 1 - " + puntosJuador1
                                                                                + " puntos ; Jugador 2 - "
                                                                                + puntosJuador2
                                                                                + " puntos ; Jugador 3 - "
                                                                                + puntosJuador3 + " puntos");
                                        } else {
                                                System.out.println(
                                                                "Tirada del jugador 1: " + dados1 + "-" + dados2 + " ;"
                                                                                + puntosJuador1 + " puntos");
                                                System.out.println(
                                                                "Tirada del jugador 2: " + dados3 + "-" + dados4 + " ;"
                                                                                + puntosJuador2 + " puntos");
                                                System.out.println(
                                                                "Tirada del jugador 3: " + dados5 + "-" + dados6 + " ;"
                                                                                + puntosJuador3 + " puntos");
                                                System.out.println(
                                                                "Puntuaciones generales: Jugador 1 - " + puntosJuador1
                                                                                + " puntos ; Jugador 2 - "
                                                                                + puntosJuador2
                                                                                + " puntos ; Jugador 3 - "
                                                                                + puntosJuador3 + " puntos");
                                        }
                                        break;
                                case 2:
                                        if ((dados1 + dados2) == 3 || (dados3 + dados4) == 3
                                                        || (dados5 + dados6) == 3) {
                                                jugador1 = jugador1 + 1;
                                                jugador2 = jugador2 + 1;
                                                jugador3 = jugador3 + 1;
                                                System.out
                                                                .println("Tirada del jugador 1: " + dados1 + "-"
                                                                                + dados2 + " ;" + jugador1 + " punto");
                                                System.out
                                                                .println("Tirada del jugador 2: " + dados3 + "-"
                                                                                + dados4 + " ;" + jugador2 + " punto");
                                                System.out
                                                                .println("Tirada del jugador 3: " + dados5 + "-"
                                                                                + dados6 + " ;" + jugador3 + " punto");
                                                puntosJuador1 = jugador1 + puntosJuador1;
                                                puntosJuador2 = jugador2 + puntosJuador2;
                                                puntosJuador3 = jugador3 + puntosJuador3;
                                                System.out.println(
                                                                "Puntuaciones generales: Jugador 1 - " + puntosJuador1
                                                                                + " puntos ; Jugador 2 - "
                                                                                + puntosJuador2
                                                                                + " puntos ; Jugador 3 - "
                                                                                + puntosJuador3 + " puntos");
                                        } else {
                                                System.out.println(
                                                                "Tirada del jugador 1: " + dados1 + "-" + dados2 + " ;"
                                                                                + puntosJuador1 + " puntos");
                                                System.out.println(
                                                                "Tirada del jugador 2: " + dados3 + "-" + dados4 + " ;"
                                                                                + puntosJuador2 + " puntos");
                                                System.out.println(
                                                                "Tirada del jugador 3: " + dados5 + "-" + dados6 + " ;"
                                                                                + puntosJuador3 + " puntos");
                                                System.out.println(
                                                                "Puntuaciones generales: Jugador 1 - " + puntosJuador1
                                                                                + " puntos ; Jugador 2 - "
                                                                                + puntosJuador2
                                                                                + " puntos ; Jugador 3 - "
                                                                                + puntosJuador3 + " puntos");
                                        }
                                        break;
                                case 3:
                                        if ((dados1 + dados2) == 4 || (dados3 + dados4) == 4
                                                        || (dados5 + dados6) == 4) {
                                                jugador1 = jugador1 + 1;
                                                jugador2 = jugador2 + 1;
                                                jugador3 = jugador3 + 1;
                                                System.out
                                                                .println("Tirada del jugador 1: " + dados1 + "-"
                                                                                + dados2 + " ;" + jugador1 + " punto");
                                                System.out
                                                                .println("Tirada del jugador 2: " + dados3 + "-"
                                                                                + dados4 + " ;" + jugador2 + " punto");
                                                System.out
                                                                .println("Tirada del jugador 3: " + dados5 + "-"
                                                                                + dados6 + " ;" + jugador3 + " punto");
                                                puntosJuador1 = jugador1 + puntosJuador1;
                                                puntosJuador2 = jugador2 + puntosJuador2;
                                                puntosJuador3 = jugador3 + puntosJuador3;
                                                System.out.println(
                                                                "Puntuaciones generales: Jugador 1 - " + puntosJuador1
                                                                                + " puntos ; Jugador 2 - "
                                                                                + puntosJuador2
                                                                                + " puntos ; Jugador 3 - "
                                                                                + puntosJuador3 + " puntos");
                                        } else {
                                                System.out.println(
                                                                "Tirada del jugador 1: " + dados1 + "-" + dados2 + " ;"
                                                                                + puntosJuador1 + " puntos");
                                                System.out.println(
                                                                "Tirada del jugador 2: " + dados3 + "-" + dados4 + " ;"
                                                                                + puntosJuador2 + " puntos");
                                                System.out.println(
                                                                "Tirada del jugador 3: " + dados5 + "-" + dados6 + " ;"
                                                                                + puntosJuador3 + " puntos");
                                                System.out.println(
                                                                "Puntuaciones generales: Jugador 1 - " + puntosJuador1
                                                                                + " puntos ; Jugador 2 - "
                                                                                + puntosJuador2
                                                                                + " puntos ; Jugador 3 - "
                                                                                + puntosJuador3 + " puntos");
                                        }
                                        break;
                                case 4:
                                        if ((dados1 + dados2) == 5 || (dados3 + dados4) == 5
                                                        || (dados5 + dados6) == 5) {
                                                jugador1 = jugador1 + 1;
                                                jugador2 = jugador2 + 1;
                                                jugador3 = jugador3 + 1;
                                                System.out
                                                                .println("Tirada del jugador 1: " + dados1 + "-"
                                                                                + dados2 + " ;" + jugador1 + " punto");
                                                System.out
                                                                .println("Tirada del jugador 2: " + dados3 + "-"
                                                                                + dados4 + " ;" + jugador2 + " punto");
                                                System.out
                                                                .println("Tirada del jugador 3: " + dados5 + "-"
                                                                                + dados6 + " ;" + jugador3 + " punto");
                                                puntosJuador1 = jugador1 + puntosJuador1;
                                                puntosJuador2 = jugador2 + puntosJuador2;
                                                puntosJuador3 = jugador3 + puntosJuador3;
                                                System.out.println(
                                                                "Puntuaciones generales: Jugador 1 - " + puntosJuador1
                                                                                + " puntos ; Jugador 2 - "
                                                                                + puntosJuador2
                                                                                + " puntos ; Jugador 3 - "
                                                                                + puntosJuador3 + " puntos");
                                        } else {
                                                System.out.println(
                                                                "Tirada del jugador 1: " + dados1 + "-" + dados2 + " ;"
                                                                                + puntosJuador1 + " puntos");
                                                System.out.println(
                                                                "Tirada del jugador 2: " + dados3 + "-" + dados4 + " ;"
                                                                                + puntosJuador2 + " puntos");
                                                System.out.println(
                                                                "Tirada del jugador 3: " + dados5 + "-" + dados6 + " ;"
                                                                                + puntosJuador3 + " puntos");
                                                System.out.println(
                                                                "Puntuaciones generales: Jugador 1 - " + puntosJuador1
                                                                                + " puntos ; Jugador 2 - "
                                                                                + puntosJuador2
                                                                                + " puntos ; Jugador 3 - "
                                                                                + puntosJuador3 + " puntos");
                                        }
                                        break;
                                case 5:
                                        if ((dados1 + dados2) == 6 || (dados3 + dados4) == 6
                                                        || (dados5 + dados6) == 6) {
                                                jugador1 = jugador1 + 1;
                                                jugador2 = jugador2 + 1;
                                                jugador3 = jugador3 + 1;
                                                System.out
                                                                .println("Tirada del jugador 1: " + dados1 + "-"
                                                                                + dados2 + " ;" + jugador1 + " punto");
                                                System.out
                                                                .println("Tirada del jugador 2: " + dados3 + "-"
                                                                                + dados4 + " ;" + jugador2 + " punto");
                                                System.out
                                                                .println("Tirada del jugador 3: " + dados5 + "-"
                                                                                + dados6 + " ;" + jugador3 + " punto");
                                                puntosJuador1 = jugador1 + puntosJuador1;
                                                puntosJuador2 = jugador2 + puntosJuador2;
                                                puntosJuador3 = jugador3 + puntosJuador3;
                                                System.out.println(
                                                                "Puntuaciones generales: Jugador 1 - " + puntosJuador1
                                                                                + " puntos ; Jugador 2 - "
                                                                                + puntosJuador2
                                                                                + " puntos ; Jugador 3 - "
                                                                                + puntosJuador3 + " puntos");
                                        } else {
                                                System.out.println(
                                                                "Tirada del jugador 1: " + dados1 + "-" + dados2 + " ;"
                                                                                + puntosJuador1 + " puntos");
                                                System.out.println(
                                                                "Tirada del jugador 2: " + dados3 + "-" + dados4 + " ;"
                                                                                + puntosJuador2 + " puntos");
                                                System.out.println(
                                                                "Tirada del jugador 3: " + dados5 + "-" + dados6 + " ;"
                                                                                + puntosJuador3 + " puntos");
                                                System.out.println(
                                                                "Puntuaciones generales: Jugador 1 - " + puntosJuador1
                                                                                + " puntos ; Jugador 2 - "
                                                                                + puntosJuador2
                                                                                + " puntos ; Jugador 3 - "
                                                                                + puntosJuador3 + " puntos");
                                        }
                                        break;
                                case 6:
                                        if ((dados1 + dados2) == 7 || (dados3 + dados4) == 7
                                                        || (dados5 + dados6) == 7) {
                                                jugador1 = jugador1 + 1;
                                                jugador2 = jugador2 + 1;
                                                jugador3 = jugador3 + 1;
                                                System.out
                                                                .println("Tirada del jugador 1: " + dados1 + "-"
                                                                                + dados2 + " ;" + jugador1 + " punto");
                                                System.out
                                                                .println("Tirada del jugador 2: " + dados3 + "-"
                                                                                + dados4 + " ;" + jugador2 + " punto");
                                                System.out
                                                                .println("Tirada del jugador 3: " + dados5 + "-"
                                                                                + dados6 + " ;" + jugador3 + " punto");
                                                puntosJuador1 = jugador1 + puntosJuador1;
                                                puntosJuador2 = jugador2 + puntosJuador2;
                                                puntosJuador3 = jugador3 + puntosJuador3;
                                                System.out.println(
                                                                "Puntuaciones generales: Jugador 1 - " + puntosJuador1
                                                                                + " puntos ; Jugador 2 - "
                                                                                + puntosJuador2
                                                                                + " puntos ; Jugador 3 - "
                                                                                + puntosJuador3 + " puntos");
                                        } else {
                                                System.out.println(
                                                                "Tirada del jugador 1: " + dados1 + "-" + dados2 + " ;"
                                                                                + puntosJuador1 + " puntos");
                                                System.out.println(
                                                                "Tirada del jugador 2: " + dados3 + "-" + dados4 + " ;"
                                                                                + puntosJuador2 + " puntos");
                                                System.out.println(
                                                                "Tirada del jugador 3: " + dados5 + "-" + dados6 + " ;"
                                                                                + puntosJuador3 + " puntos");
                                                System.out.println(
                                                                "Puntuaciones generales: Jugador 1 - " + puntosJuador1
                                                                                + " puntos ; Jugador 2 - "
                                                                                + puntosJuador2
                                                                                + " puntos ; Jugador 3 - "
                                                                                + puntosJuador3 + " puntos");
                                        }
                                        break;
                                case 7:
                                        if ((dados1 + dados2) == 8 || (dados3 + dados4) == 8
                                                        || (dados5 + dados6) == 8) {
                                                jugador1 = jugador1 + 1;
                                                jugador2 = jugador2 + 1;
                                                jugador3 = jugador3 + 1;
                                                System.out
                                                                .println("Tirada del jugador 1: " + dados1 + "-"
                                                                                + dados2 + " ;" + jugador1 + " punto");
                                                System.out
                                                                .println("Tirada del jugador 2: " + dados3 + "-"
                                                                                + dados4 + " ;" + jugador2 + " punto");
                                                System.out
                                                                .println("Tirada del jugador 3: " + dados5 + "-"
                                                                                + dados6 + " ;" + jugador3 + " punto");
                                                puntosJuador1 = jugador1 + puntosJuador1;
                                                puntosJuador2 = jugador2 + puntosJuador2;
                                                puntosJuador3 = jugador3 + puntosJuador3;
                                                System.out.println(
                                                                "Puntuaciones generales: Jugador 1 - " + puntosJuador1
                                                                                + " puntos ; Jugador 2 - "
                                                                                + puntosJuador2
                                                                                + " puntos ; Jugador 3 - "
                                                                                + puntosJuador3 + " puntos");
                                        } else {
                                                System.out.println(
                                                                "Tirada del jugador 1: " + dados1 + "-" + dados2 + " ;"
                                                                                + puntosJuador1 + " puntos");
                                                System.out.println(
                                                                "Tirada del jugador 2: " + dados3 + "-" + dados4 + " ;"
                                                                                + puntosJuador2 + " puntos");
                                                System.out.println(
                                                                "Tirada del jugador 3: " + dados5 + "-" + dados6 + " ;"
                                                                                + puntosJuador3 + " puntos");
                                                System.out.println(
                                                                "Puntuaciones generales: Jugador 1 - " + puntosJuador1
                                                                                + " puntos ; Jugador 2 - "
                                                                                + puntosJuador2
                                                                                + " puntos ; Jugador 3 - "
                                                                                + puntosJuador3 + " puntos");
                                        }
                                        break;
                                case 8:
                                        if ((dados1 + dados2) == 9 || (dados3 + dados4) == 9
                                                        || (dados5 + dados6) == 9) {
                                                jugador1 = jugador1 + 1;
                                                jugador2 = jugador2 + 1;
                                                jugador3 = jugador3 + 1;
                                                System.out
                                                                .println("Tirada del jugador 1: " + dados1 + "-"
                                                                                + dados2 + " ;" + jugador1 + " punto");
                                                System.out
                                                                .println("Tirada del jugador 2: " + dados3 + "-"
                                                                                + dados4 + " ;" + jugador2 + " punto");
                                                System.out
                                                                .println("Tirada del jugador 3: " + dados5 + "-"
                                                                                + dados6 + " ;" + jugador3 + " punto");
                                                puntosJuador1 = jugador1 + puntosJuador1;
                                                puntosJuador2 = jugador2 + puntosJuador2;
                                                puntosJuador3 = jugador3 + puntosJuador3;
                                                System.out.println(
                                                                "Puntuaciones generales: Jugador 1 - " + puntosJuador1
                                                                                + " puntos ; Jugador 2 - "
                                                                                + puntosJuador2
                                                                                + " puntos ; Jugador 3 - "
                                                                                + puntosJuador3 + " puntos");
                                        } else {
                                                System.out.println(
                                                                "Tirada del jugador 1: " + dados1 + "-" + dados2 + " ;"
                                                                                + puntosJuador1 + " puntos");
                                                System.out.println(
                                                                "Tirada del jugador 2: " + dados3 + "-" + dados4 + " ;"
                                                                                + puntosJuador2 + " puntos");
                                                System.out.println(
                                                                "Tirada del jugador 3: " + dados5 + "-" + dados6 + " ;"
                                                                                + puntosJuador3 + " puntos");
                                                System.out.println(
                                                                "Puntuaciones generales: Jugador 1 - " + puntosJuador1
                                                                                + " puntos ; Jugador 2 - "
                                                                                + puntosJuador2
                                                                                + " puntos ; Jugador 3 - "
                                                                                + puntosJuador3 + " puntos");
                                        }
                                        break;
                                case 9:
                                        if ((dados1 + dados2) == 10 || (dados3 + dados4) == 10
                                                        || (dados5 + dados6) == 10) {
                                                jugador1 = jugador1 + 1;
                                                jugador2 = jugador2 + 1;
                                                jugador3 = jugador3 + 1;
                                                System.out
                                                                .println("Tirada del jugador 1: " + dados1 + "-"
                                                                                + dados2 + " ;" + jugador1 + " punto");
                                                System.out
                                                                .println("Tirada del jugador 2: " + dados3 + "-"
                                                                                + dados4 + " ;" + jugador2 + " punto");
                                                System.out
                                                                .println("Tirada del jugador 3: " + dados5 + "-"
                                                                                + dados6 + " ;" + jugador3 + " punto");
                                                puntosJuador1 = jugador1 + puntosJuador1;
                                                puntosJuador2 = jugador2 + puntosJuador2;
                                                puntosJuador3 = jugador3 + puntosJuador3;
                                                System.out.println(
                                                                "Puntuaciones generales: Jugador 1 - " + puntosJuador1
                                                                                + " puntos ; Jugador 2 - "
                                                                                + puntosJuador2
                                                                                + " puntos ; Jugador 3 - "
                                                                                + puntosJuador3 + " puntos");
                                        } else {
                                                System.out.println(
                                                                "Tirada del jugador 1: " + dados1 + "-" + dados2 + " ;"
                                                                                + puntosJuador1 + " puntos");
                                                System.out.println(
                                                                "Tirada del jugador 2: " + dados3 + "-" + dados4 + " ;"
                                                                                + puntosJuador2 + " puntos");
                                                System.out.println(
                                                                "Tirada del jugador 3: " + dados5 + "-" + dados6 + " ;"
                                                                                + puntosJuador3 + " puntos");
                                                System.out.println(
                                                                "Puntuaciones generales: Jugador 1 - " + puntosJuador1
                                                                                + " puntos ; Jugador 2 - "
                                                                                + puntosJuador2
                                                                                + " puntos ; Jugador 3 - "
                                                                                + puntosJuador3 + " puntos");
                                        }
                                        break;
                                case 10:
                                        if ((dados1 + dados2) == 11 || (dados3 + dados4) == 11
                                                        || (dados5 + dados6) == 11) {
                                                jugador1 = jugador1 + 1;
                                                jugador2 = jugador2 + 1;
                                                jugador3 = jugador3 + 1;
                                                System.out
                                                                .println("Tirada del jugador 1: " + dados1 + "-"
                                                                                + dados2 + " ;" + jugador1 + " punto");
                                                System.out
                                                                .println("Tirada del jugador 2: " + dados3 + "-"
                                                                                + dados4 + " ;" + jugador2 + " punto");
                                                System.out
                                                                .println("Tirada del jugador 3: " + dados5 + "-"
                                                                                + dados6 + " ;" + jugador3 + " punto");
                                                puntosJuador1 = jugador1 + puntosJuador1;
                                                puntosJuador2 = jugador2 + puntosJuador2;
                                                puntosJuador3 = jugador3 + puntosJuador3;
                                                System.out.println(
                                                                "Puntuaciones generales: Jugador 1 - " + puntosJuador1
                                                                                + " puntos ; Jugador 2 - "
                                                                                + puntosJuador2
                                                                                + " puntos ; Jugador 3 - "
                                                                                + puntosJuador3 + " puntos");
                                        } else {
                                                System.out.println(
                                                                "Tirada del jugador 1: " + dados1 + "-" + dados2 + " ;"
                                                                                + puntosJuador1 + " puntos");
                                                System.out.println(
                                                                "Tirada del jugador 2: " + dados3 + "-" + dados4 + " ;"
                                                                                + puntosJuador2 + " puntos");
                                                System.out.println(
                                                                "Tirada del jugador 3: " + dados5 + "-" + dados6 + " ;"
                                                                                + puntosJuador3 + " puntos");
                                                System.out.println(
                                                                "Puntuaciones generales: Jugador 1 - " + puntosJuador1
                                                                                + " puntos ; Jugador 2 - "
                                                                                + puntosJuador2
                                                                                + " puntos ; Jugador 3 - "
                                                                                + puntosJuador3 + " puntos");
                                        }
                                        break;
                                case 11:
                                        if ((dados1 + dados2) == 12 || (dados3 + dados4) == 12
                                                        || (dados5 + dados6) == 12) {
                                                jugador1 = jugador1 + 1;
                                                jugador2 = jugador2 + 1;
                                                jugador3 = jugador3 + 1;
                                                System.out
                                                                .println("Tirada del jugador 1: " + dados1 + "-"
                                                                                + dados2 + " ;" + jugador1 + " punto");
                                                System.out
                                                                .println("Tirada del jugador 2: " + dados3 + "-"
                                                                                + dados4 + " ;" + jugador2 + " punto");
                                                System.out
                                                                .println("Tirada del jugador 3: " + dados5 + "-"
                                                                                + dados6 + " ;" + jugador3 + " punto");
                                                puntosJuador1 = jugador1 + puntosJuador1;
                                                puntosJuador2 = jugador2 + puntosJuador2;
                                                puntosJuador3 = jugador3 + puntosJuador3;
                                                System.out.println(
                                                                "Puntuaciones generales: Jugador 1 - " + puntosJuador1
                                                                                + " puntos ; Jugador 2 - "
                                                                                + puntosJuador2
                                                                                + " puntos ; Jugador 3 - "
                                                                                + puntosJuador3 + " puntos");
                                        } else {
                                                System.out.println(
                                                                "Tirada del jugador 1: " + dados1 + "-" + dados2 + " ;"
                                                                                + puntosJuador1 + " puntos");
                                                System.out.println(
                                                                "Tirada del jugador 2: " + dados3 + "-" + dados4 + " ;"
                                                                                + puntosJuador2 + " puntos");
                                                System.out.println(
                                                                "Tirada del jugador 3: " + dados5 + "-" + dados6 + " ;"
                                                                                + puntosJuador3 + " puntos");
                                                System.out.println(
                                                                "Puntuaciones generales: Jugador 1 - " + puntosJuador1
                                                                                + " puntos ; Jugador 2 - "
                                                                                + puntosJuador2
                                                                                + " puntos ; Jugador 3 - "
                                                                                + puntosJuador3 + " puntos");
                                        }
                                        break;
                                default:
                                        break;
                        }
                        System.out.println("Pulse INTRO para la siguiente ronda");
                        System.console().readLine();
                        puntuacion++;
                }

        }
}
