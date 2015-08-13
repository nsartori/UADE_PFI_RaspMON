package hibernate.bean;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="Inspeccion")
public class InspeccionBean {
	@Id 
	@Column(name = "idInspeccion", insertable = false, updatable = false)
	private int IDInspeccion;
	private Date fechaInspeccion;
	private boolean estado;
	private String comentarios;
	@ManyToOne
	@JoinColumn(name="patente")
	private CamionBean camion;
	public int getIDInspeccion() {
		return IDInspeccion;
	}
	public void setIDInspeccion(int iDInspeccion) {
		IDInspeccion = iDInspeccion;
	}
	public Date getFechaInspeccion() {
		return fechaInspeccion;
	}
	public void setFechaInspeccion(Date fechaInspeccion) {
		this.fechaInspeccion = fechaInspeccion;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public CamionBean getCamion() {
		return camion;
	}
	public void setCamion(CamionBean camion) {
		this.camion = camion;
	}
	
	
}
