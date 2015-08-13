<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>


	var httpObject=new XMLHttpRequest();
	httpObject.onreadystatechange=function()

	
	
	{
		if (httpObject.readyState==4 && httpObject.status==200)
  		{
	  		document.getElementById("container").innerHTML=httpObject.responseText;
  		}
	}
	
	
	function altaCliente()
      {
        alert("Hola")
		document.getElementById("altaClienteForm").setAttribute(display, "none");
        httpObject.open("GET","Controller?action=altaClienteVisible",true);
        httpObject.send();
      }
      
</script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ABM Cliente</title>
</head>
<body>

<table>
	<tr>
		<td><a href="javascript:altaCliente()"> Alta Clientes</a></td><td><a href="Controller?action=ModificarClientes"> Modificar Clientes</a></td><td><a href="Controller?action=bajaClientes"> Baja Clientes</a></td>
	</tr>
</table>

<form action="Controller" method="post">
	<table>
		<tr>
			<td> ID <input type="text" id="IDCliente" name="IDCliente" required></td>
			<td> Codigo Cliente <input type="text" id="codigoCliente" name="codigoCliente" required></td>
			<td> Descripcion <input type="text" id="Descripcion" name="Descripcion" required></td>
			<td> Fecha de alta <input type="text" id="fechaAlta" name="fechaAlta" required></td>
			<td> Activo <input type="text" id="activo" name="activo" required></td>
		</tr>
		
	</table>
	<input type="submit" name="action" value="altaCliente" />
</form>

<!--
<form id="altaClienteForm" style="display:all" method="post" action="Controller">
 
    <div class="field">
        <label for="name">ID:</label>
        <input type="number" id="IDCliente" name="IDCliente" required>
    </div>
    <div class="field">
        <label for="name">Codigo:</label>
        <input type="text" id="codigoCliente" name="codigoCliente" required>
    </div>
    <div class="field">
        <label for="name">Descripcion:</label>
        <input type="text" id="Descripcion" name="Descripcion" required>
    </div>
    <div class="field">
        <label for="name">Fecha de alta:</label>
        <input type="date" id="fechaAlta" name="fechaAlta" required>
    </div>
     <div class="field">
        <label for="name">Activo:</label>
        <input type="text" id="activo" name="activo" >
    </div>
    
    
     <div class="field">
        <button type="submit" value="altaCliente">Alta Cliente</button>
    </div>

</form>

-->

<div id="altaUsuario"></div>
<div id="tableContainer"></div>
<div id="alerta"></div>

</body>
</html>