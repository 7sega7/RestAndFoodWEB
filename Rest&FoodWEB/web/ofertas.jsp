<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>APLICACION INICIAL STRUTS MVC</title>
        <html:base />
    </head>
    <body style="background-color: bisque">
        <html:errors />
        <jsp:include page="header.jsp" flush="true" />

        <html:form action="busqueda_oferta.do" focus="busqueda" method="post">
            <label for="busqueda">Introduce aqui la palabra clave a buscar en las ofertas:</label>
            <html:text property="busqueda" size="30" />
            <br><br>
            <html:submit value="INICIAR SESION" />
        </html:form>
        </body>
</html:html>
