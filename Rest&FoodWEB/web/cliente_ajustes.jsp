<%@page import="mvc.model.entidades.Cliente"%>
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
            <% Cliente c = (Cliente) request.getSession().getAttribute("usuario"); %>
            <tr><h4><td>Correo:</td><td><%= c.getCorreoCliente()%></td></h4></tr>
            <tr><h4><td>Contraseña:</td><td> <%= c.getContraseña()%></td></h4></tr>
            <tr><h4><td>Nombre:</td><td> <%= c.getNombreCliente()%></td></h4></tr>
            <tr><h4><td>Apellidos:</td><td> <%= c.getApellidosCliente()%></td></h4></tr>
            <tr><h4><td>Direccion:</td><td> <%= c.getDireccionCliente()%></td></h4></tr>
            <tr><h4><td>Codigo Postal:</td><td> <%= c.getCodigoPostal()%></td></h4></tr>
            <tr><h4><td>Ciudad:</td><td> <%= c.getCiudadCliente()%></td></h4></tr>
    </table>
</body>
</html:html>