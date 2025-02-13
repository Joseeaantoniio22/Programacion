import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        String url ="jdbc:mariadb://localhost:3306/baloncesto";
        String usuario = "root";
        String contraseña = "";

        Connection conexion = null;
        Statement sentencia = null;
        ResultSet resultado = null;

        try {
            //ESTABLECE LA CONEXION CON LA BD
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            sentencia = conexion.createStatement();
            //CONSULTA SQL
            String query = "SELECT * FROM socio";
            resultado = sentencia.executeQuery(query);
            //IMPRIMIMO LOS RESULTADOS
            while (resultado.next()) {
                int soicioId= resultado.getInt("socioID");
                String nombre = resultado.getString("nombre");
                int estatura = resultado.getInt("estatura");
                int edad = resultado.getInt("edad");
                String localidad = resultado.getString("localidad");

                System.out.println("Id socio: "+soicioId+", nombre: "+nombre+", estatura: "+estatura+", edad: "+edad+", localidad: "+localidad);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            try {
                if (resultado!=null) resultado.close();
                if(sentencia!=null) sentencia.close();
                if(conexion!=null) conexion.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
