package crud.jspajaxmysql.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
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
import org.apache.commons.io.*;

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
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		
		if (!isMultipart) {
				PrintWriter writer = response.getWriter();
				writer.println("Error: Form must has enctype=multipart/form-data.");
				writer.flush();
				return;			
			 } 
		else {
			 		response.setContentType("text/html;charset=UTF-8");		
					FileItemFactory filefactory = new DiskFileItemFactory();
					ServletFileUpload sfu = new ServletFileUpload(filefactory);
					
					
					
					try {
							@SuppressWarnings("rawtypes")
							List items= sfu.parseRequest(request);
							for (Object object : items) {
									FileItem item= (FileItem) object;
									if (item.isFormField()) {
											campos.add(item.getString());
											System.out.println(campos.size()+" "+item.getFieldName()+":: "+item.getString());
										} 
									else { System.out.println(item.getName());
											ProcessImageFile(item);	
										  }
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
	
	}
		
	private static void ProcessImageFile(FileItem item){
		String filename= null;
		String fileName = item.getName();
		 if (fileName != null) {
		     filename = FilenameUtils.getName(fileName);
		 }
		 System.out.println(filename);
		File archivo= new File(imgs_base_url+filename);		
		imgs.add("img/product_catalog/"+filename);
		System.out.println(imgs.size());
			try {
					item.write(archivo);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	private static ArrayList<String> campos= new ArrayList<>();
	private static ArrayList<String> imgs= new ArrayList<>();
	private static final int MAX_FILE_SIZE 		= 1024 * 1024 * 40; // 40MB
	private static String imgs_base_url= "C:\\Users\\MARIANO\\workspace\\web\\CRUD-JSP-MySQL-AJAX\\WebContent\\img\\product_catalog\\";
}


