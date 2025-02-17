import java.sql.Connection;
import java.sql.SQLException;

import ConncetioPool.ConnectionPool;
import Socio.GestorSocios;
import Socio.Socio;

public class DreamTeam {
    private static String URL = "jdbc:mariadb://localhost:3306/baloncesto";
    private static String USUARIO = "root";
    private static String CONTRASEÑA = "";
    public static void main(String[] args) throws SQLException {
        ConnectionPool miConnection = new ConnectionPool(URL, USUARIO, CONTRASEÑA);
        GestorSocios miGestor = new GestorSocios(miConnection.getConnections());
        miGestor.create(añadirSocio());
        miGestor.delete(bajaSocio());
    }

    public static int leerOpcion(){
        return 0;
    }

    public static Socio añadirSocio(){
        System.out.println("Dime el nombre del socio que quieres añadir");
        String nombre = System.console().readLine();
        System.out.println("Dime la edad correspondiente a esa persona");
        int edad = Integer.parseInt(System.console().readLine());
        System.out.println("Dime la estatura de la persona");
        int estatura = Integer.parseInt(System.console().readLine());
        System.out.println("Dime la localidad de la persona");
        String localidad = System.console().readLine();
        System.out.println("Y por último dime el identificador de la persona");
        int id = Integer.parseInt(System.console().readLine());
        Socio miSocio = new Socio(edad, id, nombre, localidad, estatura);
        return miSocio;
    }

    public static Socio bajaSocio(){
        System.out.println("Dime el nombre del socio que quieres añadir");
        String nombre = System.console().readLine();
        System.out.println("Dime la edad correspondiente a esa persona");
        int edad = Integer.parseInt(System.console().readLine());
        System.out.println("Dime la estatura de la persona");
        int estatura = Integer.parseInt(System.console().readLine());
        System.out.println("Dime la localidad de la persona");
        String localidad = System.console().readLine();
        System.out.println("Y por último dime el identificador de la persona");
        int id = Integer.parseInt(System.console().readLine());
        Socio miSocio = new Socio(edad, id, nombre, localidad, estatura);
        return miSocio;
    }

    public static void modificarSocio(){

    }

    public static void listarSocios(){

    }

    public static void buscarSocio(){

    }
}
