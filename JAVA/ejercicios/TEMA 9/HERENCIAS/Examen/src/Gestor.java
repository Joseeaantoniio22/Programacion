/**
 * 
 * @author Jose Antonio Fernández Guerrero
 */
public class Gestor extends Empleado implements CalculosLaborales {
    private double presupuesto;

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
    Gestor(String nombre, int edad, String IdEmpleado, double salario, int anosDeTrabajo, double presupuesto) {
        super(nombre, edad, IdEmpleado, salario, anosDeTrabajo);
        this.presupuesto = presupuesto;
    }

    /**
     * En esta función lo que hago es calcular la bonificación dependiendo del
     * presupuesto que disponga el empleado
     * 
     */
    public double calcularBonificacion() {
        double bonifiacion = presupuesto * 0.05;
        System.out.println("Has obtenido una bonificación de " + bonifiacion);
        return bonifiacion;
    }

    /**
     * En esta función realizo un cálculo para saber el salario dependiendo de la
     * bonificación obtenida
     */
    public double calcularSalario() {
        double salario = super.getSalario() + this.calcularBonificacion();
        System.out.println(YELLOW_BRIGHT + "Tu salario total es de " + salario + RESET);
        return salario;
    }

    /**
     * En esta función realizo el cálculo de días que le pertenece al trabajador
     * dependiendo del tiempo que haya estado trabajando en la empresa
     * teniendo en cuenta que un año son 30 dias de vacaciones
     */
    public int calcularVacaciones() {
        int anos = super.getAnosDeTrabajo();
        int vacaciones = 30 * anos;
        System.out.println(GREEN_BRIGHT + "Te pertenecen " + vacaciones + " dias de vacaciones" + RESET);
        return vacaciones;
    }

    /**
     * En este toString muestro todo la información del gestor
     */
    public String toString() {
        return RED_BRIGHT + "Gestor: " + this.getNombre() + ", Edad: " + this.getEdad() + ", ID: "
                + this.getIdEmpleado()
                + ", Salario base: " + this.getSalario() + ", Años de trabajo: " + this.getAnosDeTrabajo()
                + ", Presupuesto: " + presupuesto + RESET;
    }
}
