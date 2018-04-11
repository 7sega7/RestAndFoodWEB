<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>APLICACION INICIAL STRUTS MVC</title>
        <link rel="stylesheet" type="text/css" href="resources/styles/menu.css" />
        <link href="resources/styles/login_cliente.css" rel="stylesheet" type="text/css"/>
        
        
        <html:base />
    </head>
    <body>
        <html:errors />
        <jsp:include page="header.jsp" flush="true" />
        
        <div class="container">

        <div id="login">
        <h2><span class="fontawesome-lock"></span>Sign In</h2>
        
        
           
        <html:form action="datos_login_cliente.do" focus="correo" method="post">
            <fieldset>
           
                <p><label for="correo">Correo electronico:</label></p>
                <p><html:text property="correo" size="30" /></p>
                
                <p><label for="contrasena">Contraseña:</label></p>
                <html:password property="contrasena" size="30" />
                
                <p> <html:submit value="Sign In" /></p>
          
            </fieldset>
        </html:form>
        <br/>
            <div>
                ¿Eres nuevo cliente?
                <a class="boton-cliente" href="nuevo_cliente.jsp" > Nuevo Cliente </a>
            </div>
        </div> 
        </div>
        
        </body>
</html:html>
