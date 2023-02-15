package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Habitacion;
import com.example.demo.repo.IHabitacionRepo;

@Service
public class HabitacionServiceImpl implements IHabitacionService{
	
	@Autowired
	private IHabitacionRepo habitacionRepo;

	@Override
	public List<Habitacion> buscarHotelInnerJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.habitacionRepo.buscarHotelInnerJoin(tipoHabitacion);
	}

	@Override
	public List<Habitacion> buscarHotelOuterRightJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.habitacionRepo.buscarHotelOuterRightJoin(tipoHabitacion);
	}

	@Override
	public List<Habitacion> buscarHotelOuterLeftJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.habitacionRepo.buscarHotelOuterLeftJoin(tipoHabitacion);
	}

	@Override
	public List<Habitacion> buscarHotelOuterFullJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.habitacionRepo.buscarHotelOuterFullJoin(tipoHabitacion);
	}

	@Override
	public List<Habitacion> buscarHotelWhereJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.habitacionRepo.buscarHotelWhereJoin(tipoHabitacion);
	}

	@Override
	public List<Habitacion> buscarHotelFetchJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.habitacionRepo.buscarHotelFetchJoin(tipoHabitacion);
	}

	@Override
	public List<Habitacion> buscarHotelOuterRightJoin() {
		// TODO Auto-generated method stub
		return this.habitacionRepo.buscarHotelOuterRightJoin();
	}

	@Override
	public List<Habitacion> buscarHotelOuterLeftJoin() {
		// TODO Auto-generated method stub
		return this.habitacionRepo.buscarHotelOuterLeftJoin();
	}

	@Override
	public List<Habitacion> buscarHotelOuterFullJoin() {
		// TODO Auto-generated method stub
		return this.habitacionRepo.buscarHotelOuterFullJoin();
	}

}
