package com.example.demo.service;

import com.example.demo.modelo.Vehiculo;

public interface IVehiculoService {

	public void crear(Vehiculo vehiculo);

	public void editar(Vehiculo vehiculo);

	public Vehiculo encontrar(Integer id);

	public void remover(Integer id);

}
