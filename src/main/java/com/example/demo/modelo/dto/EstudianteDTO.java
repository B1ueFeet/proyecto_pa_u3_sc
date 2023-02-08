package com.example.demo.modelo.dto;

public class EstudianteDTO {

	private String nombre;
	private String apellido;
	private String cedula;
	
	//CONSTRUCTOR
	public EstudianteDTO (){}
	
	public EstudianteDTO(String nombre, String apellido, String cedula) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
	}
	
	//TO STRING
	
	@Override
	public String toString() {
		return "EstudianteDTO [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + "]";
	}

	//GETTER & SETTER
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	
	
	

}
