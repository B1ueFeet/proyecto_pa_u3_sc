package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Vehiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class VehiculoRepoImpl implements IVehiculoRepo {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.manager.persist(vehiculo);

	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.manager.merge(vehiculo);
	}

	@Override
	public Vehiculo buscar(Integer id) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo = this.manager.find(Vehiculo.class, id);
		vehiculo.getRentas().size();
		return vehiculo;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.manager.remove(this.buscar(id));
	}

	@Override
	public Vehiculo buscarPlacaQuery(String placa) {
		// TODO Auto-generated method stub

		Query jpqlQuery = this.manager.createQuery("select e from Vehiculo e where e.placa = :datoPlaca");
		jpqlQuery.setParameter("datoPlaca", placa);
		return (Vehiculo) jpqlQuery.getSingleResult();
	}

}
