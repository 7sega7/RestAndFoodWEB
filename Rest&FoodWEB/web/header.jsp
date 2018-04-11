<html:html>

    <head>
<link rel="stylesheet" type="text/css" href="resources/styles/menu.css">

    </head>
    <body>

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
    <nav class="page-nav2">
        <div class="container">
            <ul>  
                <li><a href="ofertas_cliente.jsp">OFERTAS CERCA DE TI </a></li>
                <li><a href="restaurante_cliente.jsp">RESTAURANTES</a></li>
                <li><a href="cliente_ajustes.jsp">AJUSTES CLIENTE</a></li>
                <li><a href="logout.do">DESCONECTARSE</a></li>
        </div>
    </nav>
    <% }%>
    

</body>  

</html:html>