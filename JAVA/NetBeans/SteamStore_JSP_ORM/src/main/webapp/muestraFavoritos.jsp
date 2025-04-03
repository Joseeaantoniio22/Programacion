<%-- 
    Document   : muestraFavoritos
    Created on : 19 mar 2025, 19:33:34
    Author     : 1ºDAM-T
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="pool.ConnectionPool"%>
<%@page import="videojuegos.Videojuego"%>
<%@page import="videojuegos.GestorVideojuegos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--Importa Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Importa materialize.css--> 
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <title>Steam store</title>
    </head>    
    <body>
        <%
            // Nuestra aplicación aún no está adaptada para trabajar con múltiples usuarios
            // Fijemos a 100 el identificador del, por ahora, único usuario existente
            final int ID_USUARIO = 100;

            //Establece los parámetros de configuración de la conexión a la base de datos
            String url = "jdbc:mariadb://localhost:3306/juegos_steam";
            String user = "root";
            String passwd = "";
            //Instancia la clase ConnectionPool y GestorVideojuegos
            ConnectionPool conex = new ConnectionPool(url, user, passwd);
            GestorVideojuegos miGestor = new GestorVideojuegos(conex.getConnection());
        %>

        <div class="container">  
            <h2 class="center" style="color:#3f51b5 "><b>Listado de favoritos</b></h2>
            <%
                //Declara un ArrayList de videojuegos y asígnale null
                ArrayList<Videojuego> miArray = null;
                //Invoca la operación del gestor que permite recuperar todos los videojuegos favoritos del usuario 100 (esta operación puede arrojar excepciones que hay que controlar)
                try {
                    miArray = miGestor.requestFavouriteGames(ID_USUARIO);
                    //Comprueba el resultado obtenido y muestra un mensaje de error (entre etiquetas <div>) si la lista estuviera vacía
                    if (miArray.isEmpty()) {
                        out.println("ha ocurrido algun error");
                    } else {
                        //Si no estuviera vacía recorre la lista y puebla la página con sus datos
                        for (Videojuego videojuego : miArray) {
                            int identificador = videojuego.getIdentificador();
                            String nombre = videojuego.getNombre();
                            String fecha = videojuego.getFecha();
                            Float precio = videojuego.getPrecio();
                            String descripcion = videojuego.getDescripción();
                            String imagen = videojuego.getImagen();

                    // TODO: Los videojuegos ahora no se mostrarán en una tabla sino en contenedores de tipo div
                    // TODO: Se mostrarán tres videojuegos en cada fila. Para abrir una fila usa "<div class=\"row\">". Cierrra la fila con "</div>" cuando ya se hayan colocado tres
                    // TODO: Si en la última hilera solo se hubiesen colocado uno o dos videojuegos, hay que cerrar la fila con "</div>" igualmente
            %>

            <div class="col s4 m4 l4">           
                <div class="card grey lighten-5">
                    <div class="card-image">
                        <img src="<%=imagen%>">
                        <form method="post" action="borraFavorito.jsp">
                            <input type="hidden" name="identificador" value="<%=identificador%>">
                            <button class="btn-floating halfway-fab waves-effect waves-light red" type="submit" name="borrar">
                                <i class="material-icons left">delete</i>
                            </button>
                        </form> 
                    </div>
                    <div class="card-content">                        
                        <span class="card-title"><%=nombre%></span>
                        <p style="text-align:justify"><%=descripcion%></p>
                    </div>
                </div>
            </div>

            <%
            %>

        </div>
        <button class="btn waves-effect waves-light indigo right" onClick="window.location.href = 'index.jsp';">
            Volver&nbsp;a&nbsp;listado&nbsp;de&nbsp;videojuegos
            <i class="material-icons left">arrow_back</i>
        </button>            
        <div class="row"></div>

        <%            //Cierra las conexiones de tu ConnectionPool
                }
            }
        }catch (Exception e) {
                    e.getMessage();
            }
        %>

        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <!-- Materialize -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    </body>
</html>