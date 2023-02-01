package com.example.demo.repo;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteRepo {
	
	public Estudiante buscarNombreQuery(String nombre);
	public Estudiante buscarApellidoQuery(String apellido);

}
