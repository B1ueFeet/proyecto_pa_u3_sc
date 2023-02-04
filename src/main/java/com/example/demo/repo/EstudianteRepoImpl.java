package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class EstudianteRepoImpl implements IEstudianteRepo {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Estudiante buscarNombreQuery(String nombre) {
		// TODO Auto-generated method stub
		// select * from estudiante where estu_nombre = 'Edison'
		// select e from Estudainte e where e.nombre = :datoNombre
		Query jpqlQuery = this.manager.createQuery("select e from Estudiante e where e.nombre = :datoNombre");
		jpqlQuery.setParameter("datoNombre", nombre);
		// retorna Genericos y hay que hacer un CAST
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarApellidoQuery(String apellido) {
		// TODO Auto-generated method stub
		// select e from Estudainte e where e.nombre = :datoNombre
		Query jpqlQuery = this.manager.createQuery("select e from Estudiante e where e.apellido = :datoApellido");
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
		Query jpqlQuery = this.manager.createQuery("select e from Estudiante e where e.genero = :datoGenero");
		jpqlQuery.setParameter("datoGenero", genero);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarCiudadQuery(String ciudad) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.manager.createQuery("select e from Estudiante e where e.ciudad = :datoCiudad");
		jpqlQuery.setParameter("datoCiudad", ciudad);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarCedulaQuery(String cedula) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.manager.createQuery("select e from Estudiante e where e.cedula = :datoCedula");
		jpqlQuery.setParameter("datoCedula", cedula);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarNombreTypedQuery(String nombre) {
		// TODO Auto-generated method stub

		TypedQuery<Estudiante> typedQuery = this.manager
				.createQuery("select e from Estudiante e where e.nombre = :datoNombre", Estudiante.class);
		typedQuery.setParameter("datoNombre", nombre);
		return typedQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarApellidoNamedQuery(String apellido) {
		// TODO Auto-generated method stub

		Query query = this.manager.createNamedQuery("Estudiante.buscarPorApellido");
		query.setParameter("datoApellido", apellido);
		return (Estudiante) query.getSingleResult();
	}

	@Override
	public Estudiante buscarGeneroNamedQuerytyped(String genero) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> query = this.manager.createNamedQuery("Estudiante.buscarPorGenero", Estudiante.class);
		query.setParameter("datoGenero", genero);
		return query.getSingleResult();
	}

	@Override
	public Estudiante buscarCiudadNativeQuery(String ciudad) {
		// TODO Auto-generated method stub
		Query query = this.manager.createNativeQuery("select * from estudiante where estu_ciudad = :datoCiudad",Estudiante.class);
		query.setParameter("datoCiudad", ciudad);
		return (Estudiante) query.getSingleResult();
	}

	@Override
	public Estudiante buscarCedulaNativeQueryTypedNamed(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> query = this.manager.createNamedQuery("Estudiante.buscarPorCedula", Estudiante.class);
		query.setParameter("datoCedula", cedula);
		return query.getSingleResult();
	}

}