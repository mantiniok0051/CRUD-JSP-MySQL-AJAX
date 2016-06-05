$ (function(){

	$('#sign-up-form').validate({
		rules: {
				 _username: {required: true,
					 		 rangelength: [8, 50]},
				 _email:{required: true,
					 	 email: true},
				 userpass:{required: true,
					 		rangelength: [8, 20]},
				 _userpassv:{equalTo: '#_userpass'},
				 _agree:{required:true}
				},
			   
		 submitHandler: function(form) {
				 							var data= $('#sign-up-form').serialize();
				 							$.post('doSignUp', data, function(res, est, jqXHR){
				 										if (res == '1') {
								 											$('#_username').val('');
												 							$('#_email').val('');
												 							$('#_userpass').val('');
												 							$('#_userpassv').val('');
												 							$('_agree').val('0');
												 							
												 							setTimeout(function(){
															 					window.location = "log-in.jsp"; 
														 					   }), 3000;
																		}
				 										else{alert("Error al registrar la nueva cuenta!");
					 										setTimeout(function(){
											 					window.location = "sign-up.jsp"; 
										 					   }), 3000;
				 											}
				 										
				 							});
				 							
				 							
				 										 							
			 							}
		
	});

	$('#log-in-form').validate({
		rules: {
				 _username: {required: true},
				 _userpass:{required: true},
				 _keepMe:{required:true}
			 	},
			 	
		submitHandler: function(form) {
										var data= $('#log-in-form').serialize();
										$.post('doLogIn', data, function(res, est, jqXHR){
												if (res == '1') {alert("Log - in succesfull! shall we begin?");
																 setTimeout(function(){
																	 					window.location = "mydashboard.jsp"; 
																 					   }), 3000;}
												else{alert("credenciales incorrectas");}
												
										});
																				
									  }
	
		
	});
	
});