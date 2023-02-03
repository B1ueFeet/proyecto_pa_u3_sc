package com.example.demo.repo;

import com.example.demo.modelo.Renta;

public interface IRentaRepo {

	public void insertar(Renta renta);

	public void actualizar(Renta renta);

	public Renta buscar(Integer id);

	public void eliminar(Integer id);

}