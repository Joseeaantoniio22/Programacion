/**
 * 
 * @author Jose Antonio Fernández Guerrero
 */
public class Administrativo extends Empleado implements CalculosLaborales {
    private String area;

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

    Administrativo(String nombre, int edad, String IdEmpleado, double salario, int anosDeTrabajo, String area) {
        super(nombre, edad, IdEmpleado, salario, anosDeTrabajo);
        this.area = area;
    }

    /**
     * En esta función lo que hago es calcular la bonificación dependiendo del
     * área del que corresponda al empleado
     * 
     */
    public double calcularBonificacion() {
        double bonificacion;
        int costeTarea;
        if (area.equalsIgnoreCase("Recursos humanos")) {
            costeTarea = 20;
            bonificacion = costeTarea * 30;
            System.out.println("La bonificación que has obtenido es de " + bonificacion);
            return bonificacion;
        } else {
            costeTarea = 10;
            bonificacion = costeTarea * 30;
            System.out.println("La bonificación que has obtenido es de " + bonificacion);
            return bonificacion;
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
     * teniendo en cuenta que un año son 15 dias de vacaciones
     */
    public int calcularVacaciones() {
        int anos = super.getAnosDeTrabajo();
        int vacaciones = 15 * anos;
        System.out.println(GREEN_BRIGHT + "Te pertenecen " + vacaciones + " dias de vacaciones" + RESET);
        return vacaciones;
    }

    /**
     * En este toString muestro todo la información del administrativo
     */
    public String toString() {
        return RED_BRIGHT + "Administrativo: " + this.getNombre() + ", Edad: " + this.getEdad() + ", ID: "
                + this.getIdEmpleado()
                + ", Salario base: " + this.getSalario() + ", Años de trabajo: " + this.getAnosDeTrabajo()
                + ", Área: " + area + RESET;
    }
}
