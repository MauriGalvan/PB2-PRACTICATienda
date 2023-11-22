package clases;

public class Servicio extends Admin implements Vendible{

	 Double precio;
	String fechaInicio;
	String fechaFin;
	public Servicio(String cuit, String nombre, Double precio, String fechaInicio, String fechaFin) {
		super(cuit, nombre);
		this.precio = precio;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}
	@Override
	public String getCodigo() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
