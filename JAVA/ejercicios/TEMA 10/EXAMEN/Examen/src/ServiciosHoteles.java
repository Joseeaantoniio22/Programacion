/**
 * @author Jose Antonio Fernandez Guerrero
 *         En esta clase lo que hago es el menú de interacción para el usuario,
 *         con sus diferente funciones realizadas en la otra clase
 */
public class ServiciosHoteles {
    public static void main(String[] args) {
        PruebasServicioHotel misServicios = new PruebasServicioHotel();

        int valor;
        do {
            System.out.println("Dime que servicio deseas realizar");
            System.out.println("1. Consultar tabla");
            System.out.println("2. Añadir nuevo servicio");
            System.out.println("3. Borrar una entrada completa de la tabla");
            System.out.println("4. Borrar un servicio");
            System.out.println("5. Salir");
            valor = Integer.parseInt(System.console().readLine());
            switch (valor) {
                case 1:
                    misServicios.listarHotel(null);
                    break;
                case 2:
                    PruebasServicioHotel.crearServicios();
                    break;
                case 3:
                    PruebasServicioHotel.borrarHotel();
                    break;
                case 4:
                    PruebasServicioHotel.borrarServicio();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println(
                            "Lo sentimos, no shas introducido bien el valor, pulse enter para volver a inentarlo");
                    System.console().readLine();
                    break;
            }
        } while (valor != 5);
    }
}
