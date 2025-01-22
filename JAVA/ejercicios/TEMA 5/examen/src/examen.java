public class examen {
    public static final String RED = "\033[0;91m"; // RED
    public static final String GREEN = "\033[0;92m"; // GREEN
    public static final String YELLOW = "\033[0;93m"; // YELLOW
    public static final String RESET = "\033[0m"; // Text Reset

    public static void main(String[] args) throws Exception {
        System.out.print("Ingrese una contraseña: ");
        String contraseñaIntroducida = System.console().readLine();
        int intentos = 1;
        if (contraseñaIntroducida.equals("")) {
            // Aqui muestro el mensaje de que no ha introducio la contraseña
            System.out.println(RED + "Error: Debes ingresar la contraseña." + RESET);
        } else {
            while (intentos < 3) {
                if (!tamaño(contraseñaIntroducida)) {
                    System.out.println(RED + "Error: La contraseña debe tener al menos 8 caracteres." + RESET);
                }
                contraseñaIntroducida = System.console().readLine();
                intentos++;
            }
            if (intentos == 3) {
                System.out.println(YELLOW + "Número máximo de intentos alcanzado." + RESET);
            }
        }
    }

    // A partir de aqui hago todas las funciones
    public static boolean letraminuscula(char minus) {
        if (Character.isLowerCase(minus)) {
            return true;
        }
        return false;
    }

    public static boolean letraMayuscula(char mayus) {
        if (Character.isUpperCase(mayus)) {
            return true;
        }
        return false;
    }

    public static boolean tamaño(String tamaño) {
        if (tamaño.length() >= 8) {
            return true;
        }
        return false;
    }

    public static boolean digitos(char numero) {
        for (int i = 0; i < numero; i++) {
            if (digitos(numero)) {
                return true;
            }
        }
        return false;
    }

}
// Jose Antonio Fernandez Guerrero