<nav>
    <a href="index.jsp">INICIO</a>
    <% if (session.getAttribute("usuario") == null) { %>
    <a href="ofertas.jsp">OFERTAS</a>
    <a href="restaurante.jsp">RESTAURANTES</a>
    <a href="cliente.jsp">CLIENTE</a>
    <a href="empresa.jsp">¿ERES EMPRESA?</a>
    <% } else { %>
    <a href="ofertas.jsp">OFERTAS CERCA DE TI </a>
    <a href="restaurante.jsp">RESTAURANTES</a>
    <a href="cliente_ajustes.jsp">AJUSTES CLIENTE</a>
    <a href="logout.do">DESCONECTARSE</a>

    <% }%>

</nav>