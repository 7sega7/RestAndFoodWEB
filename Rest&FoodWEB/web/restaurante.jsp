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
        <title>APLICACION INICIAL STRUTS MVC</title>
        <html:base />
    </head>
    <body style="background-color: bisque">
        <html:errors />
        <jsp:include page="header.jsp" flush="true" />

        <html:form action="busqueda_restaurante.do" focus="busqueda" method="post">
            <label for="busqueda">Introduce aqui el nombre del restaurante a buscar:</label>
            <html:text property="busqueda" size="30" />
            <br><br>
            <html:submit value="BUSCAR" />
        </html:form>
        <ul>
            <%  if (request.getAttribute("restaurante") != null) {
                    List<Restaurante> restaurantesNombre = (List<Restaurante>) request.getAttribute("restaurante");
                    if (!restaurantesNombre.isEmpty()) {

                        out.println("BUSCANDO OFERTAS QUE COINDICAN CON: " + request.getAttribute("paramBusqueda"));
                        for (Restaurante r : restaurantesNombre) {
                            out.println("<li>Nombre del Restaurante: " + r.getNombre() + " ,Direccion: "
                                    + r.getDireccion() + " ,Codigo Postal: " 
                                    + r.getCodigoPostal() + " ,Ciudad: " + r.getCiudad() + "</li>");
                        }
                    } else {
                        out.println("NO SE HA OBTENIDO NINGUN RESULTADO CON " + 
                                request.getAttribute("paramBusqueda") + "\nPOR FAVOR, REVISE SU BUSQUEDA");
                    }
                } else {
                    RestauranteJpaController controller = new RestauranteJpaController();
                    List<Restaurante> restaurantesNombre = controller.findRestaurantes();

                    for (Restaurante r : restaurantesNombre) {
                            out.println("<li>Nombre del Restaurante: " + r.getNombre() + " ,Direccion: "
                                    + r.getDireccion() + " ,Codigo Postal: " 
                                    + r.getCodigoPostal() + " ,Ciudad: " + r.getCiudad() + "</li>");
                        }
                }

            %>
        </ul>
    </body>
</html:html>
