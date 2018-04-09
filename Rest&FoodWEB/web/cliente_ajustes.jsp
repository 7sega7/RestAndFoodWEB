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
        <jsp:useBean id="login_cliente" class="mvc.vista.formbeans.LoginClienteForm"
                                 scope="request" />
        <h2>Datos procesados</h2>
        <h4>Correo: <jsp:getProperty name="login_cliente" property="correo" /></h4>
        <h4>Contraseña: <jsp:getProperty name="login_cliente" property="contrasena" /></h4>
        
    </body>
</html:html>