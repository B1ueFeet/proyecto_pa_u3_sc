package com.example.demo.modelo;

import java.math.BigDecimal;
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
@Table(name = "vehiculo")
public class Vehiculo {

	@Id
	@GeneratedValue(generator = "vehi_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "vehi_seq", sequenceName = "vehi_seq")
	@Column(name = "vehi_id")
	private Integer id;
	@Column(name = "vehi_precio")
	private BigDecimal precio;
	@Column(name = "vehi_marca")
	private String marca;
	@Column(name = "vehi_modelo")
	private String modelo;
	@Column(name = "vehi_placa")
	private String placa;

	// PRINCIPAL
	@OneToMany(mappedBy = "vehiculo")
	private List<Renta> rentas;

	// TO STRING
	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", precio=" + precio + ", marca=" + marca + ", modelo=" + modelo + ", placa="
				+ placa + "]";
	}

	// GETTER & SETTER
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public List<Renta> getRentas() {
		return rentas;
	}

	public void setRentas(List<Renta> rentas) {
		this.rentas = rentas;
	}

}
