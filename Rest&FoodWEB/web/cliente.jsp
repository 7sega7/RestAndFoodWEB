<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>APLICACION INICIAL STRUTS MVC</title>
        <link rel="stylesheet" type="text/css" href="resources/styles/base.css" />
        
        
        <html:base />
    </head>
    <body style="background-color: bisque">
        <html:errors />
        <jsp:include page="header.jsp" flush="true" />
        
        <br></br>
        <br></br>
        
        <div class="container">
            <fieldset>
        <html:form action="datos_login_cliente.do" focus="correo" method="post">
            <label for="correo">Correo electronico:</label>
            <html:text property="correo" size="30" />
            <br><br>
            <label for="contrasena">Contraseña:</label>
            <html:password property="contrasena" size="30" />
            </fieldset>
            <html:submit value="INICIAR SESION" />
        </html:form>  
            <br>
            <div>
                ¿Eres nuevo cliente?
                <a class="boton-cliente" href="nuevo_cliente.jsp" > Nuevo Cliente </a>
            </div>
        </div>  
        </body>
</html:html>
