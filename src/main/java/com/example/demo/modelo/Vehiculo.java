package com.example.demo.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@NamedQueries({
		@NamedQuery(name = "Vehiculo.buscarPlaca", query = "select e from Vehiculo e where e.placa = :datoPlaca"),
		@NamedQuery(name = "Vehiculo.buscarModelo", query = "select e from Vehiculo e where e.modelo = :datoModelo"),
		@NamedQuery(name = "Vehiculo.buscarMarca", query = "select e from Vehiculo e where e.marca = :datoMarca"),
		@NamedQuery(name = "Vehiculo.buscarColor", query = "select e from Vehiculo e where e.color = :datoColor"),
		@NamedQuery(name = "Vehiculo.buscarFull", query = "select e from Vehiculo e where e.full = :datoFull") })
@NamedNativeQueries({
		@NamedNativeQuery(name = "Vehiculo.buscarColorNative", query = "select * from vehiculo where vehi_color = :datoColor", resultClass = Vehiculo.class),
		@NamedNativeQuery(name = "Vehiculo.buscarNumPuertas", query = "select * from vehiculo where vehi_numero_puertas = :datoNumPuertas", resultClass = Vehiculo.class),
		@NamedNativeQuery(name = "Vehiculo.buscarFullNative", query = "select * from vehiculo where vehi_full = :datoFull", resultClass = Vehiculo.class) })
@Table(name = "vehiculo")
public class Vehiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vehi_seq")
	@SequenceGenerator(name = "vehi_seq", sequenceName = "vehi_seq", allocationSize = 1)
	@Column(name = "vehi_id")
	private Integer id;
	@Column(name = "vehi_marca")
	private String marca;
	@Column(name = "vehi_placa")
	private String placa;
	@Column(name = "vehi_modelo")
	private String modelo;
	@Column(name = "vehi_numero_puertas")
	private Integer numPuertas;
	@Column(name = "vehi_precio")
	private BigDecimal precio;
	@Column(name = "vehi_full")
	private Boolean full;
	@Column(name = "vehi_color")
	private String color;

	// GETTER & SETTER
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(Integer numPuertas) {
		this.numPuertas = numPuertas;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Boolean getFull() {
		return full;
	}

	public void setFull(Boolean full) {
		this.full = full;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Vehiculo: [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", color=" + color + "]";
	}

}
