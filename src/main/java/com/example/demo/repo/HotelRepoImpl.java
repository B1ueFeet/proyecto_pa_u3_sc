package com.example.demo.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HotelRepoImpl implements IHotelRepo{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> query = this.entityManager.
				createQuery("SELECT h FROM Hotel h INNER JOIN h.habitaciones ha WHERE ha.tipoHabitacion = :datoTipo", Hotel.class);
		query.setParameter("datoTipo", tipoHabitacion);
		List<Hotel> list = query.getResultList();
		//BAJO DEMANDA
		list.forEach(a -> a.getHabitaciones().size());
		
		return list;
	}

	@Override
	public List<Hotel> buscarHotelOuterRightJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> query = this.entityManager.
				createQuery("SELECT h FROM Hotel h RIGHT JOIN h.habitaciones ha WHERE ha.tipoHabitacion = :datoTipo", Hotel.class);
		query.setParameter("datoTipo", tipoHabitacion);
		List<Hotel> list = query.getResultList();
		//list.forEach(a -> a.getHabitaciones().size());
		
		return list;
	}

	@Override
	public List<Hotel> buscarHotelOuterLeftJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> query = this.entityManager.
				createQuery("SELECT h FROM Hotel h LEFT JOIN h.habitaciones ha WHERE ha.tipoHabitacion = :datoTipo", Hotel.class);
		query.setParameter("datoTipo", tipoHabitacion);
		List<Hotel> list = query.getResultList();
		list.forEach(a -> a.getHabitaciones().size());
		
		return list;
	}

	@Override
	public List<Hotel> buscarHotelOuterFullJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> buscarHotelWhereJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> buscarHotelFetchJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}
}
