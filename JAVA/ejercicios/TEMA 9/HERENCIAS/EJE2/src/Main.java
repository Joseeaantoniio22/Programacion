public class Main {
    public static void main(String[] args) {
        int valor;
        Bicicleta bicicleta = new Bicicleta();
        Coche coche = new Coche();
        do {
            System.out.println("VEHICULOS");
            System.out.println("---------");
            System.out.println(" ");
            System.out.println("Selecciona al acción que deseas realizar");
            System.out.println("1. Espacio recorrido con la bicilceta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Espacio recorrido con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            valor = Integer.parseInt(System.console().readLine());
            switch (valor) {
                case 1:
                    bicicleta.kmBicicleta();
                    System.out.println("Pulse enter para volver al menú");
                    System.console().readLine();
                    break;
                case 2:
                    System.out.println(bicicleta);
                    System.out.println("Pulse enter para volver al menú");
                    System.console().readLine();
                    break;
                case 3:
                    coche.setKmCoche();
                    System.out.println("Pulse enter para volver al menú");
                    System.console().readLine();
                    break;
                case 4:
                    coche.quemaRueda();
                    break;
                case 5:

                    break;
                case 6:
                    System.out.println(coche);
                    System.out.println("Pulse enter para volver al menú");
                    System.console().readLine();
                    break;
                case 7:
                System.out.println("Los kilómetros totales de todos los vehiculos son: "+Vehiculo.getKmTotales());
                    break;
                case 8:
                    break;
                default:
                System.out.println("Selecciones correctamente el valor porfavor (Pulse enter para volver al menú)");
                System.console().readLine();
                    break;
            }
        } while (valor != 8);
    }
}
