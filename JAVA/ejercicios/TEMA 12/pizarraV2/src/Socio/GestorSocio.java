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

public class GestorSocio implements CRUD{
    private Connection connection;

    public GestorSocio(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean create(Socio socio) throws SQLException {
        int socioID = socio.getId();
        int estatura = socio.getEstatura();
        int edad = socio.getEdad();
        String nombre = socio.getNombre();
        String localidad = socio.getLocalidad();

        String sqlQuery = "INSERT INTO socio (nombre, estatura, edad, localidad, socioID) VALUES (?,?,?,?,?)";

        try {
            PreparedStatement stmt = this.connection.prepareStatement(sqlQuery);

            stmt.setString(1, nombre);
            stmt.setInt(2, estatura);
            stmt.setInt(3, edad);
            stmt.setString(4, localidad);
            stmt.setInt(5, socioID);

            int effectRows = stmt.executeUpdate();

            if (effectRows==0) {
                throw new SQLException();
            }else{
                System.out.println("Socio creado correctamente");
                return true;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public boolean delete(Socio socio) throws SQLException {
        int socioID = socio.getId();
        int estatura = socio.getEstatura();
        int edad = socio.getEdad();
        String nombre = socio.getNombre();
        String localidad = socio.getLocalidad();

        String sqlQuery = "DELETE FROM socio WHERE socioID = "+socioID;

        try {
            PreparedStatement stmt = this.connection.prepareStatement(sqlQuery);

            stmt.setString(1, nombre);
            stmt.setInt(2, estatura);
            stmt.setInt(3, edad);
            stmt.setString(4, localidad);
            stmt.setInt(5, socioID);

            int effectRows = stmt.executeUpdate();

            if (effectRows==0) {
                throw new SQLException();
            }else{
                System.out.println("Socio borrado correctamente");
                return true;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public ArrayList query(String columna, String valor) throws SQLException {
        List<String> validColums = Arrays.asList("nombre", "localidad");
        if (!validColums.contains(columna)) {
            throw new SQLException();
        }else{
            ArrayList<Socio> result = new ArrayList<>();
            String sqlQuery = "SELECT * FROM socio WHERE "+columna+"= ?";
            try {
                PreparedStatement stmt = this.connection.prepareStatement(sqlQuery);
                stmt.setString(1, valor);

                ResultSet querySet = stmt.executeQuery();

                while(querySet.next()) {
                    int socioID = querySet.getInt("socioID");
                    int estatura = querySet.getInt("estatura");
                    int edad = querySet.getInt("edad");
                    String nombre = querySet.getString("nombre");
                    String localidad = querySet.getString("localidad");
                    result.add(new Socio(nombre, localidad, edad, estatura, socioID));
                }
                return result;
            } catch (Exception e) {
                throw e;
            }
        }
    }

    @Override
    public ArrayList query(String columna, int valor) throws SQLException {
        List<String> validColums = Arrays.asList("socioID", "edad", "estatura");
        if (!validColums.contains(columna)) {
            throw new SQLException();
        }else{
            ArrayList<Socio> results = new ArrayList<>();
            String sqlQuery = "SELECT * FROM socio WHERE "+columna+" = ?";
            PreparedStatement stmt = this.connection.prepareStatement(sqlQuery);
            stmt.setInt(1, valor);
            ResultSet querySet = stmt.executeQuery();

            try {
                while (querySet.next()) {
                    int socioID = querySet.getInt("socioID");
                    int estatura = querySet.getInt("estatura");
                    int edad = querySet.getInt("edad");
                    String nombre = querySet.getString("nombre");
                    String localidad = querySet.getString("localidad");
                    results.add(new Socio(nombre, localidad, edad, estatura, socioID));
                }
                return results;
            } catch (Exception e) {
                throw e;
            }
            
        }
    }

    @Override
    public ArrayList requestAll(String orderBy, String columna) throws SQLException {
        ArrayList<Socio> results = new ArrayList<>();
        String sqlQuery = "SELECT * FROM socio";
        if (orderBy.isEmpty()) {
            throw new SQLException();
        }else{
            sqlQuery+= " ORDER BY "+columna+" "+orderBy;

            try {
                Statement stmt = this.connection.createStatement();

                ResultSet querySet = stmt.executeQuery(sqlQuery);

                while (querySet.next()) {
                    int socioID = querySet.getInt("socioID");
                    int estatura = querySet.getInt("estatura");
                    int edad = querySet.getInt("edad");
                    String nombre = querySet.getString("nombre");
                    String localidad = querySet.getString("localidad");
                    results.add(new Socio(nombre, localidad, edad, estatura, socioID));
                }

                return results;
            } catch (Exception e) {
                throw e;
            }
        }
    }

    @Override
    public Socio requestById(int id) throws SQLException {
        Socio results = null;
        String sqlQuery = "SELECT * FROM socio WHERE socioID = "+id;

        try {
            Statement stmt = this.connection.createStatement();
            ResultSet querySet = stmt.executeQuery(sqlQuery);

            if (querySet.next()) {
                int socioID = querySet.getInt("socioID");
                int estatura = querySet.getInt("estatura");
                int edad = querySet.getInt("edad");
                String nombre = querySet.getString("nombre");
                String localidad = querySet.getString("localidad");
                results = (new Socio(nombre, localidad, edad, estatura, socioID));
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
        int edad = socio.getEdad();
        String nombre = socio.getNombre();
        String localidad = socio.getLocalidad();

        String sqlQuery = "UPDATE socio SET nombre = ?, estatura = ?, edad = ?, localidad = ? WHERE socioID = ?";

        try {
            PreparedStatement stmt = this.connection.prepareStatement(sqlQuery);
            stmt.setString(1, nombre);
            stmt.setInt(2, estatura);
            stmt.setInt(3, edad);
            stmt.setString(4, localidad);
            stmt.setInt(5, socioID);

            int effectRows = stmt.executeUpdate();
            if (effectRows==0) {
                throw new SQLException();
            }
            else{
                System.out.println("Socio modificado");
                return true;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    
    
}