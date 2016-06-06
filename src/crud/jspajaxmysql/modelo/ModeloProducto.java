package crud.jspajaxmysql.modelo;

import java.sql.PreparedStatement;

import crud.jspajax.mysql.include.Producto;

public class ModeloProducto extends ModeloConexion {
	
	public boolean crearProducto(Producto prod){
		
		PreparedStatement pst= null; //MySQL Query that calls Stored Procedure "insertProducto"
		boolean flag= false; //to signal the success of the operation 
		
		try {	//Build MySQL query
				String sql= "call insertProducto(?,?,?,?,?,?,?,?,?,?,?,?,?)";
				pst= getConnection().prepareStatement(sql);
					pst.setString(1, prod.getNombre());
					pst.setString(2, prod.getDescripcion());
					pst.setFloat(3, prod.getPrecio());
					pst.setString(4, prod.getCategoria());
					pst.setString(5, prod.getDetalles());
					pst.setString(6, prod.getReviews());
					pst.setInt(7, prod.getSize());
					pst.setString(8, prod.getColor());
					pst.setString(9, prod.getImagen_1());
					pst.setString(10, prod.getImagen_2());
					pst.setString(11, prod.getImagen_3());
					pst.setString(12, prod.getImagen_4());
					pst.setString(13, prod.getImagen_5());
					//Execute and signal success
					if (pst.executeUpdate() == 1) { flag= true;	}
						
			} 
		catch (Exception e) {System.err.print(e.getMessage());}
		finally { //Close connection
					try {
							if (getConnection() != null) {getConnection().close();}
							if (pst != null){pst.close();}
						} 
					catch (Exception e2) {}
				}
		//Report success
		return flag;
	}
	
	
//	public static void main(String[] args){
//		ModeloProducto mp= new ModeloProducto();
//		Producto prod= new Producto(0, "aca_nombre", "aca_descripcion", "aca_categoria", 39.5f, "aca_detalles", "aca_reviews", 5, "aca_color", "img/p01/img_1.jpg", "img/p01/img_2.jpg", "img/p01/img_3.jpg", "img/p01/img_4.jpg", "img/p01/img_5.jpg");
//		System.out.println(prod.getId());
//		System.out.println(prod.getNombre());
//		System.out.println(mp.crearProducto(prod));
//	}
	
	
}
