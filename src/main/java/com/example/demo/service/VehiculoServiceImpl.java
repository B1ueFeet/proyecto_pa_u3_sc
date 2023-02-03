package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Vehiculo;
import com.example.demo.repo.IVehiculoRepo;

@Service
public class VehiculoServiceImpl implements IVehiculoService{

	@Autowired
	private IVehiculoRepo vehiculoRepo;
	
	@Override
	public void crear(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepo.insertar(vehiculo);
	}

	@Override
	public void editar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepo.actualizar(vehiculo);
	}

	@Override
	public Vehiculo encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.vehiculoRepo.buscar(id);
	}

	@Override
	public void remover(Integer id) {
		// TODO Auto-generated method stub
		this.vehiculoRepo.eliminar(id);
	}

}
