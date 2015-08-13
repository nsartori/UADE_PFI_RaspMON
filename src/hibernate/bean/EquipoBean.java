package hibernate.bean;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Equipo")
public class EquipoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int idRaspi;
	private int codigo;
	private String descripcion;
	private boolean activo;
	@ManyToMany(mappedBy="raspberries")
	private Set<CamionBean> camiones = 	new HashSet<CamionBean>();
	public int getIdRaspi() {
		return idRaspi;
	}
	public void setIdRaspi(int idRaspi) {
		this.idRaspi = idRaspi;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public Set<CamionBean> getCamiones() {
		return camiones;
	}
	public void setCamiones(Set<CamionBean> camiones) {
		this.camiones = camiones;
	}	

	
}
