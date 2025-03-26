<%@page import="pool.ConnectionPool"%>
<%@page import="socios.Socio"%>
<%@page import="socios.GestorSocios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
            
            //Realizar borrado a través del gestor (esta operación puede generar excepciones que hay que controlar)
            try{
                int socioID = Integer.valueOf(request.getParameter("socioID"));
            //Comprobar el resultado anterior y, si verdadero, mostrar mensaje de éxito
                if(gestorSocio.delete(socioID)){
                    out.println("Socio eliminado correctamente");
                }else{
                    throw new Exception("Ha ocurrido algun error al eliminar el usuario");
                }
            }catch(Exception e){
                e.getMessage();
            }
            //Cerrar las conexiones del pool                  
            conex.closeAll();
        %>
        <script>document.location = "index.jsp"</script> 
    </body>
</html>
