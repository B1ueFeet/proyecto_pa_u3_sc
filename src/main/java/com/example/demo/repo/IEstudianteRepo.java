package com.example.demo.repo;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteRepo {
	
	//insertar
	public void insertar(Estudiante estudiante);

	
	public Estudiante buscarNombreQuery(String nombre);
	public Estudiante buscarApellidoQuery(String apellido);
	public Estudiante buscarGeneroQuery(String genero);
	public Estudiante buscarCiudadQuery(String ciudad);
	public Estudiante buscarCedulaQuery(String cedula);

}
