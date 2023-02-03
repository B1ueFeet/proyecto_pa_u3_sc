package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Renta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class RentaRepoImpl implements IRentaRepo{

	
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public void insertar(Renta renta) {
		// TODO Auto-generated method stub
		this.manager.persist(renta);
	}

	@Override
	public void actualizar(Renta renta) {
		// TODO Auto-generated method stub
		this.manager.merge(renta);
	}

	@Override
	public Renta buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.manager.find(Renta.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.manager.remove(this.buscar(id));
	}
	
	
	
}
