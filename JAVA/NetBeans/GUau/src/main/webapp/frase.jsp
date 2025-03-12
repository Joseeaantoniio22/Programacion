<%-- 
    Document   : frase
    Created on : 12 mar 2025, 18:41:00
    Author     : nocturno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Paso de cadena</title>
</head>
<body>
<% request.setCharacterEncoding("UTF-8"); %>
<% 
    Double primerNumero = Double.valueOf(request.getParameter("x"));
    Double segundoNumero = Double.valueOf(request.getParameter("y"));
    for(int i=0;i<3;i++){
    out.println(primerNumero+i);
    }
%><br>
    <% for(int j=0;j<3;j++){
    out.println(segundoNumero+"+"+j+"="+(segundoNumero+j));
    %><br><%
    }
    ;%>
</body>
</html>
