package hibernate.bean;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="Viaje")
public class ViajeBean implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="Nro_Viaje")
	private int nroViaje;
	@ManyToOne
	@JoinColumn(name="usuarioID")
	private UsuarioBean usuarioID;
	private Date fechaDesde;
	private Date fechaHasta;
	private boolean estado;
	private String trayecto;
	private double tempLimite;
	@ManyToOne
	@JoinColumn(name="clienteID")
	private ClienteBean clienteID;
	private String camionPatente;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="dvBean")
    private DetalleViajeBean dvBean;
	public int getNroViaje() {
		return nroViaje;
	}
	public void setNroViaje(int nroViaje) {
		this.nroViaje = nroViaje;
	}
	public UsuarioBean getUsuarioID() {
		return usuarioID;
	}
	public void setUsuarioID(UsuarioBean usuarioID) {
		this.usuarioID = usuarioID;
	}
	public Date getFechaDesde() {
		return fechaDesde;
	}
	public void setFechaDesde(Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}
	public Date getFechaHasta() {
		return fechaHasta;
	}
	public void setFechaHasta(Date fechaHasta) {
		this.fechaHasta = fechaHasta;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public String getTrayecto() {
		return trayecto;
	}
	public void setTrayecto(String trayecto) {
		this.trayecto = trayecto;
	}
	public double getTempLimite() {
		return tempLimite;
	}
	public void setTempLimite(double tempLimite) {
		this.tempLimite = tempLimite;
	}
	public ClienteBean getClienteID() {
		return clienteID;
	}
	public void setClienteID(ClienteBean clienteID) {
		this.clienteID = clienteID;
	}
	public String getCamionPatente() {
		return camionPatente;
	}
	public void setCamionPatente(String camionPatente) {
		this.camionPatente = camionPatente;
	}
	public DetalleViajeBean getDvBean() {
		return dvBean;
	}
	public void setDvBean(DetalleViajeBean dvBean) {
		this.dvBean = dvBean;
	} 
	
	
	
}
