import ConnectionPool.ConnectionPool;
import Socio.GestorSocio;
import Socio.Socio;

public class DreamTeam {
    private static String URL = "jdbc:mariadb://localhost:3306/baloncesto";
    private static String USUARIO = "root";
    private static String CONTRASEÑA = "";
    private static ConnectionPool miConnec = new ConnectionPool(URL, USUARIO, CONTRASEÑA);
    private static GestorSocio miGestorSocio = new GestorSocio(miConnec.getConnection());

    public static void main(String[] args) throws Exception {
        int opcion;
        do {
            System.out.println("Bienvenido, a continuación le daré las opciones");
            System.out.println("1. Crear socio");
            System.out.println("2. Eliminar socio");
            System.out.println("3. Modificar socio");
            System.out.println("4. Listar socios");
            System.out.println("5. Buscar socio concreto");
            System.out.println("6. Salir");
            opcion = leerOpcion();

            switch (opcion) {
                case 1:
                    añadirSocio();
                    break;
                case 2:
                    bajaSocio();
                    break;
                case 3:
                    modificarSocio();
                    break;
                case 4:
                    listarSocios();
                    break;
                case 5:
                    buscarSocio();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    break;
            }
        } while (opcion != 6);
    }

    public static int leerOpcion() {
        int opcion = 0;
        try {
            System.out.println("Que deseas realizar en el menú");
            opcion = Integer.parseInt(System.console().readLine());
            if (opcion < 1 || opcion > 6) {
                System.out.println("Seleccione bien el valor correspondiente");
                return 0;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return opcion;
    }

    public static void añadirSocio() {
        System.out.println("Dime el nombre de la persona que quieres añadir");
        String nombre = System.console().readLine();
        System.out.println("Dime la edad de la persona");
        int edad = Integer.parseInt(System.console().readLine());
        System.out.println("Dime la estatura de la persona");
        int estatura = Integer.parseInt(System.console().readLine());
        System.out.println("Dime la localidad de la persona");
        String localidad = System.console().readLine();
        System.out.println("Dime el identificador de la persona");
        int socioID = Integer.parseInt(System.console().readLine());
        try {
            miGestorSocio.create(new Socio(nombre, localidad, edad, estatura, socioID));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void bajaSocio() {
        System.out.println("Dime el nombre de la persona que quieres añadir");
        String nombre = System.console().readLine();
        System.out.println("Dime la edad de la persona");
        int edad = Integer.parseInt(System.console().readLine());
        System.out.println("Dime la estatura de la persona");
        int estatura = Integer.parseInt(System.console().readLine());
        System.out.println("Dime la localidad de la persona");
        String localidad = System.console().readLine();
        System.out.println("Dime el identificador de la persona");
        int socioID = Integer.parseInt(System.console().readLine());
        try {
            miGestorSocio.delete(new Socio(nombre, localidad, edad, estatura, socioID));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void modificarSocio() {
        System.out.println("Dime el nombre de la persona que deseas modificar");
        String nombre = System.console().readLine();
        System.out.println("Dime la edad de la persona");
        int edad = Integer.parseInt(System.console().readLine());
        System.out.println("Dime la estatura de la persona");
        int estatura = Integer.parseInt(System.console().readLine());
        System.out.println("Dime la localidad de la persona");
        String localidad = System.console().readLine();
        System.out.println("Dime el identificador de la persona");
        int socioID = Integer.parseInt(System.console().readLine());
        try {
            miGestorSocio.update(new Socio(nombre, localidad, edad, estatura, socioID));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void listarSocios() {
        System.out.println("Escribe la opción quieres listar");
        System.out.println("1. Todos");
        System.out.println("2. Con filtro");
        String valor = System.console().readLine().toLowerCase();

        switch (valor) {
            case "todos":
                System.out.println("Dime el nombre de la columna que quieres ver");
                String columna = System.console().readLine().toLowerCase();
                System.out.println("Dime si lo quieres ascendente o descendente");
                String filtro = System.console().readLine().toLowerCase();
                if (filtro.equals("ascendente")) {
                    String orderBy = "ASC";
                    try {
                        System.out.println(miGestorSocio.requestAll(orderBy, columna));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } else {
                    String orderBy = "DESC";
                    try {
                        System.out.println(miGestorSocio.requestAll(orderBy, columna));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                break;
            case "con filtro":
                System.out.println("Dime el nombre de la columna por la que quieres filtrar");
                columna = System.console().readLine().toLowerCase();
                switch (columna) {
                    case "nombre":
                        System.out.println("Dime el nombre por el que quieres buscar");
                        String valorColumna = System.console().readLine();
                        try {
                            System.out.println(miGestorSocio.query(columna, valorColumna));
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "localidad":
                        System.out.println("Dime la localidad por la que quieres buscar");
                        valorColumna = System.console().readLine();
                        try {
                            System.out.println(miGestorSocio.query(columna, valorColumna));
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "estatura":
                        System.out.println("Dime por la estatura que quieras buscar");
                        int valorentero = Integer.parseInt(System.console().readLine());
                        try {
                            System.out.println(miGestorSocio.query(columna, valorentero));
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "edad":
                        System.out.println("Dime por la edad que quieras buscar");
                        valorentero = Integer.parseInt(System.console().readLine());
                        try {
                            System.out.println(miGestorSocio.query(columna, valorentero));
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "socioid":
                        System.out.println("Dime por el identificador que quieras buscar");
                        valorentero = Integer.parseInt(System.console().readLine());
                        try {
                            System.out.println(miGestorSocio.query(columna, valorentero));
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    default:
                        break;
                }
                break;

            default:
                break;
        }
    }

    public static void buscarSocio() {
        System.out.println("Dime el numero de identificador de la persona que queires buscar");
        int id = Integer.parseInt(System.console().readLine());
        try {
            System.out.println(miGestorSocio.requestById(id));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
