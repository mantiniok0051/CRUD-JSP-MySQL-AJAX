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
						<form id="sign-up-form" name="sign-in-form" action="doSignUp" class="fcc-form" method="post">
								<div class="form-group">
									<input id="_username" type="text" class="form-control" placeholder="User-Name" name="_username" required autofocus>
								</div>
								<div class="form-group">
									<input id="_email"  type="email" class="form-control" placeholder="e-Mail" name="_email" required="true">
								</div>
								<div  class="form-group">
									<input id="_userpass" type="password" class="form-control" placeholder="Password" name="_userpass" required="true">
								</div>
								<div class="form-group">
									<input id="_userpassv"  type="password" class="form-control" placeholder="Confirm Password" name="_userpassv" required="true">
								</div>
								<div class="form-group checkbox fcc-pane-sm" id="iAgree">
									<label for="_agree" class="checkbox">
										<input id="_agree" type="checkbox" value="1" name="_agree" required="true">I have read and accept the <a href="#">Terms and conditions</a> for the service and products.</input>
										
									</label>
								</div>
								<button id="_send" class="btn btn-default btn-block" type="submit">Create Account</button>
						</form>
					</div>
				<script src="js/jquery-1.11.3.js"></script>
				<script src="js/bootstrap.min.js"></script>
				<script src="js/validate/dist/jquery.validate.min.js"></script>
				<script src="js/validate/dist/additional-methods.min.js"></script>
				<script src="js/myfcc-js.js"></script>
			</body>
		</html>