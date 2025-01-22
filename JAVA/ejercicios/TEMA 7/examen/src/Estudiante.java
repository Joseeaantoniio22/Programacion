public class Estudiante {
    /**
     * @Author Jose Antonio Fernandez Guerrero
     *         Aqui declaramos las variables que vamos a utilizar. Tambien
     *         realizamos funciones para calcular el promedio y agregar las notas
     *         sin pasarnos de la capacidad
     */
    private String nombre;
    private double notas[];
    private int cantidadNotas;

    Estudiante(String nombre) {
        this.nombre = nombre;
        cantidadNotas = 0;
        notas = new double[10];
    }
    /**
     * Le pedimos que nos de el nombre del alumno
     * @return el nombre del alumno
     */
    public String getNombre() {
        return nombre;
    }

    public void agregarNota(double agregarNota) {
        if (cantidadNotas + 1 > 10) {
            System.out.println("El límite de notas ha llegado al máximo");
        } else {
            notas[cantidadNotas] = agregarNota;
            cantidadNotas++;
        }
    }

    public double calcularPromedio(int cantidadNotas, double notas[]) {
        int sumatorio = 0;
        if (cantidadNotas == 0) {
            return 0.0;
        } else {
            for (int i = 0; i < cantidadNotas; i++) {
                sumatorio += notas[i];
            }
            return sumatorio / cantidadNotas;
        }
    }

    public String toString() {
        double notasProvisionales;
        int i = 0;
        while (i < cantidadNotas) {
            notasProvisionales = 0;
            notasProvisionales = notas[i];
            i++;
        }
        return "Estudiante[nombre= " + nombre + " ; notas= " + notas[i] + " ; promedio= "
                + calcularPromedio(cantidadNotas, notas) + "]";
    }
}
