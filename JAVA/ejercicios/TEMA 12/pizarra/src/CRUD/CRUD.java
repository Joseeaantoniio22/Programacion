package CRUD;
import java.util.ArrayList;

public interface CRUD<T> {
    public ArrayList<T> query(String columna, String valor);
    public ArrayList<T> query(String columna, int valor);
    public ArrayList<T> requestAll(String orderBy);
    public T requestById(int id);
    public boolean create( T model);
    public boolean update(T model);
    public boolean delete(T model);
}
