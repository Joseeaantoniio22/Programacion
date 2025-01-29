/**
 * 
 * @author Jose Antonio Fernández Guerrero
 */
public abstract class Empleado {
    public static final String RED_BRIGHT = "\033[0;91m"; // RED
    public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String RESET = "\033[0m"; // Text Reset

    /**
     * En este código vamos a realizar una clase en la cual vamos a declarar
     * todas las variables y al mismo tiempo vamos a poner una variable
     * estática para saber los empleados totales de la empresa
     */
    private String nombre;
    private int edad;
    private String IdEmpleado;
    private double salario;
    private int anosDeTrabajo;
    private static int totalEmpleados = 0;

    /**
     * Aqui abajo realizo el constructor cons todas las variables anteriormente
     * declaradas
     * 
     * @param nombre
     * @param edad
     * @param IdEmpleado
     * @param salario
     * @param anosDeTrabajo
     */

    Empleado(String nombre, int edad, String IdEmpleado, double salario, int anosDeTrabajo) {
        this.nombre = nombre;
        this.edad = edad;
        this.IdEmpleado = IdEmpleado;
        this.salario = salario;
        this.anosDeTrabajo = anosDeTrabajo;
        totalEmpleados++;
    }

    /**
     * Realizo esta función para saber cuantos empleados hay en total
     * 
     * @return los empleados totales
     */

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

    /**
     * Realizo esta función para saber el nombre de la persona
     * 
     * @return el nombre de la persona
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * En esta funcion, lo que realizo es la entrada de un nuevo nombre para la
     * persona, así cambiado el nombre antiguo.
     * 
     * @param nuevoNombre
     */
    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    /**
     * Esta función me dice la edad del empleado
     * 
     * @return edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Introduzco la nueva edad del empleado
     * 
     * @param nuevaEdad
     */
    public void setEdad(int nuevaEdad) {
        edad = nuevaEdad;
    }

    /**
     * Me dice el Id del empleado
     * 
     * @return IdEmpleado
     */
    public String getIdEmpleado() {
        return IdEmpleado;
    }

    /**
     * Le doy la nueva Id del empleado
     * 
     * @param nuevoId
     */
    public void setIdEmpleado(String nuevoId) {
        IdEmpleado = nuevoId;
    }

    /**
     * Obetenemos el salario del empleado
     * 
     * @return salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Le asiganmos el nuevo salario al empleado
     * 
     * @param nuevoSalario
     */
    public void setSalario(double nuevoSalario) {
        salario = nuevoSalario;
    }

    /**
     * Obetenemos los años que lleva el empleado trabajando en la empresa
     * 
     * @return anosDeTrabajo
     */
    public int getAnosDeTrabajo() {
        return anosDeTrabajo;
    }

    /**
     * Le indicamos el tiempo que lleva trabajando
     * 
     * @param nuevoAnos
     */
    public void setAnosDeTRabajo(int nuevoAnos) {
        anosDeTrabajo = nuevoAnos;
    }

    /**
     * Realizo un toString para mostrar toda la información del empleado
     */
    public String toString() {
        return "Empleado: " + nombre + ", Edad: " + edad + ", ID: " + IdEmpleado + ", Salario base: " + salario
                + ", Años de trabajo: " + anosDeTrabajo + ".";
    }
}
