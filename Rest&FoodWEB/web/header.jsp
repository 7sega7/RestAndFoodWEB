<nav>
    <a href="index.jsp">INICIO</a>
    <a href="ofertas.jsp">OFERTAS</a>
    <a href="restaurante.jsp">RESTAURANTES</a>
    <% if(request.getSession(false) != null && session.getAttribute("usuario") != null){ %>
    <a href="cliente.jsp">CLIENTE</a>
    <% } else{ %>
    <a href="cliente_ajustes.jsp">AJUSTES CLIENTE</a>
    <% } %>
    <a href="empresa.jsp">¿ERES EMPRESA?</a>
</nav>