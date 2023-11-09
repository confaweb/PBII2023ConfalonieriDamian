package ar.edu.unlam.Dominio;

import java.util.Objects;

public class Cliente {

	private String cuitCliente;
	private Object nombreYApellido;

	public Cliente(String cuitCliente, String nombre) {
		this.cuitCliente=cuitCliente;
		this.nombreYApellido=nombreYApellido;
	}

	public String getCuitCliente() {
		return cuitCliente;
	}

	public void setCuitCliente(String cuitCliente) {
		this.cuitCliente = cuitCliente;
	}

	public Object getNombreYApellido() {
		return nombreYApellido;
	}

	public void setNombreYApellido(Object nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cuitCliente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cuitCliente, other.cuitCliente);
	}
	

}
