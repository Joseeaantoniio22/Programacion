<%-- 
    Document   : index
    Created on : 13 mar 2025, 20:38:40
    Author     : nocturno
--%>

<%@page import="DAM1.Gato"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gatos con clase</title>
    </head>
    <body>
        <h1>Gatos con clase</h1>
        <hr>
        <%
            Gato g1 = new Gato("Pepe", "gato.jpg");
            Gato g2 = new Gato("Garfield", "garfield.jpg");
            Gato g3 = new Gato("Tom", "miau.png");
            out.println(g1);
            out.println(g2);
            out.println(g3);
            out.println(g1.maulla());
            out.println(g2.come("sardinas"));
        %>
    </body>
</html>
