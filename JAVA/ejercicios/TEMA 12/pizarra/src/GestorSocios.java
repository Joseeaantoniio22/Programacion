import java.sql.Connection;
import java.util.ArrayList;

public class GestorSocios implements CRUD{
    private Connection conexion;

    public GestorSocios(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public boolean create(Object model) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean delete(Object model) {
        // TODO Auto-generated method stub
        return false;
    }

    //Consultas
    @Override
    public ArrayList query(String columna, String valor) {
        // TODO Auto-generated method stub
        return null;
    }

    //Consultas
    @Override
    public ArrayList query(String columna, int valor) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArrayList requestAll(String orderBy) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object requestById(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean update(Object model) {
        // TODO Auto-generated method stub
        return false;
    }

    
}
