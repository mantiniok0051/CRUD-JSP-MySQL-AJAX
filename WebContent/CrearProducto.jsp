<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
		<html>
			<head>
				<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
				<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
				<title>Registrar un nuevo producto</title>

				<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
				<link rel="stylesheet" type="text/css" href="css/crud.css">
				
			</head>
			<body>
			<div class="container well crud-pannel" id="crearProducto">
						<div class="row">
							<div class="col-xs-12 well" id="form-title">
								<h2>Registro de Producto</h2>
							</div>
						</div>
						<form id="create-product-form" name="create-product-form" action="crearproducto" class="fcc-form" method="post" enctype="multipart/form-data">
								<div class="form-group">
									<input id="_nombre" type="text" class="form-control" placeholder="Nombre del producto" name="_nombre" required autofocus>
								</div>
								<div class="form-group">
									<textarea cols="30" rows="6" id="_descripcion"  class="form-control" placeholder="Descripcion del producto" name="_descripcion" form="create-product-form" required="true"></textarea>
								</div>
								<div  class="form-group">
									<input id="_precio" type="text" class="form-control" placeholder="Precio del producto MXN" name="_precio" required="true">
								</div>
								<div class="form-group">
									<input id="_categoria"  type="text" class="form-control" placeholder="Categoria del producto" name="_categoria" required="true">
								</div>
								<div  class="form-group">
									<textarea cols="30" rows="6" id="_detalles"  class="form-control" placeholder="Detalles del producto" name="_detalles" form="create-product-form" required="true"></textarea>
								</div>
								<div  class="form-group">
									<textarea cols="30" rows="6" id="_reviews"  class="form-control" placeholder="Reviews acerca del producto" name="_reviews" form="create-product-form" required="true"></textarea>
								</div>
								<div  class="form-group">
									<select id="_size" class="form-control" name="_size" required="true">
										<%for(int i=1; i<20; i++){%>
											<option value="<%= i%>"><%= i%></option>
										<%}%>
									</select>
								</div>
								<div  class="form-group">
									<input id="_color" type="text" class="form-control" placeholder="Color(es) del producto" name="_color" required="true"/>
								</div>
								<div  class="form-group">
									<input type="file" name="product_photos[]" id="product_photos" multiple/>
								</div>
								<div class="form-group checkbox fcc-pane-sm" id="continue-registration">
									<label for="_continue-registration" class="checkbox">
										<input id="_continue-registration" type="checkbox" value="1" name="_continue-registration" >Deseo registrar mas productos.</input>		
									</label>
								</div><button id="_clear-form" class="btn btn-danger btn-large" type="reset" value="Limpiar formulario" text="Limpiar formulario">Limpiar formulario</button>
								<button id="_register-product" class="btn btn-success btn-large" type="submit"value="Registrar Producto">Registrar Producto</button>
						</form>
					</div>
				<script src="js/jquery-1.11.3.js"></script>
				<script src="js/bootstrap.min.js"></script>
				<script src="js/validate/dist/jquery.validate.min.js"></script>
				<script src="js/validate/dist/additional-methods.min.js"></script>
				<script src="js/myfcc-js.js"></script>
			</body>
		</html>