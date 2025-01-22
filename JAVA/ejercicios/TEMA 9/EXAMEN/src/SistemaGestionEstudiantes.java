public class SistemaGestionEstudiantes {
    /*
     * @Author Jose Antonio Fernandez Guerrero
     */
    public static void main(String[] args) throws Exception {
        Estudiante estudiante1 = GestionEstudiante.registrarEstudiante();
        Estudiante estudiante2 = GestionEstudiante.registrarEstudiante();
        /*
         * En las dos líneas de código de arriba lo que hago es crear el objeto
         * estuadiante, llamando a su vez a la funcion resgistrarEstudiante
         */
        GestionEstudiante.mostrarEstudiante(estudiante1);
        /*
         * Aqui muestro la informacion de los dos estudiantes
         */
        GestionEstudiante.mostrarEstudiante(estudiante2);
        estudiante1.comparacion(estudiante2);
        /*
         * Y aqui llamo a la funcion que he realizado anteriormente para poder comparar
         * la calificacion de los estudiantes
         */
    }
}
