package crud.jspajaxmysql.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ModeloConexion {

	public ModeloConexion()
		{	
			try {
				 System.out.println("Opening SQLPipe....");
				 Class.forName(JClassName);
			     dbLink= DriverManager.getConnection(URL, dbUserName, dbPassword);
			     if (dbLink != null ) {System.out.println("SQLPipe successfully opened!");}
			     else {System.out.println("error while openening SQLPipe");}
			    } 
			catch (ClassNotFoundException e) 
				{System.err.println("ERROR: "+e.getMessage());}
			catch (SQLException e)
				{System.err.println("ERROR: "+e.getMessage());}
		}
	
	public Connection getConnection(){return dbLink;}
	
	//Connection Assets
	private String dbUserName= "tomcat";
	private String dbPassword= "tomcat";
	private String dbHostName= "localhost";
	private String dbHostPort= "3306";
	private String dbSchemaID= "comercio";
	private String JClassName= "com.mysql.jdbc.Driver";
	private String URL= "jdbc:mysql://"+dbHostName+":"+dbHostPort+"/"+dbSchemaID;
	private Connection dbLink;
}
