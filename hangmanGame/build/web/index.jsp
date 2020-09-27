<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Seja bem vin@ ao jogo!</h1>
        
        <form method="post" action="ServletForca">
            <input type="text" name="letra" placehoulder="Letra" requisred>
            <input type="submit" value="Enviar">           
        </form>
        
    </body>
</html>
