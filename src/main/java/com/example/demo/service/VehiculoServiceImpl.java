package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Vehiculo;
import com.example.demo.repo.IVehiculoRepo;

@Service
public class VehiculoServiceImpl implements IVehiculoService{

	@Autowired
	private IVehiculoRepo vehiculoRepo;
	@Override
	public void guardar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepo.insertar(vehiculo);
	}

	@Override
	public List<Vehiculo> buscarPlacaTyped(String placa) {
		// TODO Auto-generated method stub
		return this.vehiculoRepo.buscarPlacaTyped(placa);
	}

	@Override
	public List<Vehiculo> buscarModeloTyped(String modelo) {
		// TODO Auto-generated method stub
		return this.vehiculoRepo.buscarModeloTyped(modelo);
	}

	@Override
	public List<Vehiculo> buscarMarcaTyped(String marca) {
		// TODO Auto-generated method stub
		return this.vehiculoRepo.buscarMarcaTyped(marca);
	}

	@Override
	public List<Vehiculo> buscarPlacaNamed(String placa) {
		// TODO Auto-generated method stub
		return this.vehiculoRepo.buscarPlacaNamed(placa);
	}

	@Override
	public List<Vehiculo> buscarColorNamed(String color) {
		// TODO Auto-generated method stub
		return this.vehiculoRepo.buscarColorNamed(color);
	}

	@Override
	public List<Vehiculo> buscarFullNamed(Boolean full) {
		// TODO Auto-generated method stub
		return this.vehiculoRepo.buscarFullNamed(full);
	}

	@Override
	public List<Vehiculo> buscarPrecioNative(BigDecimal precio) {
		// TODO Auto-generated method stub
		return this.vehiculoRepo.buscarPrecioNative(precio);
	}

	@Override
	public Vehiculo buscarBaratoNative(BigDecimal precio) {
		// TODO Auto-generated method stub
		return this.vehiculoRepo.buscarBaratoNative(precio);
	}

	@Override
	public Vehiculo buscarCaroNative(BigDecimal precio) {
		// TODO Auto-generated method stub
		return this.vehiculoRepo.buscarCaroNative(precio);
	}

	@Override
	public List<Vehiculo> buscarColorNamedNative(String color) {
		// TODO Auto-generated method stub
		return this.vehiculoRepo.buscarColorNamedNative(color);
	}

	@Override
	public List<Vehiculo> buscarNumeroPuertasNamedNative(Integer numPuertas) {
		// TODO Auto-generated method stub
		return this.vehiculoRepo.buscarNumeroPuertasNamedNative(numPuertas);
	}

	@Override
	public List<Vehiculo> buscarFullNamedNative(Boolean full) {
		// TODO Auto-generated method stub
		return this.vehiculoRepo.buscarFullNamedNative(full);
	}

}
