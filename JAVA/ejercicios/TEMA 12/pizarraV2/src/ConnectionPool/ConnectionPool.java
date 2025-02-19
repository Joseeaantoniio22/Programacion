package ConnectionPool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ConnectionPool {
    private ArrayList<Connection> connections = new ArrayList<Connection>();
    private String url;
    private String usuario;
    private String contraseña;

    Connection connection = null;
    Statement sentencia = null;
    ResultSet resultado = null;

    public ConnectionPool(String url, String usuario, String contraseña) {
        this.url = url;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, usuario, contraseña);
            if (conn!=null) {
                this.connections.add(conn);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void closeAll(){
        for (Connection conn : this.connections) {
            try {
                if (conn!=null) {
                    conn.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    

    
}
