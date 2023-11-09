package ar.edu.unlam.Dominio;

import java.util.ArrayList;
import java.util.Objects;

import ar.edu.unlam.Exception.VendibleInexistenteException;

public class Tienda {

	private String cuit;
	private String nombre;
	private ArrayList<Producto> productos;
	private ArrayList<Cliente> clientes;

	public Tienda(String cuit, String nombre) {
		this.cuit = cuit;
		this.nombre = nombre;
		this.productos = new ArrayList<Producto>();
		this.clientes = new ArrayList<Cliente>();
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarProducto(Producto producto) throws VendibleInexistenteException {
		Tienda tienda = new Tienda("", "");
		if (producto.getCodigo().equals((Producto) tienda.getVendible(producto.getCodigo())))
			productos.add(producto);
		throw new VendibleInexistenteException();

	}

	public void agregarProducto(Producto producto, Integer cantidad) throws VendibleInexistenteException{
		Tienda tienda = new Tienda("", "");
		if (producto.getCodigo().equals((Producto) tienda.getVendible(producto.getCodigo())))
			producto.setStock(producto.getStock() + cantidad);
		throw new VendibleInexistenteException();

	}
	

	@Override
	public int hashCode() {
		return Objects.hash(cuit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tienda other = (Tienda) obj;
		return Objects.equals(cuit, other.cuit);
	}

	public Producto getVendible(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	public void agregarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	

}
