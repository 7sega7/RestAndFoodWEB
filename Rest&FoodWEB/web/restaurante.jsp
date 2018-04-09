<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>APLICACION INICIAL STRUTS MVC</title>
    </head>
    <body style="background-color: bisque">
        
            <jsp:include page="header.jsp" flush="true" />
            
            <html:form action=""  method="POST">
                <label for="buscar">BUSCADOR</label>
                <input type="text" name="buscar" id="buscar"
                       size="8" />
                <input type="buttom" name="boton-buscar" id="boton-buscar"/>
                    
            </html:form>
        
        <br/><br/>
    <li>
        <table>
            
            
        </table>
    </li>

    </body>
</html:html>
