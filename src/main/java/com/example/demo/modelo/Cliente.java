package com.example.demo.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(generator = "clie_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "clie_seq", sequenceName = "clie_seq")
	@Column(name = "clie_id")
	private Integer id;
	@Column(name = "clie_nombre")
	private String nombre;
	@Column(name = "clie_cedula")
	private String cedula;
	@Column(name = "clie_tarjeta")
	private String tarjeta;
	@Column(name = "clie_apellido")
	private String apellido;

	// SECUNDARIA
	@OneToMany(mappedBy = "cliente")
	private List<Renta> rentas;

	// TO STRING
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", cedula=" + cedula + ", tarjeta=" + tarjeta
				+ ", apellido=" + apellido + "]";
	}

	// GETTER & SETTER
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(String tarjeta) {
		this.tarjeta = tarjeta;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public List<Renta> getRentas() {
		return rentas;
	}

	public void setRentas(List<Renta> rentas) {
		this.rentas = rentas;
	}

}
