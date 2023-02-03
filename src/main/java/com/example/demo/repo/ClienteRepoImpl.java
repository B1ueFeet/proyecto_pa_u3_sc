package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class ClienteRepoImpl implements IClienteRepo {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.manager.persist(cliente);
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.manager.merge(cliente);
	}

	@Override
	public Cliente buscar(Integer id) {
		// TODO Auto-generated method stub
		Cliente cliente = this.manager.find(Cliente.class, id);
		cliente.getRentas().size();
		return cliente;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.manager.remove(this.buscar(id));
	}

	@Override
	public Cliente buscarCedulaQuery(String cedula) {
		System.out.println("LLEGO AQUI");
		Query jpqlQuery = this.manager.createQuery("select e from Cliente e where e.cedula = :datoCedula");
		jpqlQuery.setParameter("datoCedula", cedula);
		return (Cliente) jpqlQuery.getSingleResult();
	}

}
