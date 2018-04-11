<%@page import="mvc.model.entidades.Cliente"%>
<%@page import="mvc.controller.dao.RestauranteJpaController"%>
<%@page import="mvc.model.entidades.Restaurante"%>
<%@page import="mvc.model.entidades.Oferta"%>
<%@page import="java.util.List"%>
<%@page import="mvc.controller.dao.OfertaJpaController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RESTAURANTE CLIENTE</title>
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
        <html:form action="busqueda_restaurante.do" focus="busqueda" method="post">
            <label for="busqueda">Introduce aqui el nombre del restaurante a buscar:</label>
            <html:text property="busqueda" size="30" />
            <br><br>
            <html:submit value="BUSCAR" />
        </html:form>
        </div>
        <br>
        
        <div class="tabla-restaurantes" align="center">
            <table class="ofertas">
                <tr>
                <th>Nombre Restaurante</th>
                <th>Dirección</th>
                <th>Codigo Postal</th>
                <th>Ciudada</th>
                </tr>
        
        
            <%  if (request.getAttribute("restaurante_cliente") != null) {
                    List<Restaurante> restaurantesNombre = (List<Restaurante>) request.getAttribute("restaurante");
                    if (!restaurantesNombre.isEmpty()) {

                        out.println("BUSCANDO OFERTAS QUE COINDICAN CON: " + request.getAttribute("paramBusqueda"));
                        for (Restaurante r : restaurantesNombre) {
                            out.println("<tr>" + 
                                        "<td>" + r.getNombre() + "</td>" +
                                        "<td>" + r.getDireccion() + "</td>" +
                                        "<td>" + r.getCodigoPostal() + "</td>" +
                                        "<td>" + r.getCiudad() + "</td>" +       
                                    "</tr>");
                        }
                    } else {
                        out.println("NO SE HA OBTENIDO NINGUN RESULTADO CON "
                                + request.getAttribute("paramBusqueda") + "\nPOR FAVOR, REVISE SU BUSQUEDA");
                    }
                } else {
                    Cliente c = (Cliente) request.getSession().getAttribute("usuario");
                    RestauranteJpaController controller = new RestauranteJpaController();
                    List<Restaurante> restaurantesCliente = 
                            controller.findRestaurantePostalAndCity(c.getCodigoPostal(), c.getCiudadCliente());
                    out.println("RESTAURANTES CERCA DE TI");
                    for (Restaurante r : restaurantesCliente) {
                        out.println("<tr>" + 
                                        "<td>" + r.getNombre() + "</td>" +
                                        "<td>" + r.getDireccion() + "</td>" +
                                        "<td>" + r.getCodigoPostal() + "</td>" +
                                        "<td>" + r.getCiudad() + "</td>" +       
                                    "</tr>");
                    }
                }

            %>
            </table>
        </div>
            
    </body>
</html:html>
