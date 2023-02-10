package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Vehiculo;
import com.example.demo.service.IVehiculoService;

@SpringBootApplication
public class ProyectoPaU3ScApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3ScApplication.class, args);
	}

	@Autowired
	private IVehiculoService vehiculoService;

	@Override
	public void run(String... args) throws Exception {
		
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setPrecio(new BigDecimal(30000));
		vehiculo.setColor("Negro");
		vehiculo.setFull(false);
		vehiculo.setMarca("Toyota");
		vehiculo.setModelo("Sedan");
		vehiculo.setNumPuertas(3);
		vehiculo.setPlaca("PDC-9939");
		
		Vehiculo vehiculo2 = new Vehiculo();
		vehiculo2.setPrecio(new BigDecimal(50000));
		vehiculo2.setColor("Blanco");
		vehiculo2.setFull(true);
		vehiculo2.setMarca("Toyota");
		vehiculo2.setModelo("Sedan");
		vehiculo2.setNumPuertas(5);
		vehiculo2.setPlaca("PDC-9839");
		
		Vehiculo vehiculo3 = new Vehiculo();
		vehiculo3.setPrecio(new BigDecimal(24000));
		vehiculo3.setColor("Rojo");
		vehiculo3.setFull(false);
		vehiculo3.setMarca("Nissan");
		vehiculo3.setModelo("Sedan");
		vehiculo3.setNumPuertas(5);
		vehiculo3.setPlaca("PDC-8939");
		
		Vehiculo vehiculo4 = new Vehiculo();
		vehiculo4.setPrecio(new BigDecimal(46000));
		vehiculo4.setColor("Rojo");
		vehiculo4.setFull(false);
		vehiculo4.setMarca("Nissan");
		vehiculo4.setModelo("Jeep");
		vehiculo4.setNumPuertas(3);
		vehiculo4.setPlaca("PDC-9739");
		
		Vehiculo vehiculo5 = new Vehiculo();
		vehiculo5.setPrecio(new BigDecimal(16000));
		vehiculo5.setColor("Negro");
		vehiculo5.setFull(true);
		vehiculo5.setMarca("Chevrolet");
		vehiculo5.setModelo("Sedan");
		vehiculo5.setNumPuertas(5);
		vehiculo5.setPlaca("PDC-9934");
		
		Vehiculo vehiculo6 = new Vehiculo();
		vehiculo6.setPrecio(new BigDecimal(18000));
		vehiculo6.setColor("Blanco");
		vehiculo6.setFull(false);
		vehiculo6.setMarca("Toyota");
		vehiculo6.setModelo("Jeep");
		vehiculo6.setNumPuertas(3);
		vehiculo6.setPlaca("PDC-9945");
		
		Vehiculo vehiculo7 = new Vehiculo();
		vehiculo7.setPrecio(new BigDecimal(29000));
		vehiculo7.setColor("Azul");
		vehiculo7.setFull(true);
		vehiculo7.setMarca("Chevrolet");
		vehiculo7.setModelo("Sedan");
		vehiculo7.setNumPuertas(5);
		vehiculo7.setPlaca("PDC-9921");
		
		Vehiculo vehiculo8 = new Vehiculo();
		vehiculo8.setPrecio(new BigDecimal(34000));
		vehiculo8.setColor("Azul");
		vehiculo8.setFull(false);
		vehiculo8.setMarca("Chevrolet");
		vehiculo8.setModelo("Jeep");
		vehiculo8.setNumPuertas(3);
		vehiculo8.setPlaca("PDC-9933");
		
		Vehiculo vehiculo9 = new Vehiculo();
		vehiculo9.setPrecio(new BigDecimal(33000));
		vehiculo9.setColor("Azul");
		vehiculo9.setFull(true);
		vehiculo9.setMarca("Nissan");
		vehiculo9.setModelo("Jeep");
		vehiculo9.setNumPuertas(3);
		vehiculo9.setPlaca("PDC-9945");
		
		Vehiculo vehiculo10 = new Vehiculo();
		vehiculo10.setPrecio(new BigDecimal(14000));
		vehiculo10.setColor("Blanco");
		vehiculo10.setFull(false);
		vehiculo10.setMarca("Toyota");
		vehiculo10.setModelo("Sedan");
		vehiculo10.setNumPuertas(3);
		vehiculo10.setPlaca("PDC-9956");
		
		this.vehiculoService.guardar(vehiculo10);
		this.vehiculoService.guardar(vehiculo9);
		this.vehiculoService.guardar(vehiculo8);
		this.vehiculoService.guardar(vehiculo7);
		this.vehiculoService.guardar(vehiculo6);
		this.vehiculoService.guardar(vehiculo5);
		this.vehiculoService.guardar(vehiculo4);
		this.vehiculoService.guardar(vehiculo3);
		this.vehiculoService.guardar(vehiculo2);
		this.vehiculoService.guardar(vehiculo);
		
		System.out.println("\nTYPED QUERIES");
		System.out.println("\nBUSCAR MARCA");
		this.vehiculoService.buscarMarcaTyped("Toyota").forEach(System.out::println);
		System.out.println("\nBUSCAR MODELO");
		this.vehiculoService.buscarModeloTyped("Jeep").forEach(System.out::println);
		System.out.println("\nBUSCAR PLACA");
		this.vehiculoService.buscarPlacaTyped("PDC-9939").forEach(System.out::println);
		
		System.out.println("\nNAMED QUERIES");
		System.out.println("\nBUSCAR COLOR");
		this.vehiculoService.buscarColorNamed("Blanco").forEach(System.out::println);
		System.out.println("\nBUSCAR FULL");
		this.vehiculoService.buscarFullNamed(true).forEach(System.out::println);
		System.out.println("\nBUSCAR PLACA");
		this.vehiculoService.buscarPlacaNamed("PDC-9956").forEach(System.out::println);

		
		System.out.println("\nNATIVE QUERIES");
		System.out.println("\nBUSCAR PRECIO");
		this.vehiculoService.buscarPrecioNative(new BigDecimal(18000)).forEach(System.out::println);
		System.out.println("\nBUSCAR BARATO");
		System.out.println(this.vehiculoService.buscarBaratoNative(new BigDecimal(18000)));
		System.out.println("\nBUSCAR PLACA");
		System.out.println(this.vehiculoService.buscarCaroNative(new BigDecimal(18000)));

		System.out.println("\nNAMED NATIVE QUERIES");
		System.out.println("\nBUSCAR COLOR");
		this.vehiculoService.buscarColorNamedNative("Negro").forEach(System.out::println);
		System.out.println("\nBUSCAR FULL");
		this.vehiculoService.buscarFullNamedNative(false).forEach(System.out::println);
		System.out.println("\nBUSCAR NUMERO DE PUERTAS");
		this.vehiculoService.buscarNumeroPuertasNamedNative(5).forEach(System.out::println);

		

	}

}
