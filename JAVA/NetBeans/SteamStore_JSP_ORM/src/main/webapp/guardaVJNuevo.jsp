<%-- 
    Document   : guardaVJNuevo
    Created on : 19 mar 2025, 19:33:34
    Author     : 1ºDAM-T
--%>

<%@page import="pool.ConnectionPool"%>
<%@page import="videojuegos.Videojuego"%>
<%@page import="videojuegos.GestorVideojuegos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <%
            //Establece los parámetros de configuración de la conexión a la base de datos
            String url = "jdbc:mariadb://localhost:3306/juegos_steam";
            String user = "root";
            String passwd = "";
            //Instancia la clase ConnectionPool y GestorVideojuegos
            ConnectionPool conex = new ConnectionPool(url, user, passwd);
            GestorVideojuegos miGestor = new GestorVideojuegos(conex.getConnection());

            request.setCharacterEncoding("UTF-8");

            //Invoca la operación del gestor que permite añadir un videojuego concreto (sus datos se pasan como parámetros) a la lista general (esta operación puede arrojar excepciones que hay que controlar)
            try {
                int identificador = Integer.valueOf(request.getParameter("identificador"));
                String nombre = request.getParameter("nombre");
                String fecha = request.getParameter("fecha");
                Float precio = Float.valueOf(request.getParameter("precio"));
                String descripcion = request.getParameter("descripcion");
                String imagen = request.getParameter("imagen");
                Videojuego miJuego = new Videojuego(identificador, nombre, fecha, precio, descripcion, imagen);
            
            //Comprueba el resultado obtenido y muestra un mensaje de éxito (entre etiquetas <div>) si la operación se realizó satisfactoriamente
                if(miGestor.create(miJuego)){
                    out.println("<div>Juego creado correctamente </div>");
                }else{
                    out.println("El juego no se ha creado correctamente");
                }
            }
            //Cierra las conexiones de tu ConnectionPool
            catch (Exception e) {
                e.getMessage();
            }finally{
                conex.closeAll();
            }
        %>
        <script>document.location = "index.jsp";</script>
    </body>
</html>
