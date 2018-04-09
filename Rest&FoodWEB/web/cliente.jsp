<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>APLICACION INICIAL STRUTS MVC</title>
    </head>
    <body style="background-color: bisque">
        <html:errors/>
        <jsp:include page="header.jsp" flush="true" />

        <html:form action="login_cliente.do" focus="correo" method="post">
            <label for="correo">Correo electronico:</label>
            <html:text property="correo" size="30" />
            <br><br>
            <label for="pass">Contraseña:</label>
            <html:text property="pass" size="30" />
            <html:submit value="INICIAR SESION" />
        </html:form>
            <br><br><br>
            <div>
                ¿Eres nuevo cliente?
                <a class="boton-cliente" href="nuevo_cliente.jsp" > Nuevo Cliente </a>
            </div>
            
            
            
            

        </body>
</html:html>
