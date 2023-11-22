package clases;

import java.util.HashMap;
import java.util.Map;

public class Venta implements Vendible{
	
private String codigo;
Cliente cliente;
Vendedor vendedor;
Producto producto;
Servicio servicio;
private Map<Producto, Integer> productosVendidos;
private Map<Servicio, Integer> servicioVendidos;
	public Venta(String codigo, Cliente cliente, Vendedor vendedor) {
		this.codigo = codigo;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.productosVendidos = new HashMap<Producto, Integer>();
		this.servicioVendidos = new HashMap<Servicio, Integer>();
		
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	@Override
	public String getCodigo() {
		// TODO Auto-generated method stub
		return codigo;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getPrecio() {
		// TODO Auto-generated method stub
		return null;
	}



	public Double getTotal() {
	Double total = 0.0;
	for (Producto producto : productosVendidos.keySet()) {
        int cantidad = productosVendidos.get(producto);
        total += producto.getPrecio() * cantidad;
    }
	for (Servicio servicio : servicioVendidos.keySet()) {
  
		Integer cantidad = servicioVendidos.get(servicio);
		        total -= servicio.getPrecio() * cantidad;
		    }
	  
	  return total;
//		Double totalProducto = producto.getPrecio();
//		Double totalServicio = servicio.getPrecio();
//		double total = totalProducto - totalServicio;
//		return total;
	}
	public void agregarProducto(Producto producto, Integer cantidad) {
        productosVendidos.put(producto, cantidad);
    }

	public boolean contieneProducto(Producto producto2, Integer cantidadVendida) {
		return productosVendidos.containsKey(producto) && productosVendidos.get(producto).equals(cantidadVendida);
	}


	

}
