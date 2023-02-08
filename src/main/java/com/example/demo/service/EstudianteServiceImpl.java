package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.dto.EstudianteDTO;
import com.example.demo.repo.IEstudianteRepo;

@Service
public class EstudianteServiceImpl implements IEstudianteService{
	@Autowired
	private IEstudianteRepo estudianteRepo;

	@Override
	public List<Estudiante> buscarNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarNombreQueryList(nombre);
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
	public List<Estudiante> buscarGeneroTypedNamed(String genero) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarGeneroNamedQuerytypedList(genero);
	}

	@Override
	public List<Estudiante> buscarCedulaTypedNamedNative(String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarCedulaNativeQueryTypedNamedList(cedula);
	}

	@Override
	public Estudiante buscarCiudadNative(String ciudad) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarCiudadNativeQuery(ciudad);
	}

	@Override
	public Estudiante buscarNombreFirst(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarNombreQueryFirst(nombre);
	}

	@Override
	public EstudianteDTO buscarNombreTypedDTO(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarNombreTypedQueryDTO(nombre);
	}
	
	

}
