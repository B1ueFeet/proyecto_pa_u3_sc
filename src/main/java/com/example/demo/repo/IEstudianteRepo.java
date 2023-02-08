package com.example.demo.repo;

import java.util.List;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.dto.EstudianteDTO;

public interface IEstudianteRepo {
	
	//insertar
	public void insertar(Estudiante estudiante);

	//BUSQUEDAS
	public Estudiante buscarNombreTypedQuery(String nombre);
	public Estudiante buscarApellidoNamedQuery(String apellido);
	public Estudiante buscarApellidoQuery(String apellido);
	public Estudiante buscarGeneroQuery(String genero);
	public Estudiante buscarCiudadQuery(String ciudad);
	public Estudiante buscarCiudadNativeQuery(String ciudad);
	public Estudiante buscarCedulaQuery(String cedula);
	//para varios
	public List<Estudiante> buscarNombreQueryList(String nombre);
	public Estudiante buscarNombreQueryFirst(String nombre);
	public List<Estudiante> buscarGeneroNamedQuerytypedList(String genero);
	public List<Estudiante> buscarCedulaNativeQueryTypedNamedList(String cedula);
	//DTO
	public EstudianteDTO buscarNombreTypedQueryDTO(String nombre);
}
