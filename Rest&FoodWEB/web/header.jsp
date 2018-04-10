<html:html>

<link rel="stylesheet" type="text/css" href="resources/styles/menu.css">
<nav class="page-nav">
    <div class="container">
       <ul id="menu">
           
           <li><a href="index.jsp">INICIO</a></li>
           <% if (session.getAttribute("usuario") == null) { %>
           <li><a href="ofertas.jsp">OFERTAS</a></li>
           <li><a href="restaurante.jsp">RESTAURANTES</a></li>
           <li><a href="cliente.jsp">CLIENTE</a></li>
           <li><a href="empresa.jsp">¿ERES EMPRESA?</a></li>
       </ul>
       </div>
</nav>
    <% } else { %>
    <a href="ofertas.jsp">OFERTAS CERCA DE TI </a>
    <a href="restaurante.jsp">RESTAURANTES</a>
    <a href="cliente_ajustes.jsp">AJUSTES CLIENTE</a>
    <a href="logout.do">DESCONECTARSE</a>

    <% }%>


    

</html:html>