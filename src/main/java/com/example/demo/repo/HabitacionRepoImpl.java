package com.example.demo.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Habitacion;
import com.example.demo.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class HabitacionRepoImpl implements IHabitacionRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Habitacion> buscarHotelInnerJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Habitacion> buscarHotelOuterRightJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Habitacion> buscarHotelOuterLeftJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Habitacion> buscarHotelOuterFullJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Habitacion> buscarHotelWhereJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Habitacion> buscarHotelFetchJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Habitacion> buscarHotelOuterRightJoin() {
		TypedQuery<Habitacion> query = this.entityManager.createQuery("SELECT ha FROM Hotel h RIGHT JOIN h.habitaciones ha ",	Habitacion.class);
		List<Habitacion> list = query.getResultList();
		//list.forEach(a -> a.getHabitaciones().size());
		return list;
	}

	@Override
	public List<Habitacion> buscarHotelOuterLeftJoin() {
		TypedQuery<Habitacion> query = this.entityManager.createQuery("SELECT ha FROM Hotel h LEFT JOIN h.habitaciones ha ",	Habitacion.class);
		List<Habitacion> list = query.getResultList();
		//list.forEach(a -> a.getHabitaciones().size());
		return list;
	}

	@Override
	public List<Habitacion> buscarHotelOuterFullJoin() {
		// TODO Auto-generated method stub
		return null;
	}

}
