<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>APLICACION INICIAL STRUTS MVC</title>
        <link rel="stylesheet" type="text/css" href="resources/styles/base.css" />
        <link href="resources/styles/empresa_contacto.css" rel="stylesheet" type="text/css"/>
        <html:base />
    </head>
    <body style="background-color: bisque">
        <html:errors />
        <header>
        <jsp:include page="header.jsp" flush="true" />
        </header>
        
        <br></br>
        <br></br>
        
        <div class="container" align="center">
            <h1>RELLENA EL SIGUIENTE FORMULARIO Y CONTACTAREMOS CONTIGO LO MAS BREVE POSIBLE</h1>
            
            
            <div id="wrapper">
        <form action="" method="post">
            <fieldset>
                <legend>Contacto</legend>
                <div>
                    <input type="text" name="first_name" placeholder="Nombre Restaurante"/>
                </div>
                
                <div>
                    <input type="text" name="email" placeholder="Email"/>
                </div>
                <div>
                    <div class="small">Escribenos por que quieres formar parte de Rest&Food</div>
                    <textarea name="message" placeholder="Message"></textarea>
                </div>    
                <input type="submit" name="submit" value="Send"/>
            </fieldset>    
        </form>
    </div>
            
            <br>
            <br>
            
            
            
            
            
        <html:form action="datos_empresa.do" focus="correo" method="post">
            <label for="correo">Correo electronico:</label>
            <html:text property="correo" size="30" />
            <br><br>
            <label for="nombre">Nombre del Restaurante</label>
            <html:text property="nombre" size="30" />
            <br><br>
            <label for="info">Escribenos por que quieres formar parte de Rest&Food</label>
            <html:textarea property="info"></html:textarea>
           
            <html:submit value="ENVIAR" />
        </html:form>  
            <br>
        </div>  
        </body>
</html:html>
