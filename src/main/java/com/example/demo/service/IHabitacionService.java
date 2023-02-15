package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Habitacion;

public interface IHabitacionService {
	
	public List<Habitacion> buscarHotelInnerJoin(String tipoHabitacion);

	public List<Habitacion> buscarHotelOuterRightJoin(String tipoHabitacion);

	public List<Habitacion> buscarHotelOuterLeftJoin(String tipoHabitacion);

	public List<Habitacion> buscarHotelOuterFullJoin(String tipoHabitacion);

	public List<Habitacion> buscarHotelWhereJoin(String tipoHabitacion);

	public List<Habitacion> buscarHotelFetchJoin(String tipoHabitacion);

	//

	public List<Habitacion> buscarHotelOuterRightJoin();

	public List<Habitacion> buscarHotelOuterLeftJoin();

	public List<Habitacion> buscarHotelOuterFullJoin();

}
