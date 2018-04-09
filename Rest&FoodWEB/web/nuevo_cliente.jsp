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
        
        <h1> Creación de nuevo Cliente</h1>
        <%-- Mostrar errores de validacion si los hay --%>
        <html:errors />
        
        <%-- 
            Creacion formulario persistente con reescritura de URL
            Ponemos el cursor (foco) en el campo nombre
        --%>
        <html:form action="datos_crear_cliente.do" focus="nombre" method="post">
            <label for="nombre">Nombre</label>
            <%-- Caja de texto enlazada a la propiedad nombre del form bean estatico
                 de la accion a la que mandamos los datos del formulario --%>
            <html:text property="nombre" size="30" />
            <h5><i>Campo requerido</i></h5>
            <br/>
            <label for="email">Email</label>
            <%-- Caja de texto enlazada a la propiedad email del form bean estatico
                 de la accion a la que mandamos los datos del formulario --%>
            <html:text property="email" size="30" />
            <h5><i>Campo requerido</i></h5>
            <br/>
            
            <label for="apellidos"> Apellidos </label>
            <html:text property="apellidos" size="30" />
            <br/>
            
            <label for="direccion"> Direccion </label>
            <html:text property="direccion" size="30" />
            <h5><i>Campo requerido</i></h5>
            <br/>
            
            <label for="postal"> Codigo Postal </label>
            <html:text property="postal" size="30" />
            <h5><i>Campo requerido</i></h5>
            <br/>
            
            <label for="ciudad"> Ciudad </label>
            <html:text property="ciudad" size="30" />
            <h5><i>Campo requerido</i></h5>
            <br/>
            
            <label for="password"> Contraseña </label>
            <html:text property="password" size="30" />
            <h5><i>Campo requerido</i></h5>
            <br/>
            
            <label for="repassword"> Confirmar Contraseña </label>
            <html:text property="repassword" size="30" />
            <h5><i>Campo requerido</i></h5>
            <br/>
            
            
            <html:submit value="   Enviar   " />
        </html:form>
            
            
            

        </body>
</html:html>
