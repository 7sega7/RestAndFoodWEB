<%@page import="mvc.vista.formbeans.LoginClienteForm"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Validacion Formulario Struts</title>

    </head>
    <body>
        <jsp:include page="header.jsp" flush="true" />
        
        <table>
            <th><h2>Cambie aqui sus datos de configuracion:</h2></th>
            <tr><td><h4>Correo: <%= request.getAttribute("correo")%></h4></td></tr>
            <tr><td><h4>Contraseña: <%= request.getAttribute("contrasena")%></h4></td></tr>
            <tr><td><h4>Nombre: <%= request.getAttribute("nombre")%></h4></td></tr>
            <tr><td><h4>Apellidos: <%= request.getAttribute("apell")%></h4></td></tr>
            <tr><td><h4>Direccion: <%= request.getAttribute("dire")%></h4></td></tr>
            <tr><td><h4>Codigo Postal: <%= request.getAttribute("cod_postal")%></h4></td></tr>
            <tr><td><h4>Ciudad: <%= request.getAttribute("ciudad")%></h4></td></tr>
    </table>
</body>
</html:html>