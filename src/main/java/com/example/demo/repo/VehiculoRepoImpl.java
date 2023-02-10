package com.example.demo.repo;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Vehiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class VehiculoRepoImpl implements IVehiculoRepo {

	@Autowired
	private EntityManager manager;

	// INSERTAR
	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.manager.persist(vehiculo);
	}

	// BUSQUEDA POR QUERIES
	// TYPED QUERIES
	@Override
	public List<Vehiculo> buscarPlacaTyped(String placa) {
		TypedQuery<Vehiculo> query = this.manager.createNamedQuery("Vehiculo.buscarPlaca", Vehiculo.class);
		query.setParameter("datoPlaca", placa);
		return query.getResultList();
	}

	@Override
	public List<Vehiculo> buscarModeloTyped(String modelo) {
		TypedQuery<Vehiculo> query = this.manager.createNamedQuery("Vehiculo.buscarModelo", Vehiculo.class);
		query.setParameter("datoModelo", modelo);
		return query.getResultList();
	}

	@Override
	public List<Vehiculo> buscarMarcaTyped(String marca) {
		TypedQuery<Vehiculo> query = this.manager.createNamedQuery("Vehiculo.buscarMarca", Vehiculo.class);
		query.setParameter("datoMarca", marca);
		return query.getResultList();
	}

	//NAMED QUERIES
	@Override
	public List<Vehiculo> buscarPlacaNamed(String placa) {
		Query query = this.manager.createNamedQuery("Vehiculo.buscarPlaca",Vehiculo.class);
		query.setParameter("datoPlaca", placa);
		return query.getResultList();
	}

	@Override
	public List<Vehiculo> buscarColorNamed(String color) {
		Query query = this.manager.createNamedQuery("Vehiculo.buscarColor",Vehiculo.class);
		query.setParameter("datoColor", color);
		return query.getResultList();
	}

	@Override
	public List<Vehiculo> buscarFullNamed(Boolean full) {
		Query query = this.manager.createNamedQuery("Vehiculo.buscarFull",Vehiculo.class);
		query.setParameter("datoFull", full);
		return query.getResultList();
	}
	
	//NATIVE  QUERIES
	@Override
	public List<Vehiculo> buscarPrecioNative(BigDecimal precio) {
		Query query = this.manager.createNativeQuery("select * from vehiculo where vehi_precio = :datoPrecio", Vehiculo.class);
		query.setParameter("datoPrecio", precio);
		return query.getResultList();
	}

	@Override
	public Vehiculo buscarBaratoNative(BigDecimal precio) {
		Query query = this.manager.createNativeQuery("select * from vehiculo where vehi_precio <= :datoPrecio", Vehiculo.class);
		query.setParameter("datoPrecio", precio);
		return (Vehiculo)query.getResultList().get(0);
	}

	@Override
	public Vehiculo buscarCaroNative(BigDecimal precio) {
		Query query = this.manager.createNativeQuery("select * from vehiculo where vehi_precio >= :datoPrecio", Vehiculo.class);
		query.setParameter("datoPrecio", precio);
		return (Vehiculo)query.getResultList().get(0);
	}

	//NATIVE NAMED QUERIES
	@Override
	public List<Vehiculo> buscarColorNamedNative(String color) {
		TypedQuery<Vehiculo> query = this.manager.createNamedQuery("Vehiculo.buscarColorNative", Vehiculo.class);
		query.setParameter("datoColor", color);
		return query.getResultList();
	}

	@Override
	public List<Vehiculo> buscarNumeroPuertasNamedNative(Integer numPuertas) {
		TypedQuery<Vehiculo> query = this.manager.createNamedQuery("Vehiculo.buscarNumPuertas", Vehiculo.class);
		query.setParameter("datoNumPuertas", numPuertas);
		return query.getResultList();
	}

	@Override
	public List<Vehiculo> buscarFullNamedNative(Boolean full) {
		TypedQuery<Vehiculo> query = this.manager.createNamedQuery("Vehiculo.buscarFullNative", Vehiculo.class);
		query.setParameter("datoFull", full);
		return query.getResultList();
	}

}
