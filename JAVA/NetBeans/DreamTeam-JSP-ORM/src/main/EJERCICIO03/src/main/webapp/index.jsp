<%-- 
    Document   : indexjsp
    Created on : 3 abr 2025, 19:56:59
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
            int contador = 0;
            double numero = 0.0;
            double total = 0.0;

            try {
                contador = (Integer) session.getAttribute("contador");
                numero = (Double) session.getAttribute("numero");
                total = (Double) session.getAttribute("total");
            } catch (Exception e) {
                contador = -1;
                numero = 0.0;
            } finally {
                if (numero >= 0) {
                    session.setAttribute("total", total + numero);
                    session.setAttribute("contador", ++contador);
                    out.println(contador+" "+numero);
        %>
        <p>Introduce un numero para calcular la media de todos los numeros introducidos</p>
        <p>Para terminar, introduzca un número negativo.
        <form action="#" method="post">
            <input type="number" name="n" step="any" autofocus>
            <input type="submit" value="Aceptar">
        </form></p>
        <%
                }else{
                    %><p>La media es: 
                        <%=(Double) session.getAttribute("total") / (Integer) session.getAttribute("numeros")%>
                    </p><%
                }
             }
    %>
</body>
</html>
