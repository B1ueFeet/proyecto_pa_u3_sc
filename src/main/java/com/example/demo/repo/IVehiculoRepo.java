package com.example.demo.repo;

import com.example.demo.modelo.Vehiculo;

public interface IVehiculoRepo {

	public void insertar(Vehiculo vehiculo);

	public void actualizar(Vehiculo vehiculo);

	public Vehiculo buscar(Integer id);

	public Vehiculo buscarPlacaQuery(String placa);

	public void eliminar(Integer id);

}
