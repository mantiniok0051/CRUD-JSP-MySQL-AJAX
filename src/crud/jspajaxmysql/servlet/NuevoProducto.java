package crud.jspajaxmysql.servlet;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import crud.jspajax.mysql.include.Producto;
//import org.apache.tomcat.util.http.fileupload.FileItemFactory;
//import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
//import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import crud.jspajaxmysql.controlador.ControladorProducto;

/**
 * Servlet implementation class NuevoProducto
 */
@SuppressWarnings("unused")
@WebServlet("/crearproducto")
public class NuevoProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NuevoProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF8");
		
		FileItemFactory filefactory = new DiskFileItemFactory();
		ServletFileUpload sfu = new ServletFileUpload(filefactory);
		
		ArrayList<String> campos= new ArrayList<>();
		ArrayList<String> imgs= new ArrayList<>();
		
		try {
				@SuppressWarnings("rawtypes")
				List items= sfu.parseRequest(request);
				System.out.println(items.size());
				for (int i = 0; i < items.size(); i++) {
					FileItem item= (FileItem) items.get(i);
					if (!item.isFormField()) {	
												imgs.add("img/product_catalog/"+item.getName());
												System.out.println(imgs.size());
												File archivo= new File(imgs_base_url+item.getName());
												item.write(archivo);												
											}
					else{campos.add(item.getString());
						 System.out.println(campos.size());}
				}
			} 
		catch (Exception e) {// TODO: handle exception
			}
		//Producto p= new Producto(id, nombre,        descripcion,   categoria,     precio,                         detalles,      reviews,       size,                            color,         imagen_1,    imagen_2,    imagen_3,    imagen_4,    imagen_5)
		Producto p= new Producto(0,
				campos.get(0),
				campos.get(1),
				campos.get(3),
				Float.parseFloat(campos.get(2)),
				campos.get(4), campos.get(5),
				Integer.parseInt(campos.get(6)),
				campos.get(7),
				imgs.get(0),
				imgs.get(1),
				imgs.get(2),
				imgs.get(3),
				imgs.get(4)) ;
		ControladorProducto ctrl= new ControladorProducto();
		if (ctrl.crearProducto(p)) {response.getWriter().println("El producto ha sido exitosamente registrado");	}
		else{response.getWriter().println("Error durante el registro del producto");}
	}
	
		private static String imgs_base_url= "C:\\Users\\MARIANO\\workspace\\web\\CRUD-JSP-MySQL-AJAX\\WebContent\\img\\product_catalog\\";
}


