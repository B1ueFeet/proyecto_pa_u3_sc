package com.example.demo.service;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteService {
	
	public Estudiante buscarNombre(String nombre);
	public Estudiante buscarNombreTyped(String nombre);
	public Estudiante buscarApellido(String apellido);
	public Estudiante buscarApellidoNamed(String apellido);
	public Estudiante buscarGenero(String genero);
	public Estudiante buscarGeneroTypedNamed(String genero);
	public Estudiante buscarCedula(String cedula);
	public Estudiante buscarCedulaTypedNamedNative(String cedula);
	public Estudiante buscarCiudad(String ciudad);
	public Estudiante buscarCiudadNative(String ciudad);
	public void crear (Estudiante estudiante);


}
