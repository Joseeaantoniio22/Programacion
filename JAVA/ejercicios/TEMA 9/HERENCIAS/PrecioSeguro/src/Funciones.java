public class Funciones {
    public int ultimaPosicion(Vehiculo misVehiculo[]) {
        int i=0;
        while (i<misVehiculo.length) {
            if (misVehiculo[i]!=null) {
                i++;            
            }
        }
        return i;
    }

    public void añadirCoche(Vehiculo misVehiculo[]) {
        System.out.println("Dime el numero de puertas que tiene el coche");
        int numPuertas = Integer.parseInt(System.console().readLine());
        System.out.println("Dime el año en el quese fabricó el coche");
        int año = Integer.parseInt(System.console().readLine());
        System.out.println("Dime el precio de mercado actual del coche");
        double precioMercado = Double.parseDouble(System.console().readLine());
        misVehiculo[ultimaPosicion(misVehiculo)]= new Coche(numPuertas, año, precioMercado);
    }

    public void listarVehiculo(Vehiculo misVehiculo[]) {
        for (int i = 0; i < misVehiculo.length && misVehiculo[i] != null; i++) {
            System.out.println(((Asegurable) misVehiculo[i]).mostrarDetalles());
        }
    }
}
