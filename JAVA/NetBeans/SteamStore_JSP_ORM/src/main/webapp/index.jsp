<%-- 
    Document   : index 
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
            //Establece los parámetros de configuración de la conexión a la base de datos
            String url = "jdbc:mariadb://localhost:3306/juegos_steam";
            String user = "root";
            String passwd = "";
            //Instancia la clase ConnectionPool y GestorVideojuegos
            ConnectionPool conex = new ConnectionPool(url, user, passwd);
            GestorVideojuegos miGestor = new GestorVideojuegos(conex.getConnection());
        %>

        <div class="container">
            <div class="row s12 m12 l12">
                <div class="card grey lighten-5">
                    <h1 class="center" style="color:purple"><b>Steam Store</b></h1>
                    <button class="btn waves-effect waves-light" style="width:230px" name="nuevoJuego" onClick="window.location.href = 'agregaVideojuego.jsp';">
                        Añadir&nbsp;videojuego&nbsp;
                        <i class="material-icons left">add</i>
                    </button>
                    <br>
                    <button class="btn waves-effect waves-light pink" style="margin-top: 10px; width:230px" name="favoritos" onClick="window.location.href = 'muestraFavoritos.jsp';">
                        Ver&nbsp;lista&nbsp;de&nbsp;deseos
                        <i class="material-icons left">favorite</i>
                    </button>

                    <%
                        //Declara un ArrayList de videojuegos y asígnale null
                        ArrayList<Videojuego> miArray = null;
                        // TODO: Invoca la operación del gestor que permite recuperar todos los videojuegos de la tienda (esta operación puede arrojar excepciones que hay que controlar)
                        try {
                            miArray = miGestor.requestAll("identificador ASC");
                            // TODO: Comprueba el resultado obtenido y muestra un mensaje de error (entre etiquetas <div>) si la lista estuviera vacía
                            if (miArray.isEmpty()) {
                                throw new Exception("<div>Ha ocurrido algún error, la lista está vacía</div>");
                            } else {
                                // TODO: Si no estuviera vacía recorre la lista y puebla la tabla con sus datos
                                for (Videojuego videojuego : miArray) {
                                    int identificador = videojuego.getIdentificador();
                                    String nombre = videojuego.getNombre();
                                    String fecha = videojuego.getFecha();
                                    Float precio = videojuego.getPrecio();
                                    String descripcion = videojuego.getDescripción();
                                    String imagen = videojuego.getImagen();

                    %>

                    <table class="striped centered responsive-table">
                        <thead><th></th><th></th><th></th></thead>
                        <tr>
                            <td><img src="<%=imagen%>" style="margin-left: 5px;"></td>
                            <td>
                                <table 
                                    <tr>                                      
                                        <td><b>T&iacute;tulo: </b><%=nombre%></td>
                                        <td><b>Fecha: </b><%=fecha%></td>
                                        <td><b>Precio: </b>&euro;<%= precio%></td>
                                    </tr>
                                    <tr>
                                        <td colspan="3" style="width:100%"><p style="text-align:justify"><%=descripcion%></p></td>                                        
                                    </tr>
                                </table>
                            </td>
                            <td style="padding: 0;">
                                <!-- Contenedor de botones con estilo ajustado -->
                                <div style="display: flex; flex-direction: column; gap: 10px; margin-right: 12px; margin-left: 15px;">
                                    <!-- Botón Editar -->
                                    <form method="post" action="editaVideojuego.jsp">
                                        <input type="hidden" name="identificador" value="<%=identificador%>">
                                        <input type="hidden" name="nombre" value="<%=nombre%>">
                                        <input type="hidden" name="fecha" value="<%=fecha%>">
                                        <input type="hidden" name="precio" value="<%=precio%>">
                                        <input type="hidden" name="descripcion" value="<%=descripcion%>">
                                        <input type="hidden" name="imagen" value="<%=imagen%>">
                                        <button class="btn waves-effect waves-light center blue" style="width:150px;" type="submit" name="editar">
                                            Editar<i class="material-icons left">create</i>
                                        </button>
                                    </form> 
                                    <!-- Botón Borrar -->
                                    <form method="post" action="borraVideojuego.jsp">
                                        <input type="hidden" name="identificador" value="<%=identificador%>">
                                        <button class="btn waves-effect waves-light center red" style="width:150px;" type="submit" name="borrar">
                                            Borrar<i class="material-icons left">delete</i>
                                        </button>
                                    </form> 
                                    <!-- Botón Marcar -->
                                    <form method="post" action="agregaFavorito.jsp">
                                        <input type="hidden" name="identificador" value="<%=identificador%>">
                                        <button class="btn waves-effect waves-light center green" style="width:150px;" type="submit" name="editar">
                                            Marcar<i class="material-icons left">favorite_border</i>
                                        </button>
                                    </form> 
                                </div>
                            </td>
                        <%}%>
                        </tr>
                    </table>  
                </div>
            </div>
        </div>
        <%
                        //Cierra las conexiones de tu ConnectionPool
                }
            } catch (Exception e) {
                e.getMessage();
            } finally {
                conex.closeAll();
            }
        %>

        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <!-- Materialize -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    </body>
</html>
