<%@page import="pool.ConnectionPool"%>
<%@page import="socios.Socio"%>
<%@page import="socios.GestorSocios"%>
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
            String url = "jdbc:mariadb://localhost:3306/baloncesto";
            String user = "root";
            String passwd = "";
            //Instanciar ConnectionPool y GestorSocios
            ConnectionPool conex = new ConnectionPool(url, user, passwd);
            GestorSocios gestorSocio = new GestorSocios(conex.getConnection());
            //Establecer la codificación de caracteres de la petición a UTF-8
            request.setCharacterEncoding("UTF-8");
            // TODO: Crear socio a través del gestor (esta operación puede generar excepciones que hay que controlar)
            try {
                int socioID = Integer.valueOf(request.getParameter("socioID"));
                String nombre = request.getParameter("nombre");
                String localidad = request.getParameter("localidad");
                int edad = Integer.valueOf(request.getParameter("edad"));
                int estatura = Integer.valueOf(request.getParameter("estatura"));
                Socio socio = new Socio(socioID, nombre, estatura, edad, localidad);
                //Comprobar el resultado anterior y, si verdadero, mostrar mensaje de éxito
                if (gestorSocio.create(socio)) {
                    out.println("Socio creado correctamente");
                } else {
                    throw new Exception("No se ha podido crear el socio correctamente");
                }
            } catch (Exception e) {
                e.getMessage();
            }
            //Cerrar las conexiones del pool  
            conex.closeAll();
        %>
        <br>
        <a href="index.jsp" class="btn btn-primary"><span class="glyphicon glyphicon-home"></span>&nbsp;&nbsp;Página principal</a>
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>