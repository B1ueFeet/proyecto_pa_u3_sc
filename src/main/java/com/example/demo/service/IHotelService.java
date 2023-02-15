package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Hotel;

public interface IHotelService {

	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion);

	public List<Hotel> buscarHotelOuterRightJoin(String tipoHabitacion);

	public List<Hotel> buscarHotelOuterLeftJoin(String tipoHabitacion);

	public List<Hotel> buscarHotelOuterFullJoin(String tipoHabitacion);

	public List<Hotel> buscarHotelWhereJoin(String tipoHabitacion);

	public List<Hotel> buscarHotelFetchJoin(String tipoHabitacion);

	public List<Hotel> buscarHotelOuterRightJoin();

	public List<Hotel> buscarHotelOuterLeftJoin();

	public List<Hotel> buscarHotelOuterFullJoin();
}
