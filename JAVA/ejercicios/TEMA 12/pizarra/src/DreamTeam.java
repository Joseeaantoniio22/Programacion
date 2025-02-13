import ConncetioPool.ConnectionPool;

public class DreamTeam {
    private static String URL = "jdbc:mariadb://3306/baloncesto";
    private static String USUARIO = "root";
    private static String CONTRASEÑA = "";
    public static void main(String[] args) {
        ConnectionPool miConnection = new ConnectionPool(URL, USUARIO, CONTRASEÑA);

    }

    public static int leerOpcion(){
        return null;
    }

    public static void añadirSocio(){

    }

    public static void bajaSocio(){

    }

    public static void modificarSocio(){

    }

    public static void listarSocios(){

    }

    public static void buscarSocio(){

    }
}
