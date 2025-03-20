<%@page import="socios.Socio"%>
<%@page import="pool.ConnectionPool"%>
<%@page import="socios.GestorSocios"%>
<%@page import="java.sql.Connection"%>

<%@page import= "java.util.ArrayList"%>;
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <%
            //Configuración de la conexión a la base de datos   º
            String url = "jdbc:mariadb://localhost:3306/baloncesto";
            String user = "root";
            String password = "";
            //Instanciar ConnectionPool y GestorSocios
            ConnectionPool conex = new ConnectionPool(url, user, password);
            GestorSocios miGestorSocio = new GestorSocios(conex.getConnection());
            //Establecer la codificación de caracteres de la petición a UTF-8
            request.setCharacterEncoding("UTF-8");
            //Realizar borrado a través del gestor (try-catch) y comprobar resultado (si verdadero, mostrar mensaje de éxito)
            try {
                int socioID = Integer.valueOf(request.getParameter("socioID"));
                if (miGestorSocio.delete(socioID)) {
        %><div><%out.println("¡Usuario borrado correctamente!");%></div><%
                            }
                        } catch (Exception e) {
                            e.getMessage();
                        } finally {
                            conex.closeAll();
                        }
                        //Cerrar las conexiones del pool                  

        %>
        <script>document.location = "index.jsp"</script> 
    </body>
</html>
