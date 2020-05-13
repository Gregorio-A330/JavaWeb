<%-- 
    Document   : resultado
    Created on : 13/11/2018, 20:36:39
    Author     : dreis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultado</h1>
        
        <h3>Olá, <%= request.getParameter("nome") %>!</h3>
        <h3>Nome maiúsculo, <%= request.getAttribute("maiusculo").toString() %>!</h3>
    </body>
</html>
