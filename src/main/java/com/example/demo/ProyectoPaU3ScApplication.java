package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.service.IClienteService;
import com.example.demo.service.IRentaService;
import com.example.demo.service.IVehiculoService;

@SpringBootApplication
public class ProyectoPaU3ScApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3ScApplication.class, args);
	}

	@Autowired
	private IVehiculoService vehiculoService;

	@Autowired
	private IClienteService clienteService;

	@Autowired
	private IRentaService rentaService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Cliente cliente = new Cliente();

		cliente.setApellido("Castillo");
		cliente.setCedula("1234567890");
		cliente.setNombre("Serghy");
		cliente.setTarjeta("2233445566");

		this.clienteService.crear(cliente);

		Vehiculo vehiculo = new Vehiculo();

		vehiculo.setMarca("Toyota");
		vehiculo.setModelo("Picanto");
		vehiculo.setPlaca("PDC9939");
		vehiculo.setPrecio(new BigDecimal(30));

		this.vehiculoService.crear(vehiculo);

		this.rentaService.realizar("1234567890", "PDC9939");

	}

}
