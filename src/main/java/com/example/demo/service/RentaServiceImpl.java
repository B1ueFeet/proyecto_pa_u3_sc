package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Renta;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.repo.IClienteRepo;
import com.example.demo.repo.IRentaRepo;
import com.example.demo.repo.IVehiculoRepo;

@Service
public class RentaServiceImpl  implements IRentaService{
	
	@Autowired
	private IClienteRepo clienteRepo;
	
	@Autowired
	private IVehiculoRepo vehiculoRepo;
	
	@Autowired 
	private IRentaRepo rentaRepo;

	@Override
	public void realizar(String cedula, String placa) {
		// TODO Auto-generated method stub
		Cliente cliente = this.clienteRepo.buscarCedulaQuery(cedula);
		Vehiculo vehiculo = this.vehiculoRepo.buscarPlacaQuery(placa);
		
		Renta renta = new Renta();
		renta.setCliente(cliente);
		renta.setVehiculo(vehiculo);
		
		this.rentaRepo.insertar(renta);
		
		System.out.println("Renta Realizada Exitosamente");
		
		
	}
	
	

}
