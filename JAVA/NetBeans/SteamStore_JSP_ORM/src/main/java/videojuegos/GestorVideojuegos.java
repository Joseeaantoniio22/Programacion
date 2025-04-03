package videojuegos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import crud.CRUD;

public class GestorVideojuegos implements CRUD<Videojuego>{
    Connection conn;
    public GestorVideojuegos(Connection conn){
        this.conn = conn;
    }
    
    @Override
    public ArrayList<Videojuego> requestAll(String sortedBy) throws SQLException {        
        ArrayList<Videojuego> result = new ArrayList<>();
        String sqlQuery = "SELECT * FROM videojuego";
        if (!sortedBy.isEmpty()) sqlQuery += " ORDER BY " + sortedBy;

        try (Statement stmt = this.conn.createStatement()) {
            // Ejecución de la consulta
            ResultSet querySet = stmt.executeQuery(sqlQuery);
            // Recorrido del resultado de la consulta
            while (querySet.next()) {
                int identificador = querySet.getInt("identificador");
                String nombre = querySet.getString("nombre");
                String fecha = querySet.getString("fecha");
                float precio = querySet.getFloat("precio");
                String descripcion = querySet.getString("descripcion");
                String imagen = querySet.getString("imagen");
                result.add(new Videojuego(identificador, nombre, fecha, precio, descripcion, imagen));
            }  
            return result;
        } catch (SQLException e) {
            throw e;
        }
    }   

    @Override
    public Videojuego requestById(int id) throws SQLException {          
        Videojuego result = null;      
        String sqlQuery = "SELECT * FROM videojuego WHERE identificador = ?";
        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setInt(1, id);

            // Ejecución de la consulta
            ResultSet querySet = stmt.executeQuery();
            // Recorrido del resultado de la consulta
            if (querySet.next()) {
                int identificador = querySet.getInt("identificador");
                String nombre = querySet.getString("nombre");
                String fecha = querySet.getString("fecha");
                float precio = querySet.getFloat("precio");
                String descripcion = querySet.getString("descripcion");
                String imagen = querySet.getString("imagen");
                result = new Videojuego(identificador, nombre, fecha, precio, descripcion, imagen);
            }  
            return result;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public boolean create(Videojuego vj) throws SQLException {
        String sqlQuery = "INSERT INTO videojuego (identificador, nombre, fecha, precio, descripcion, imagen) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setInt(1, vj.getIdentificador());
            stmt.setString(2, vj.getNombre());
            stmt.setString(3, vj.getFecha());
            stmt.setFloat(4, vj.getPrecio());
            stmt.setString(5, vj.getDescripción());
            stmt.setString(6, vj.getImagen());

            // Ejecución de la consulta
            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) throw new SQLException("Falló la creación del nuevo videojuego.");
            return affectedRows == 1;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public boolean update(Videojuego vj) throws SQLException {
        String sqlQuery = "UPDATE videojuego SET nombre = ?, fecha = ?, precio = ?, descripcion = ?, imagen = ? WHERE identificador = ?";
        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setString(1, vj.getNombre());
            stmt.setString(2, vj.getFecha());
            stmt.setFloat(3, vj.getPrecio());
            stmt.setString(4, vj.getDescripción());
            stmt.setString(5, vj.getImagen());
            stmt.setInt(6, vj.getIdentificador());

            // Ejecución de la consulta
            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) throw new SQLException("Falló la actualización de los datos del videojuego.");
            return affectedRows == 1;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public boolean delete(int id) throws SQLException {
        String sqlQuery = "DELETE FROM videojuego WHERE identificador = ?";
        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setInt(1, id);

            // Ejecución de la consulta
            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) throw new SQLException("Falló el borrado de los datos del videojuego.");
            return affectedRows == 1;
        } catch (SQLException e) {
            throw e;
        }
    }
    
    @Override
    public ArrayList<Videojuego> requestFavouriteGames(int userId) throws SQLException {      
        ArrayList<Videojuego> result = new ArrayList<>();
        String sqlQuery = "SELECT * FROM videojuego JOIN favorito ON identificador=id_videojuego WHERE id_usuario = ?";  
        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setInt(1, userId);
            // Ejecución de la consulta
            ResultSet querySet = stmt.executeQuery();
            // Recorrido del resultado de la consulta
            while (querySet.next()) {
                int identificador = querySet.getInt("identificador");
                String nombre = querySet.getString("nombre");
                String fecha = querySet.getString("fecha");
                float precio = querySet.getFloat("precio");
                String descripcion = querySet.getString("descripcion");
                String imagen = querySet.getString("imagen");
                result.add(new Videojuego(identificador, nombre, fecha, precio, descripcion, imagen));
            }  
            return result;
        } catch (SQLException e) {
            throw e;
        }        
    }
    
    @Override
    public boolean addFavouriteGame(int userId, int gameId) throws SQLException {
        String sqlQuery = "INSERT INTO favorito (id_usuario, id_videojuego) VALUES (?, ?)";
        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setInt(1, userId);
            stmt.setInt(2, gameId);

            // Ejecución de la consulta
            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) throw new SQLException("Falló la inserción del videojuego en favoritos.");
            return affectedRows == 1;
        } catch (SQLException e) {
            throw e;
        }
    }
    
    @Override
    public boolean removeFavouriteGame(int userId, int gameId) throws SQLException {
        String sqlQuery = "DELETE FROM favorito WHERE (id_usuario = ? AND id_videojuego = ?)";
        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setInt(1, userId);
            stmt.setInt(2, gameId);

            // Ejecución de la consulta
            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) throw new SQLException("Falló el borrado del videojuego en favoritos.");
            return affectedRows == 1;
        } catch (SQLException e) {
            throw e;
        }
    }

}