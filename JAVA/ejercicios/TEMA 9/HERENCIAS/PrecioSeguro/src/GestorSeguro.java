public class GestorSeguro {
    public static void main(String[] args) throws Exception {
        int valor;
        Vehiculo misVehiculo[] = new Vehiculo[5];
        Funciones misFunciones = new Funciones();
        misVehiculo[0] = new Coche(5, 2009, 5786);
        misVehiculo[1] = new Camion(132547.79, 2015, 2500);

        do {
            System.out.println("Seleccione la opción que quieras realizar");
            System.out.println("-----------------------------------------");
            System.out.println("1. Añadir coche");
            System.out.println("2. Añadir camión");
            System.out.println("3. Listar información de todos los vehículos");
            System.out.println("4. Salir");
            valor = Integer.parseInt(System.console().readLine());
            switch (valor) {
                case 1:
                    misFunciones.añadirCoche(misVehiculo);
                    break;
                case 2:

                    break;
                case 3:
                    misFunciones.listarVehiculo(misVehiculo);
                    break;
                case 4:
                    break;

                default:
                    System.out.println("Escriba el valor correcto, por favor. Pulse enter para volver a intentarlo");
                    System.console().readLine();
                    break;
            }
        } while (valor != 4);
    }
}
