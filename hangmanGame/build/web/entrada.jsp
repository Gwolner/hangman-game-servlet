<%-- 
    Document   : entrada
    Created on : 07/08/2020, 21:38:05
    Author     : Wolf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Digite seu nome:</h1>
        <form method="get" action="saida.jsp">
            <input type="text" name="nome"><br>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
