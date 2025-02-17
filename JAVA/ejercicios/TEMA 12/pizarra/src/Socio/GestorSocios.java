package Socio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import CRUD.CRUD;

public class GestorSocios implements CRUD {
    private Connection conexion;

    public GestorSocios(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public boolean create(Socio socio) throws SQLException {
        int socioID = socio.getId();
        int estatura = socio.getEstatura();
        String nombre = socio.getNombre();
        int edad = socio.getEdad();
        String localidad = socio.getLocalidad();

        String sqlQuery = "INSERT INTO socio (nombre, estatura, edad, localidad, socioID) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement stmt = this.conexion.prepareStatement(sqlQuery);
            stmt.setString(1, nombre);
            stmt.setInt(2, estatura);
            stmt.setInt(3, edad);
            stmt.setString(4, localidad);
            stmt.setInt(5, socioID);
            int effect = stmt.executeUpdate();
            if (effect == 0) {
                throw new SQLException();
            }
            return true;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public boolean delete(Socio socio) throws SQLException {
        int socioID = socio.getId();

        String sqlQuery = "DELETE FROM socio WHERE socioID = ?";
        try {
            PreparedStatement stmt = this.conexion.prepareStatement(sqlQuery);
            stmt.setInt(1, socioID);
            int effect = stmt.executeUpdate();
            if (effect == 0) {
                throw new SQLException();
            }
            return true;
        } catch (Exception e) {
            throw e;
        }
    }

    // Consultas
    @Override
    public ArrayList<Socio> query(String columna, String valor) throws SQLException {
        List<String> validColumns = Arrays.asList("nombre", "valor");
        if (!validColumns.contains(columna))
            throw new SQLException("Columna no válida");

        ArrayList<Socio> result = new ArrayList<Socio>();
        String sqlQuery = "SELECT * FROM socio WHERE " + columna + " = ?";

        try (PreparedStatement stmt = this.conexion.prepareStatement(sqlQuery)) {
            stmt.setString(1, valor);
            // Ejecución de la consulta
            ResultSet querySet = stmt.executeQuery();
            // Recorrido del resultado de la consulta
            while (querySet.next()) {
                int socioID = querySet.getInt("socioID");
                String nombre = querySet.getString("nombre");
                int estatura = querySet.getInt("estatura");
                int edad = querySet.getInt("edad");
                String localidad = querySet.getString("localidad");
                result.add(new Socio(edad, socioID, nombre, localidad, estatura));
            }
            return result;
        } catch (SQLException e) {
            throw e;
        }
    }

    // Consultas
    @Override
    public ArrayList query(String columna, int valor) throws SQLException {
        List<String> validColumns = Arrays.asList("nombre", "valor");
        if (!validColumns.contains(columna))
            throw new SQLException("Columna no válida");

        ArrayList<Socio> result = new ArrayList<Socio>();
        String sqlQuery = "SELECT * FROM socio WHERE " + columna + " = ?";

        try (PreparedStatement stmt = this.conexion.prepareStatement(sqlQuery)) {
            stmt.setInt(1, valor);

            // Ejecución de la consulta
            ResultSet querySet = stmt.executeQuery();
            // Recorrido del resultado de la consulta
            while (querySet.next()) {
                int socioID = querySet.getInt("socioID");
                String nombre = querySet.getString("nombre");
                int estatura = querySet.getInt("estatura");
                int edad = querySet.getInt("edad");
                String localidad = querySet.getString("localidad");
                result.add(new Socio(edad, socioID, nombre, localidad, estatura));
            }
            return result;
        }
    }

    @Override
    public ArrayList<Socio> requestAll(String orderBy) throws SQLException {
        ArrayList<Socio> resuls = new ArrayList<>();
        String sqlQueryAll = "SELECT * FROM socio";
        if (!orderBy.isEmpty())
            sqlQueryAll += "ORDER BY " + orderBy;
        try {
            Statement stmt = this.conexion.createStatement();

            ResultSet querySet = stmt.executeQuery(sqlQueryAll);
            while (querySet.next()) {
                int socioID = querySet.getInt("socioID");
                String nombre = querySet.getString("nombre");
                int estatura = querySet.getInt("estatura");
                int edad = querySet.getInt("edad");
                String localidad = querySet.getString("localidad");
                resuls.add(new Socio(edad, socioID, nombre, localidad, estatura));
            }
            return resuls;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Socio requestById(int id) throws SQLException {
        Socio results = null;
        String sqlQuerry = "SELECT * FROM socio WHERE socioID = " + id;
        try {
            Statement stmt = this.conexion.createStatement();
            ResultSet querySets = stmt.executeQuery(sqlQuerry);
            if (querySets.next()) {
                int socioID = querySets.getInt("socioID");
                String nombre = querySets.getString("nombre");
                int estatura = querySets.getInt("estatura");
                int edad = querySets.getInt("edad");
                String localidad = querySets.getString("localidad");
                results = new Socio(edad, socioID, nombre, localidad, estatura);
            }
            return results;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public boolean update(Socio socio) throws SQLException {
        int socioID = socio.getId();
        int estatura = socio.getEstatura();
        String nombre = socio.getNombre();
        int edad = socio.getEdad();
        String localidad = socio.getLocalidad();

        String sqlQuery = "UPDATE socio SET nombre = ?, estatura = ?, edad = ?, localidad = ? WHERE socioID = ?";
        try {
            PreparedStatement stmt = this.conexion.prepareStatement(sqlQuery);
            stmt.setString(1, nombre);
            stmt.setInt(2, estatura);
            stmt.setInt(3, edad);
            stmt.setString(4, localidad);
            stmt.setInt(5, socioID);
            int effect = stmt.executeUpdate();
            if (effect == 0) {
                throw new SQLException();
            }
            return true;
        } catch (Exception e) {
            throw e;
        }
    }

}
