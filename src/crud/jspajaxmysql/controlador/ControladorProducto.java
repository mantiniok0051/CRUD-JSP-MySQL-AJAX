/**
 * 
 */
package crud.jspajaxmysql.controlador;

import crud.jspajax.mysql.include.Producto;
import crud.jspajaxmysql.modelo.ModeloProducto;

/**
 * @author MARIANO
 *
 */
public class ControladorProducto {
	
	
	public boolean crearProducto(Producto p){
		ModeloProducto modeloP= new ModeloProducto();
		return modeloP.crearProducto(p);}
		

}
