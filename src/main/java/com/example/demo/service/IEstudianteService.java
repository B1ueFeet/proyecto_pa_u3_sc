package com.example.demo.service;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteService {
	
	public Estudiante buscarNombre(String nombre);
	public Estudiante buscarApellido(String apellido);

}
