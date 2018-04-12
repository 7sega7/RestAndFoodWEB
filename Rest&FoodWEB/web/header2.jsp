<html:html>

    <head>
    
        <link href="resources/styles/estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>

        <section class="title">
		<h1>Menu de imagenes</h1>
	</section>
        
<nav class="navegacion">
		<ul class="menu">

			<li class="first-item">
				<a href="index.jsp">
					<img src="http://2.1m.yt/C6KpkTU.jpg" alt="" class="imagen">
					<span class="text-item">INICIO</span>
					<span class="down-item"></span>
				</a>
			</li> 
                        
			<li>
				<a href="ofertas.jsp">
					<img src="http://2.1m.yt/Mam-LJ-.jpg" alt="" class="imagen">
					<span class="text-item">OFERTAS</span>
					<span class="down-item"></span>
				</a>
			</li>

			<li>
				<a href="restaurante.jsp">
					<img src="http://2.1m.yt/QZyUs0.jpg" alt="" class="imagen">
					<span class="text-item">RESTAURANTES</span>
					<span class="down-item"></span>
				</a>
			</li>

			<li>
				<a href="cliente.jsp">
					<img src="http://2.1m.yt/J8mLPHo.jpg" alt="" class="imagen">
					<span class="text-item">CLIENTE</span>
					<span class="down-item"></span>
				</a>
			</li>

			<li>
				<a href="empresa.jsp">
					<img src="http://2.1m.yt/qv4mDuq.jpg" alt="" class="imagen">
					<span class="text-item">¿ERES EMPRESA?</span>
					<span class="down-item"></span>
				</a>
			</li>

			

		</ul>
	</nav>
        
        <% if (session.getAttribute("usuario") != null) { %>
        <nav class="navegacion">
		<ul class="menu">

			<li class="first-item">
				<a href="index.jsp">
					<img src="http://2.1m.yt/C6KpkTU.jpg" alt="" class="imagen">
					<span class="text-item">INICIO</span>
					<span class="down-item"></span>
				</a>
			</li> 
                        
			<li>
				<a href="ofertas.jsp">
					<img src="http://2.1m.yt/Mam-LJ-.jpg" alt="" class="imagen">
					<span class="text-item">OFERTAS</span>
					<span class="down-item"></span>
				</a>
			</li>

			<li>
				<a href="restaurante.jsp">
					<img src="http://2.1m.yt/QZyUs0.jpg" alt="" class="imagen">
					<span class="text-item">RESTAURANTES</span>
					<span class="down-item"></span>
				</a>
			</li>

			<li>
				<a href="cliente.jsp">
					<img src="http://2.1m.yt/J8mLPHo.jpg" alt="" class="imagen">
					<span class="text-item">CLIENTE</span>
					<span class="down-item"></span>
				</a>
			</li>
        
        <% }%>
        
    

</body>  

</html:html>