<%@page import="mvc.model.entidades.Oferta"%>
<%@page import="java.util.List"%>
<%@page import="mvc.controller.dao.OfertaJpaController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>OFERTAS DE RESTANDFOOD</title>
        
        <link href="resources/styles/tablas.css" rel="stylesheet" type="text/css"/>
        <link href="resources/styles/base.css" rel="stylesheet" type="text/css"/>
        
        <html:base />
    </head>
    <body style="background-color: bisque">
        <html:errors />
        <header>
        <jsp:include page="header.jsp" flush="true" />
        </header>
        
        <br>
        <br>
        <div class="buscador" align="center">
        <html:form action="busqueda_oferta.do" focus="busqueda" method="post">
            <label for="busqueda">Introduce aqui la palabra clave a buscar en las ofertas:</label>
            <html:text property="busqueda" size="30" />
            <br><br>
            <html:submit value="BUSCAR" />
        </html:form>
        </div>
            
            
            <br>
            <div class="tabla-ofertas" align="center">
                <table class="ofertas">
                <tr>
                <th>Titulo de la oferta</th>
                <th>Tipo de oferta</th>
                <th>Fecha de inicio</th>
                </tr>
            <%  if (request.getAttribute("ofertas") != null) {
                    List<Oferta> ofertasTitulo = (List<Oferta>) request.getAttribute("ofertas");
                    if (!ofertasTitulo.isEmpty()) {

                        out.println("BUSCANDO OFERTAS QUE COINDICAN CON: " + request.getAttribute("paramBusqueda"));
                        for (Oferta of : ofertasTitulo) {
                            out.println("<tr>" + 
                                        "<td>" + of.getTitulo() + "</td>" +
                                        "<td>" + of.getTipoOferta() + "</td>" +
                                        "<td>" + of.getFechaInicio() + "</td>" +
                                    "</tr>");
                        }
                    } else {
                        out.println("NO SE HA OBTENIDO NINGUN RESULTADO CON " + 
                                request.getAttribute("paramBusqueda") + "\nPOR FAVOR, REVISE SU BUSQUEDA");
                    }
                } else {
                    OfertaJpaController controller = new OfertaJpaController();
                    List<Oferta> ofertas = controller.findOfertas();

                    
                    for (Oferta of : ofertas) {
                        out.println("<tr>" + 
                                        "<td>" + of.getTitulo() + "</td>" +
                                        "<td>" + of.getTipoOferta() + "</td>" +
                                        "<td>" + of.getFechaInicio() + "</td>" +
                                    "</tr>" );
                                
                                
                                

                    }
                }

            %>
        </table>
            </div> 
        
    </body>
</html:html>
