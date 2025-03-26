<%@page import="socios.Socio"%>
<%@page import="java.util.ArrayList"%>
<%@page import="socios.GestorSocios"%>
<%@page import="pool.ConnectionPool"%>
<% //Importar clases necesarias %>
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
        <div class="container">
            <br><br>			
            <div class="panel panel-primary">
                <div class="panel-heading text-center"><h2>Club de Baloncesto</h2></div>
                <%
                    //Configuración de la conexión a la base de datos
                    String url = "jdbc:mariadb://localhost:3306/baloncesto";
                    String user = "root";
                    String passwd = "";

                    //Instanciar ConnectionPool y GestorSocios
                    ConnectionPool conex = new ConnectionPool(url, user, passwd);
                    GestorSocios gestorSocio = new GestorSocios(conex.getConnection());
                    
                    // Declarar un ArrayList de Socio e inicializarlo a null
                    ArrayList<Socio> miArray = null;
                    //Realizar consulta a través del gestor (esta operación puede generar excepciones que hay que controlar)
                    try{
                        miArray=gestorSocio.requestAll("socioID ASC");
                        if(miArray.isEmpty()){
                            throw new Exception("Esta base de datos esta vacía");
                        }else{
                    
                    //Comprobar el resultado anterior y, si la lista está vacía, mostrar mensaje de error
                %>
                <table class="table table-striped">
                    <tr><th>Nº de socio</th><th>Nombre</th><th>Estatura</th><th>Edad</th><th>Localidad</th><th></th><th></th></tr>
                    <form method="get" action="grabaSocio.jsp">
                        <tr><td><input type="text" name="socioID" size="5"></td>
                            <td><input type="text" name="nombre" size="30"></td>
                            <td><input type="text" name="estatura" size="5"></td>
                            <td><input type="text" name="edad" size="5"></td>
                            <td><input type="text" name="localidad" size="20"></td>
                            <td><button type="submit" value="Añadir" class="btn btn-primary"><span class="glyphicon glyphicon-plus"></span>&nbsp;Añadir</button></td><td></td></tr>           
                    </form>
                    <%                        
                        //Si la lista no está vacía, recorrerla e imprimir sus elementos en filas de la tabla
                        for(Socio socio : miArray){
                            int socioID = socio.getId();
                            String localidad = socio.getLocalidad();
                            String nombre = socio.getNombre();
                            int edad = socio.getEdad();
                            int estatura = socio.getEstatura();
                            out.println("<tr><td>"+socioID+"</td><td>"+localidad+"</td><td>"+nombre+"</td><td>"+edad+"</td><td>"+estatura);
                    %>
                    <td>
                        <!-- Introducir los datos de cada socio en formulario asociado al botón modificar.-->
                        <form method="get" action="modificaSocio.jsp">
                            <input type="hidden" name="socioID" value="<%=socioID %>">
                            <input type="hidden" name="nombre" value="<%=nombre%>">
                            <input type="hidden" name="estatura" value="<%=estatura%>">
                            <input type="hidden" name="edad" value="<%=edad%>">
                            <input type="hidden" name="localidad" value="<%=localidad%>">
                            <button type="submit" class="btn btn-info"><span class="glyphicon glyphicon-pencil"></span>&nbsp;Modificar</button>
                        </form>
                    </td>
                    <td>
                        <!-- Introducir el ID de cada socio en formulario asociado al botón eliminar.  -->
                        <form method="get" action="borraSocio.jsp">
                            <input type="hidden" name="socioID" value="<%=socioID%>"/>
                            <button type="submit" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span>&nbsp;Eliminar</button>
                        </form>
                    </td></tr>
                    <%
                        //Cerrar bucle   
                        }
                    %>
                </table>
                <%
                    //Cerrar else, bloque catch, cerrar conexiones del pool   
                    }
                    }catch(Exception e){
                        e.getMessage();
                    }finally{
                        conex.closeAll();
                    }
                %>
            </div>
            <div class="text-center">&copy; DreamTeam - JSP - ORM</div>
            <br>
        </div>
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>