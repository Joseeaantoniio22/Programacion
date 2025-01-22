public class GestorEstudiante {
    /**
     * @Author Jose Antonio Fernández Guerrero
     *         En esta clase básicamente lo que realizamos es la creación de los
     *         objetos estudiantes, realizando la función de agregar la nota al
     *         estudiante, y mostrar en una lista los estudiantes
     */
    private Estudiante estudiantes[];
    private int cantidadEstudiantes;
    /**
     * Realizamos el contructor con las indicaciones de la rúbrica
     */
    GestorEstudiante() {
        estudiantes = new Estudiante[20];
        cantidadEstudiantes = 0;
    }
    /**
     *En esta funcion creamos el objeto  estudiantes 
     * @param nombre
     */
    public void agregarEstudiante(String nombre) {
        minuscula(nombre);
        if (cantidadEstudiantes > 20) {
            System.out.println("Ya no hay capacidad para más estudiantes");
            System.out.println("Pulse enter para volver al menú");
            System.console().readLine();
        } else if (nombre.equals(buscarEstudiante(nombre))) {
            System.out.println("Este estudiante ya existe");
            System.out.println("Pulse enter para volver al menú");
            System.console().readLine();
        } else {
            estudiantes[cantidadEstudiantes] = new Estudiante(nombre);
            cantidadEstudiantes++;
            System.out.println("Bienvenido, " + nombre + ", ya eres un estudiante más.");
            System.out.println("Pulse enter para volver al menú");
            System.console().readLine();
        }
    }

    public Estudiante buscarEstudiante(String nombre) {
        minuscula(nombre);
        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (nombre.equals(estudiantes[i].getNombre())) {
                return estudiantes[i];
            }
        }
        return null;
    }

    public void agregarNotaEstudiante(String nombre, double nota) {
        if (buscarEstudiante(nombre) != null) {
            buscarEstudiante(nombre).agregarNota(nota);
            System.out.println("El estudiante " + nombre + " ha obtenido su nota satisfactoriamente.");
            System.out.println("Pulse enter para volver al menú");
            System.console().readLine();
        } else {
            System.out.println("Este estudiante no existe");
            System.out.println("Pulse enter para volver al menú");
            System.console().readLine();
        }
    }

    public void mostrarEstudiantes() {
        for (int i = 0; i < estudiantes.length && estudiantes[i] != null; i++) {
            System.out.println("El estudiante numero " + (i + 1) + ", se llama " + estudiantes[i].getNombre());
        }
        System.out.println("Pulse enter para volver al menú");
        System.console().readLine();
    }

    public void minuscula(String nombre) {
        nombre.equals(nombre.toLowerCase());
    }

}
