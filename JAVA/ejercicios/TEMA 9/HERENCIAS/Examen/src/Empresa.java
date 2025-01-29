/**
 * 
 * @author Jose Antonio Fernandez Guerrero
 */
public class Empresa {
    public static void main(String[] args) throws Exception {
        /**
         * Este código lo que me encargo de realizar es declarar el array, crear
         * a los empleados y mostrar por pantalla su información
         */
        Empleado misEmpleado[] = new Empleado[3];
        misEmpleado[0] = new Tecnico("Rafael", 55, "T001", 2100, 5, "Redes");
        misEmpleado[1] = new Gestor("Margarita", 41, "G001", 3000, 8, 65000);
        misEmpleado[2] = new Administrativo("Daniel", 38, "A001", 1500, 2, "Recursos humanos");
        System.out.println(misEmpleado[0]);
        ((CalculosLaborales) misEmpleado[0]).calcularSalario();
        ((CalculosLaborales) misEmpleado[0]).calcularVacaciones();
        System.out.println("");
        System.out.println(misEmpleado[1]);
        ((CalculosLaborales) misEmpleado[1]).calcularSalario();
        ((CalculosLaborales) misEmpleado[1]).calcularVacaciones();
        System.out.println("");
        System.out.println(misEmpleado[2]);
        ((CalculosLaborales) misEmpleado[2]).calcularSalario();
        ((CalculosLaborales) misEmpleado[2]).calcularVacaciones();
        System.out.println("");
        System.out.println("El numero total de empleados es de: " + Empleado.getTotalEmpleados());
    }
}
