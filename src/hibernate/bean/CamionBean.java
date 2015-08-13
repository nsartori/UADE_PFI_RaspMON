package hibernate.bean;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Camion")
public class CamionBean implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private String patente;
	@ManyToMany (cascade=CascadeType.ALL)
	private Set<EquipoBean> raspberries = new HashSet<EquipoBean>();
	@ManyToOne
	@JoinColumn(name="usuarioID")
	private UsuarioBean usuarioID;
	private String descripcion;
	private boolean estado;
	@Column(name="Fecha_Alta")
	private Date fechaAlta;
	private int asociado;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idInspeccion")
	private List<InspeccionBean> inspecciones = new ArrayList<InspeccionBean>();
	
	
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public Set<EquipoBean> getRaspberries() {
		return raspberries;
	}
	public void setRaspberries(Set<EquipoBean> raspberries) {
		this.raspberries = raspberries;
	}
	public UsuarioBean getUsuarioID() {
		return usuarioID;
	}
	public void setUsuarioID(UsuarioBean usuarioID) {
		this.usuarioID = usuarioID;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public int getAsociado() {
		return asociado;
	}
	public void setAsociado(int asociado) {
		this.asociado = asociado;
	}
	public List<InspeccionBean> getInspecciones() {
		return inspecciones;
	}
	public void setInspecciones(List<InspeccionBean> inspecciones) {
		this.inspecciones = inspecciones;
	}
	
	
	
}
