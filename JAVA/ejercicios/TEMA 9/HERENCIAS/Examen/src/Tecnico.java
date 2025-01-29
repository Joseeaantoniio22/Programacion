/**
 * 
 * @author Jose Antonio Fernández Guerrero
 */
public class Tecnico extends Empleado implements CalculosLaborales {
    private String especialdad;

    /**
     * Arriba declaramos la única variable que va a ser única en esta clase,
     * las demas variables las heredamos de la clase padre.
     * 
     * Y abajo realizamos el constructor poniendo super para recibir las
     * variables de la clase padre
     * 
     * @param nombre
     * @param edad
     * @param IdEmpleado
     * @param salario
     * @param anosDeTrabajo
     * @param especialidad
     */
    Tecnico(String nombre, int edad, String IdEmpleado, double salario, int anosDeTrabajo, String especialidad) {
        super(nombre, edad, IdEmpleado, salario, anosDeTrabajo);
        this.especialdad = especialidad;
    }

    /**
     * En esta función lo que hago es calcular la bonificación dependiendo de la
     * especialidad
     */
    public double calcularBonificacion() {
        double bonifiacion = 0;
        if (especialdad.equalsIgnoreCase("Redes")) {
            bonifiacion = 1000;
            System.out.println("La bonificacion que has obtenido es de " + bonifiacion);
            return bonifiacion;
        } else if (especialdad.equalsIgnoreCase("Seguridad")) {
            bonifiacion = 1200;
            System.out.println("La bonificacion que has obtenido es de " + bonifiacion);
            return bonifiacion;
        } else {
            bonifiacion = 800;
            System.out.println("La bonificacion que has obtenido es de " + bonifiacion);
            return bonifiacion;
        }
    }

    /**
     * En esta función realizo un cálculo para saber el salario dependiendo de la
     * bonificación obtenida
     */
    public double calcularSalario() {
        double salario = super.getSalario() + this.calcularBonificacion();
        System.out.println(YELLOW_BRIGHT + "Tu salario es de " + salario + RESET);
        return salario;
    }

    /**
     * En esta función realizo el cálculo de días que le pertenece al trabajador
     * dependiendo del tiempo que haya estado trabajando en la empresa
     * teniendo en cuenta que un año son 20 dias de vavaciones
     */
    public int calcularVacaciones() {
        int anos = super.getAnosDeTrabajo();
        int vacaciones = 20 * anos;
        System.out.println(GREEN_BRIGHT + "Te pertenecen " + vacaciones + " dias de vacaciones" + RESET);
        return vacaciones;
    }

    /**
     * En este toString muestro todo la información del técnico
     */
    public String toString() {
        return RED_BRIGHT + "Técnico: " + this.getNombre() + ", Edad: " + this.getEdad() + ", ID: "
                + this.getIdEmpleado()
                + ", Salario base: " + this.getSalario() + ", Años de trabajo: " + this.getAnosDeTrabajo()
                + ", Especialidad: " + especialdad + RESET;
    }
}
