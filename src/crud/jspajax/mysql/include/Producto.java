package crud.jspajax.mysql.include;

public class Producto {

	
	
	public Producto(){}

	
	public Producto(int id, String nombre, String descripcion, String categoria, float precio, String detalles,
			String reviews, int size, String color, String imagen_1, String imagen_2, String imagen_3, String imagen_4,
			String imagen_5) {
								super();
								this.id = id;
								this.nombre = nombre;
								this.descripcion = descripcion;
								this.categoria = categoria;
								this.precio = precio;
								this.detalles = detalles;
								this.reviews = reviews;
								this.size = size;
								this.color = color;
								this.imagen_1 = imagen_1;
								this.imagen_2 = imagen_2;
								this.imagen_3 = imagen_3;
								this.imagen_4 = imagen_4;
								this.imagen_5 = imagen_5;
							}
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	
	public String getDescripcion() {return descripcion;}
	public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
	
	public String getCategoria() {return categoria;}
	public void setCategoria(String categoria) {this.categoria = categoria;}
	
	public float getPrecio() {return precio;}
	public void setPrecio(float precio) {this.precio = precio;}
	
	public String getDetalles() {return detalles;}
	public void setDetalles(String detalles) {this.detalles = detalles;}
	
	public String getReviews() {return reviews;}
	public void setReviews(String reviews) {this.reviews = reviews;}
	
	public int getSize() {return size;}
	public void setSize(int size) {this.size = size;}
	
	public String getColor() {return color;}
	public void setColor(String color) {this.color = color;}
	
	public String getImagen_1() {return imagen_1;}
	public void setImagen_1(String imagen_1) {this.imagen_1 = imagen_1;}
	
	public String getImagen_2() {return imagen_2;}
	public void setImagen_2(String imagen_2) {this.imagen_2 = imagen_2;}
	
	public String getImagen_3() {return imagen_3;}
	public void setImagen_3(String imagen_3) {this.imagen_3 = imagen_3;}
	
	public String getImagen_4() {return imagen_4;}
	public void setImagen_4(String imagen_4) {this.imagen_4 = imagen_4;}
	
	public String getImagen_5() {return imagen_5;}
	public void setImagen_5(String imagen_5) {this.imagen_5 = imagen_5;}
	
	
	//Class members
	private int id;
	private String nombre;
	private String descripcion;
	private String categoria;
	private float precio;
	private String detalles;
	private String reviews;
	private int size;
	private String color;
	private String imagen_1;
	private String imagen_2;
	private String imagen_3;
	private String imagen_4;
	private String imagen_5;
}
