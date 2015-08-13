package hibernate.bean;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="Detalle_Viaje")
public class DetalleViajeBean implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private int idDViaje;
	private double temperatura;
	private double humedad;
	@OneToOne (mappedBy="dvBean")
	private ViajeBean viaje;
	public int getIdDViaje() {
		return idDViaje;
	}
	public void setIdDViaje(int idDViaje) {
		this.idDViaje = idDViaje;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public double getHumedad() {
		return humedad;
	}
	public void setHumedad(double humedad) {
		this.humedad = humedad;
	}
	public ViajeBean getViaje() {
		return viaje;
	}
	public void setViaje(ViajeBean viaje) {
		this.viaje = viaje;
	}

	
	
}
