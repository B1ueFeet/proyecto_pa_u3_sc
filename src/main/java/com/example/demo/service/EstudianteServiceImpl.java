package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Estudiante;
import com.example.demo.repo.IEstudianteRepo;

@Service
public class EstudianteServiceImpl implements IEstudianteService{
	@Autowired
	private IEstudianteRepo estudianteRepo;

	@Override
	public Estudiante buscarNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarNombreQuery(nombre);
	}

	@Override
	public Estudiante buscarApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarApellidoQuery(apellido);
	}

	@Override
	public Estudiante buscarGenero(String genero) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarGeneroQuery(genero);
	}

	@Override
	public Estudiante buscarCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarCedulaQuery(cedula);
	}

	@Override
	public Estudiante buscarCiudad(String ciudad) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarCiudadQuery(ciudad);
	}

	@Override
	public void crear(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepo.insertar(estudiante);
	}

	@Override
	public Estudiante buscarNombreTyped(String nombre) {
		// TODO Auto-generated method stub
		
		return this.estudianteRepo.buscarNombreTypedQuery(nombre);
	}

	@Override
	public Estudiante buscarApellidoNamed(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarApellidoNamedQuery(apellido);
	}

	@Override
	public Estudiante buscarGeneroTypedNamed(String genero) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarGeneroNamedQuerytyped(genero);
	}

	@Override
	public Estudiante buscarCedulaTypedNamedNative(String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarCedulaNativeQueryTypedNamed(cedula);
	}

	@Override
	public Estudiante buscarCiudadNative(String ciudad) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarCiudadNativeQuery(ciudad);
	}
	
	

}