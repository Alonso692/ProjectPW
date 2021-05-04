package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.Max;
//import javax.validation.constraints.Min;

@Entity
@Table(name="colaboradores")
public class Colaborador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idColaborador;
	
	@Column(name="nombreCompleto", nullable=false, length = 45)
	private String nombreCompleto;
	
	//@Max(200)
	//@Min(50)
	
	@Column(name="peso")
	private double peso;
	
	//@Max(2)
	//@Min(1)
	@Column(name="talla")
	private double talla;

	public Colaborador() {
		super();
	}

	public Colaborador(int idColaborador, String nombreCompleto, 
			double peso, double talla) {
		super();
		this.idColaborador = idColaborador;
		this.nombreCompleto = nombreCompleto;
		this.peso = peso;
		this.talla = talla;
	}

	public int getIdColaborador() {
		return idColaborador;
	}

	public void setIdColaborador(int idColaborador) {
		this.idColaborador = idColaborador;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getTalla() {
		return talla;
	}

	public void setTalla(double talla) {
		this.talla = talla;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idColaborador;
		result = prime * result + ((nombreCompleto == null) ? 0 : nombreCompleto.hashCode());
		long temp;
		temp = Double.doubleToLongBits(peso);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(talla);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Colaborador other = (Colaborador) obj;
		if (idColaborador != other.idColaborador)
			return false;
		if (nombreCompleto == null) {
			if (other.nombreCompleto != null)
				return false;
		} else if (!nombreCompleto.equals(other.nombreCompleto))
			return false;
		if (Double.doubleToLongBits(peso) != Double.doubleToLongBits(other.peso))
			return false;
		if (Double.doubleToLongBits(talla) != Double.doubleToLongBits(other.talla))
			return false;
		return true;
	}
	
	
	
	

}
