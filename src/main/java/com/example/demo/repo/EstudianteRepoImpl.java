package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class EstudianteRepoImpl implements IEstudianteRepo{
	
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public Estudiante buscarNombreQuery(String nombre) {
		// TODO Auto-generated method stub
		//select * from estudiante where estu_nombre = 'Edison'
		//select e from Estudainte e where e.nombre = :datoNombre
		Query jpqlQuery = this.manager.
				createQuery("select e from Estudiante e where e.nombre = :datoNombre");
		jpqlQuery.setParameter("datoNombre", nombre);
		//retorna Genericos y hay que hacer un CAST
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarApellidoQuery(String apellido) {
		// TODO Auto-generated method stub
		//select e from Estudainte e where e.nombre = :datoNombre
		Query jpqlQuery = this.manager.
				createQuery("select e from Estudiante e where e.apellido = :datoApellido");
		jpqlQuery.setParameter("datoApellido", apellido);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.manager.persist(estudiante);
		
	}

	@Override
	public Estudiante buscarGeneroQuery(String genero) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.manager.
				createQuery("select e from Estudiante e where e.genero = :datoGenero");
		jpqlQuery.setParameter("datoGenero", genero);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarCiudadQuery(String ciudad) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.manager.
				createQuery("select e from Estudiante e where e.ciudad = :datoCiudad");
		jpqlQuery.setParameter("datoCiudad", ciudad);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarCedulaQuery(String cedula) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.manager.
				createQuery("select e from Estudiante e where e.cedula = :datoCedula");
		jpqlQuery.setParameter("datoCedula", cedula);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

}
