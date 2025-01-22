
public class GestionEstudiante {
    public static final String RED_BRIGHT = "\033[0;91m";
    public static final String GREEN_BRIGHT = "\033[0;92m";
    public static final String YELLOW_BRIGHT = "\033[0;93m";
    public static final String RESET = "\033[0m";
    /*
     * @Author Jose Antonio Fernandez Guerrero
     */
    public static Estudiante registrarEstudiante() {
        boolean intento = false;
        int edad = 0;
        double promedio = 0;
        String matricula;
        String nombre;
        /*
         * Estas son las variables que vamos a utilizar en nuestro codigo
         * 
         * Y justo debajo de este comentario empezamos a pedirle la informacion al
         * usuario
         */
        System.out.print(GREEN_BRIGHT + "Digame cuál es su matrícula: " + RESET);
        matricula = System.console().readLine();

        System.out.print(GREEN_BRIGHT + "Dime tu nombre: " + RESET);
        nombre = System.console().readLine();

        while (intento == false) {
            try {
                System.out.print(GREEN_BRIGHT + "Digame cuál es su edad: " + RESET);
                edad = Integer.parseInt(System.console().readLine());
                intento = true;
            } catch (Exception e) {
                System.out.println(RED_BRIGHT + "No has introducido los datos correctamente" + RESET);
            }
            /*
             * En este bucle lo que hago es decirle que mientras que el intento sea falso,
             * es decir, que no haya introducido el valor correcto, se repita hasta que
             * introduzca el valor correcto
             * 
             */
        }
        /*
         * La linea intento=false la pongo porque como en el bucle de arriba es
         * verdadero pues entonces no me lee el siguiente bucle y le tengo que dar otra
         * vez el valor falso al intento
         */
        intento = false;
        while (intento == false) {
            try {
                System.out.print(GREEN_BRIGHT + "Por último digame cuál es su promedio: " + RESET);
                promedio = Double.parseDouble(System.console().readLine());
                intento = true;
            } catch (Exception e) {
                System.out.println(RED_BRIGHT + "No has introducido los datos correctamente" + RESET);
            }
            /*
             * En este bucle lo que hago es decirle que mientras que el intento sea falso,
             * es decir, que no haya introducido el valor correcto, se repita hasta que
             * introduzca el valor correcto
             */
        }

        return (new Estudiante(matricula, nombre, edad, promedio));
    }

    public static void mostrarEstudiante(Estudiante estudiante) {
        System.out.println(estudiante);
    }
}
