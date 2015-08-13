package hibernate.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Perfiles")
public class PerfilesBean implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int IDPerfil;
	private String descripcion;
	private String tipo;
	@ManyToMany(mappedBy="perfiles")
	private Set<UsuarioBean> usuarios = new HashSet<UsuarioBean>();
	
	public int getIDPerfil() {
		return IDPerfil;
	}
	public void setIDPerfil(int iDPerfil) {
		IDPerfil = iDPerfil;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Set<UsuarioBean> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Set<UsuarioBean> usuarios) {
		this.usuarios = usuarios;
	}
	
	
}
