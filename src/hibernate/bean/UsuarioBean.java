package hibernate.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Usuario")
public class UsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="usuarioID")
	private int idUsuario;
	@ManyToMany (cascade=CascadeType.ALL)
	private Set<PerfilesBean> perfiles = new HashSet<PerfilesBean>();
	@ManyToOne
	@JoinColumn(name="clienteID")
	private ClienteBean clienteBEAN;
	private boolean activo;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="usuarioID")
	private List<ViajeBean> viajes = new ArrayList<ViajeBean>();
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="usuarioID")
	private List<CamionBean> camiones = new ArrayList<CamionBean>();
	
	
	
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Set<PerfilesBean> getPerfiles() {
		return perfiles;
	}
	public void setPerfiles(Set<PerfilesBean> perfiles) {
		this.perfiles = perfiles;
	}
	public ClienteBean getClienteBEAN() {
		return clienteBEAN;
	}
	public void setClienteBEAN(ClienteBean clienteBEAN) {
		this.clienteBEAN = clienteBEAN;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public List<ViajeBean> getViajes() {
		return viajes;
	}
	public void setViajes(List<ViajeBean> viajes) {
		this.viajes = viajes;
	}
	public List<CamionBean> getCamiones() {
		return camiones;
	}
	public void setCamiones(List<CamionBean> camiones) {
		this.camiones = camiones;
	}
	
	
	
	
	

	
}
