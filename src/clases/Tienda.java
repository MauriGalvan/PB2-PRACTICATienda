package clases;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;



public class Tienda extends Admin {
	String CuitTienda;
	String nombreTienda;
	private Set<Producto> productos;
	Producto producto;
	private Set<Cliente> clientes;
	private Set<Vendedor> vendedores;
	private Set<Venta> ventas;
	private Map<String,Producto> productoAlAVenta;
	private Map<Producto,Integer> stock;
	private Set<Servicio> servicios;
	private Map<String, Servicio> servicioAlaVenta;
	

	public Tienda(String CuitTienda, String nombreTienda) {
		super(CuitTienda, nombreTienda);
		this.productos = new HashSet<Producto>();
		this.stock = new HashMap<Producto, Integer>();
		this.clientes = new HashSet<Cliente>();
		this.vendedores = new HashSet<Vendedor>();
		this.ventas = new HashSet<Venta>();
		this.productoAlAVenta = new HashMap<String, Producto>();
		this.servicios = new HashSet<Servicio>();
		this.servicioAlaVenta = new HashMap<String, Servicio>();
				}

	

	public String getCuitTienda() {
		return CuitTienda;
	}

	public void setCuitTienda(String cuitTienda) {
		CuitTienda = cuitTienda;
	}

	public String getNombreTienda() {
		return nombreTienda;
	}

	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}

	public void agregarProducto(Producto producto) {
		productos.add(producto);
		
	}

	public Vendible getVendible(String codigo) throws VendibleInexistenteException {
		for (Producto producto : productos) {
			if(producto.getCodigo().equals(codigo)){
				return producto;
			}
		}
		throw new VendibleInexistenteException();
	}

	public void agregarProducto(Producto producto2, Integer cantidad) {
		
		stock.put(producto2, cantidad);
	
	}



	public Integer getStock(Producto producto2) {
		// TODO Auto-generated method stub
		return stock.get(producto2);
	}



	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
		
	}



	public Cliente getCliente(String cuitEjemplo) throws ClienteInexistenteException {
		for (Cliente cliente : clientes) {
			if(cliente.getCuit().equals(cuitEjemplo)) {
				return cliente;
			}
		}
		throw new ClienteInexistenteException();
	}



	public void agregarVendedor(Vendedor vendedor) {
			vendedores.add(vendedor);
		
	}

	


	public Vendedor getVendedor(String dniEjemplo) throws VendedorInexistenteException {
		for (Vendedor vendedor : vendedores) {
			if(vendedor.getCuit().equals(dniEjemplo)) {
				return vendedor;
			}
		}
		throw new VendedorInexistenteException();
	}



	public void agregarVenta(Venta ticket) {
		ventas.add(ticket);
		
	}



	public void agregarProductoAVenta(String codigo, Producto producto2, Integer cantidadVendida) throws StockInsuficienteException {
		
//		if(cantidadVendida < stock.get(producto2)) {
//			cantidadVendida =cantidadVendida - stock.get(producto2);
//			productoAlAVenta.put(codigo, new Producto(producto2,cantidadVendida));
//		}else {
//		throw new StockInsuficienteException();
//		}
		 if (cantidadVendida <= stock.get(producto2)) {
		        int nuevoStock = stock.get(producto2) - cantidadVendida;
		        stock.put(producto2, nuevoStock);
		        productoAlAVenta.put(codigo, new Producto(producto2, cantidadVendida));
		    } else {
		        throw new StockInsuficienteException();
		    }
		
	}



	public void agregarServicio(Servicio servicio) {
		servicios.add(servicio);
		
	}



	public void agregarServicioAVenta(String codigo, Servicio servicio) {
	
	this.servicioAlaVenta.put(codigo, servicio);

	


}
}
