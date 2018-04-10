<%@page import="mvc.model.entidades.Oferta"%>
<%@page import="java.util.List"%>
<%@page import="mvc.controller.dao.OfertaJpaController"%>
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
            <html:submit value="BUSCAR" />
        </html:form>
        <ul>
            <%  if (request.getAttribute("ofertas") != null) {
                    List<Oferta> ofertasTitulo = (List<Oferta>) request.getAttribute("ofertas");
                    if (!ofertasTitulo.isEmpty()) {

                        out.println("BUSCANDO OFERTAS QUE COINDICAN CON: " + request.getAttribute("paramBusqueda"));
                        for (Oferta of : ofertasTitulo) {
                            out.println("<li>Titulo de la oferta: " + of.getTitulo() + " ,Tipo de oferta: "
                                    + of.getTipoOferta() + " ,Fecha de Inicio: " + of.getFechaInicio() + "</li>");
                        }
                    } else {
                        out.println("NO SE HA OBTENIDO NINGUN RESULTADO CON " + 
                                request.getAttribute("paramBusqueda") + "\nPOR FAVOR, REVISE SU BUSQUEDA");
                    }
                } else {
                    OfertaJpaController controller = new OfertaJpaController();
                    List<Oferta> ofertas = controller.findOfertas();

                    for (Oferta of : ofertas) {
                        out.println("<li>Titulo de la oferta: " + of.getTitulo() + " ,Tipo de oferta: "
                                    + of.getTipoOferta() + " ,Fecha de Inicio: " + of.getFechaInicio() + "</li>");

                    }
                }

            %>
        </ul>
    </body>
</html:html>
