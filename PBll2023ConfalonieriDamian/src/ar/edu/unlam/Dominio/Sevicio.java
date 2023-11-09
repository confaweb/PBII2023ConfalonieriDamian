package ar.edu.unlam.Dominio;

public class Sevicio implements Vendible {
	private String codigo;
	private String nombre;
	private Double precio;

	public Sevicio(String codigo, String nombre, Double precio) {
		this.codigo=codigo;
		this.nombre=nombre;
		this.precio=precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	

}
