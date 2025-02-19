import java.sql.Connection;
import java.sql.SQLException;

import ConncetioPool.ConnectionPool;
import Socio.GestorSocios;
import Socio.Socio;

public class DreamTeam {
    private static String URL = "jdbc:mariadb://localhost:3306/baloncesto";
    private static String USUARIO = "root";
    private static String CONTRASEÑA = "";
    private static ConnectionPool miConnection = new ConnectionPool(URL, USUARIO, CONTRASEÑA);
    private static GestorSocios miGestor = new GestorSocios(miConnection.getConnections());
    public static void main(String[] args) throws SQLException {


    }

    public static int leerOpcion(){
        return 0;
    }

    public static void añadirSocio(){
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
        try {
            if (miGestor.create(new Socio(edad, id, nombre, localidad, estatura))) System.out.println("Socio creado");
            else{
                System.out.println("Ha ocurrido algún error en la creacion del socio");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void bajaSocio(){
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
        try {
            if (miGestor.delete(new Socio(edad, id, nombre, localidad, estatura))) System.out.println("Socio eliminado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void modificarSocio(){
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
        try {
            if (miGestor.update(new Socio(edad, id, nombre, localidad, estatura))) System.out.println("Socio modificado correctamente.");         
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void listarSocios(){
        
    }

    public static void buscarSocio(){

    }
}
