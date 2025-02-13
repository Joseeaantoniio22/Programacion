import java.util.ArrayList;

public class Connection {
    private ArrayList<Connection> connections;
    private String url;
    private String usuario;
    private String contraseña;
    
    public Connection(String url, String usuario, String contraseña) {
        this.url = url;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public ArrayList<Connection> getConnections() {
        return connections;
    }

    public void closeAll(){

    }
    
}
