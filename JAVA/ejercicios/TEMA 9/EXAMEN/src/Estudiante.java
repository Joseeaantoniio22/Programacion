public class Estudiante {
    /*
     * @Author Jose Antonio Fernandez Guerrero
     * Lo que hay justo debajo es el codigo que necesito para poder colorear el
     * texto que vamos a sacar por pantalla
     */
    public static final String RED_BRIGHT = "\033[0;91m"; // RED
    public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String RESET = "\033[0m"; // Text Reset

    private String matricula = "";
    private String nombre = "";
    /*
     * Esto de aqui son las variables que he utilizado para poder realizar las
     * funciones, constructores, etc.
     */
    private int edad = 0;
    private double promedio = 0;

    public Estudiante(String matricula, String nombre, int edad, double promedio) {
        this.matricula = matricula;
        setEdad(edad);
        this.nombre = nombre;
        setPromedio(promedio);
        ;
        /*
         * Este es el constructor que utilizamos y las variables anteriores, hay dos
         * variables que antes de ponerlas aquí han pasado por la funcion para saber que
         * dato imprimir
         */
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        } else {
            this.edad = 0;
        }
        /*
         * Esta funcion comprueba que la edad sea la correcta
         */
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 10) {
            this.promedio = promedio;
        } else {
            this.promedio = 0;
        }
        /*
         * Esta funcion comprueba que el promedio sea el correcta
         */
    }

    public double getPromedio() {
        return this.promedio;
    }

    public String toString() {
        return "Estudiante[matrícula=" + matricula + ", nombre=" + nombre + ", edad=" + edad + ", promedio="
                + this.promedio + "]";
    }

    public void comparacion(Estudiante estudiante) {
        double promedio1 = this.promedio;
        double promedio2;
        promedio2 = estudiante.getPromedio();
        if (promedio1 == promedio2) {
            System.out.println(YELLOW_BRIGHT + "Teneis el mismo promedio, enhorabuena a los dos." + RESET);
        } else if (promedio1 > promedio2) {
            System.out.println(
                    YELLOW_BRIGHT + "El estudiante 1 tiene mayor promedio que el estudiante 2, enhorabuena." + RESET);
        } else {
            System.out.println(
                    YELLOW_BRIGHT + "El estudiante 2 tiene mayor promedio que el estudiante 1. Enhorabuena" + RESET);
        }
        /*
         * Esta funcion la he realizado para mostrar el mensaje de comparacion
         */
    }
}
