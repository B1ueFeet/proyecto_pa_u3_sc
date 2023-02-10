package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.modelo.Vehiculo;

public interface IVehiculoService {

	//INSERTAR
	public void guardar ( Vehiculo vehiculo);
	
	//BUSQUEDA POR QUERIES
	//TYPED QUERIES
	 public List<Vehiculo> buscarPlacaTyped(String placa);
	 public List<Vehiculo> buscarModeloTyped(String modelo);
	 public List<Vehiculo> buscarMarcaTyped(String marca);
	//NAMED QUERIES
	 public List<Vehiculo> buscarPlacaNamed(String placa);
	 public List<Vehiculo> buscarColorNamed(String color);
	 public List<Vehiculo> buscarFullNamed(Boolean full);
	//NATIVE QUERIES
	 public List<Vehiculo> buscarPrecioNative(BigDecimal precio);
	 public Vehiculo buscarBaratoNative(BigDecimal precio);
	 public Vehiculo buscarCaroNative(BigDecimal precio);
	//NAMED NATIVE QUERIES
	 public List<Vehiculo> buscarColorNamedNative(String color);
	 public List<Vehiculo> buscarNumeroPuertasNamedNative(Integer numPuertas);
	 public List<Vehiculo> buscarFullNamedNative(Boolean full);
}
