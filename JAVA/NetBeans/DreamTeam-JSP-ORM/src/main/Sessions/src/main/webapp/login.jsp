<%-- 
    Document   : login
    Created on : 3 abr 2025, 21:01:23
    Author     : nocturno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String usuario = request.getParameter("usuario");
            String contrasena = request.getParameter("contrasena");
            if (usuario.equals("pepe") && contrasena.equals("1234")) {
                session.setAttribute("usuario", usuario);
                response.sendRedirect("index.jsp");
            } else {
                session.setAttribute("error", "Usuario o contraseña incorrecto");
                response.sendRedirect("formulario-login.jsp");
            }
        %>
    </body>
</html>
