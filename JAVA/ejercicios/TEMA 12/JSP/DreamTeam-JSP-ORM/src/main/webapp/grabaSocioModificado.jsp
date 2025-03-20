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

        <!-- Bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

        <title>DreamTeam - JSP - ORM</title>
    </head>
    <body>
        <%
            //Configuración de la conexión a la base de datos
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mariadb://localhost:3306/baloncesto";
            String user = "root";
            String password = "";
            //Instanciar ConnectionPool y GestorSocios
            ConnectionPool conex = new ConnectionPool(url, user, password);
            GestorSocios miGestorSocio = new GestorSocios(conex.getConnection());
            //Establecer la codificación de caracteres de la petición a UTF-8
            request.setCharacterEncoding("UTF-8");
            // TODO: Modificar socio a través del gestor (try-catch) y comprobar resultado (si verdadero, mostrar mensaje de éxito)
            try{
                
            }catch(Exception e){
                e.getMessage();
            }
            // TODO: Cerrar las conexiones del pool  
            
        %>
        <br>
        <a href="index.jsp" class="btn btn-primary"><span class="glyphicon glyphicon-home"></span> Página principal</button>
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
</body>
</html>