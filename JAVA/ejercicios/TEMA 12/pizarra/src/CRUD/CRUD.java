package CRUD;
import java.sql.SQLException;
import java.util.ArrayList;
import Socio.Socio;

public interface CRUD<T> {
    public ArrayList<Socio> query(String columna, String valor) throws SQLException ;
    public ArrayList<T> query(String columna, int valor) throws SQLException ;
    public ArrayList<T> requestAll(String orderBy) throws SQLException ;
    public T requestById(int id)  throws SQLException ;
    public boolean create(Socio socio)  throws SQLException;
    public boolean update(Socio socio)  throws SQLException;
    public boolean delete(Socio socio)  throws SQLException;
}
