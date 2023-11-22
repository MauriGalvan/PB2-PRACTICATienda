package clases;

public class Producto implements Vendible {
	String codigo;
	String nombre;
	Double precio;
	Integer cantidad;
	public Producto(String codigo, String nombre, Double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}


	
	public Producto(Producto producto2, Integer cantidad) {
		this.cantidad = cantidad;
		
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public void setPrecio(Double precio) {
		this.precio = precio;
	}



	@Override
	public String getCodigo() {
		// TODO Auto-generated method stub
		return codigo;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public Double getPrecio() {
		// TODO Auto-generated method stub
		return precio;
	}

}
