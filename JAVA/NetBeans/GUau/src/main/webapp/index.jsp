<%-- 
    Document   : index
    Created on : 12 mar 2025, 17:34:28
    Author     : nocturno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Animales</title>
</head>
<body>
<form method="post" action="frase.jsp">
Seleccione animal a visualizar
<select name="animal">
<option>Gato</option>
<option>Caracol</option>
</select>
</br>
Número de animales <input type="text" name="numero" size="3">
</br>
<input type="submit">
</form>
</body>
</html>
