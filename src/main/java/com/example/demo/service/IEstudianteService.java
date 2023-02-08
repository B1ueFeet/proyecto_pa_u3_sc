package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.dto.EstudianteDTO;

public interface IEstudianteService {
	
	public List<Estudiante> buscarNombre(String nombre);
	
	public Estudiante buscarNombreFirst(String nombre);
	public Estudiante buscarNombreTyped(String nombre);
	public EstudianteDTO buscarNombreTypedDTO(String nombre);
	public Estudiante buscarApellido(String apellido);
	public Estudiante buscarApellidoNamed(String apellido);
	public Estudiante buscarGenero(String genero);
	public List<Estudiante> buscarGeneroTypedNamed(String genero);
	public Estudiante buscarCedula(String cedula);
	public List<Estudiante> buscarCedulaTypedNamedNative(String cedula);
	public Estudiante buscarCiudad(String ciudad);
	public Estudiante buscarCiudadNative(String ciudad);
	public void crear (Estudiante estudiante);


}
