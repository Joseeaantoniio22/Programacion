import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Jose Antonio Fernández Guerrero
 * 
 *         En esta clase lo que he realizado han sido las funciones para que el
 *         usuario disponga del menú y realice lo que el quiera. Utilizando
 *         HashMap y ArrayList
 */
public class PruebasServicioHotel {
    public static final String RED_BRIGHT = "\033[0;91m"; // RED
    public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String RESET = "\033[0m"; // Text Reset

    private static HashMap<String, ArrayList<String>> miHashMap = new HashMap<>();

    /**
     * En esta función lo que realizo básicamente es la creación del hotel y los
     * servicios, si el hotel esta creado no pasaría nada ya que se sobrescribiría
     * los servicios, si no esta el hotel creado se crearía junto a un servicio
     */
    public static void crearServicios() {
        System.out.println("A que hotel deseas añadir el servicio");
        String hotel = System.console().readLine();
        System.out.println("Dime un servicio que quieras añadir");
        String servicio = System.console().readLine();
        minuscula(hotel);
        miHashMap.put(hotel, new ArrayList<String>());
        if (miHashMap.get(hotel).contains(servicio)) {
            System.out.println(RED_BRIGHT+"Este servicio ya esta disponible"+RESET);
            System.out.println("Pulse enter para salir");
            System.console().readLine();
        } else {
            miHashMap.get(hotel).add(servicio);
            System.out.println(GREEN_BRIGHT+"Añadido correctamente"+RESET);
            System.out.println("Pulse enter para salir");
            System.console().readLine();
        }

    }

    /**
     * En esta función lo que realizo es el listado del hotel junto a sus servicios
     */
    public void listarHotel(HashMap<String, ArrayList<String>> misServicios) {
        System.out.println("Dime que hotel quieres consultar");
        String hotel = System.console().readLine();
        minuscula(hotel);
        if (miHashMap.containsKey(hotel)) {
            System.out.println(YELLOW_BRIGHT+"Estos son los servicios del hotel " + hotel+"."+RESET);
            int i = 0;
            while (i < miHashMap.get(hotel).size()) {
                System.out.print(miHashMap.get(hotel).get(i));
                if (i != miHashMap.get(hotel).size() - 1) {
                    System.out.print(", ");
                } else {
                    System.out.println(".");
                    System.out.println(YELLOW_BRIGHT+"Pulse enter si has terminado de leer los servicios"+RESET);
                    System.console().readLine();
                }
                i++;
            }
        } else {
            System.out.println(RED_BRIGHT+"Lo sentimos, el hotel que quieres ver no está disponible"+RESET);
            System.console().readLine();
        }
    }

    /**
     * Aqui lo que realizo es la función de borrar el hotel junto los servicios que
     * tiene dicho hotel
     */
    public static void borrarHotel() {
        System.out.println("Dime el nombre del hotel que quieras borrar");
        String hotel = System.console().readLine();
        minuscula(hotel);
        if (miHashMap.containsKey(hotel)) {
            miHashMap.remove(hotel);
            System.out.println(GREEN_BRIGHT+"Hotel borrado exitosamente"+RESET);
            System.console().readLine();
        } else {
            System.out.println(RED_BRIGHT+"Este hotel no existe, intentelo de nuevo"+RESET);
            System.out.println(YELLOW_BRIGHT+"Pulse enter para salir"+RESET);
            System.console().readLine();
        }
    }

    /**
     * Aqui realizo realizo el borrado de un servicio de un hotel en concreto
     */
    public static void borrarServicio() {
        System.out.println("Dime el nombre del hotel al que le quieras borrar un servicio");
        String hotel = System.console().readLine();
        minuscula(hotel);
        if (miHashMap.containsKey(hotel)) {
            System.out.println("Dime el servicio que deseas eliminar del hotel indicado");
            String servicio = System.console().readLine();
            minuscula(servicio);
            if (miHashMap.get(hotel).contains(servicio)) {
                miHashMap.get(hotel).remove(servicio);
                System.out.println(GREEN_BRIGHT+"Servicio borrado correctamente"+RESET);
                System.console().readLine();
            } else {
                System.out.println(RED_BRIGHT+"El servicio no esta disponible"+RESET);
                System.console().readLine();
            }
        }
    }

    public static void minuscula(String palabra) {
        palabra.equals(palabra.toLowerCase());
    }

}
