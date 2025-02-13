package ConncetioPool;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ConnectionPool {
    private ArrayList<ConnectionPool> connections;
    private String url;
    private String usuario;
    private String contraseña;
    
    Connection conexion = null;
    Statement sentecia = null;
    ResultSet resultado = null;

    public ConnectionPool(String url, String usuario, String contraseña) {
        this.url = url;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public ArrayList<ConnectionPool> getConnections() {
        return connections;
    }

    public void closeAll(){
        for (int i = 0; i < connections.size(); i++) {
            while (connections!=null) {
                try {
                    conexion.close();
                    sentecia.close();
                    resultado.close();
                } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    
}
