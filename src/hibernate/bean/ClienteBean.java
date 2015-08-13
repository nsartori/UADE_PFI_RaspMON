package hibernate.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;



@Entity
@Table(name="Cliente")
public class ClienteBean {

	@Id
	@GeneratedValue
	@Column(name="clienteID")
	private int IDCliente;
	@Column(name="Codigo_Cliente")
	private int codigoCliente;
	private String descripcion;
	@Column(name="Fecha_Alta")
	private Date fechaAlta;
	private boolean activo;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="clienteID")
	private List<UsuarioBean> Usuarios = new ArrayList<UsuarioBean>();
	
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="clienteID")
	private List<ViajeBean> viajes = new ArrayList<ViajeBean>();

	public int getIDCliente() {
		return IDCliente;
	}

	public void setIDCliente(int iDCliente) {
		IDCliente = iDCliente;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public List<UsuarioBean> getUsuarios() {
		return Usuarios;
	}

	public void setUsuarios(List<UsuarioBean> usuarios) {
		Usuarios = usuarios;
	}

	public List<ViajeBean> getViajes() {
		return viajes;
	}

	public void setViajes(List<ViajeBean> viajes) {
		this.viajes = viajes;
	}

	
	
}
