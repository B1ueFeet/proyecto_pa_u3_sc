package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU3ScApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3ScApplication.class, args);
	}

	@Autowired
	private IEstudianteService estudianteService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		// Insertar estudiantes
		/*
		 * Estudiante estudiante = new Estudiante(); estudiante.setApellido("Castillo");
		 * estudiante.setCedula("1717844466"); estudiante.setCiudad("Quito");
		 * estudiante.setGenero("M"); estudiante.setNombre("Serghy");
		 * 
		 * Estudiante estudiante2 = new Estudiante(); estudiante2.setApellido("Conde");
		 * estudiante2.setCedula("1717560930"); estudiante2.setCiudad("Quevedo");
		 * estudiante2.setGenero("F"); estudiante2.setNombre("Serghy");
		 * 
		 * Estudiante estudiante3 = new Estudiante(); estudiante3.setApellido("Madrid");
		 * estudiante3.setCedula("1717560930"); estudiante3.setCiudad("Guayaquil");
		 * estudiante3.setGenero("M"); estudiante3.setNombre("Serghy");
		 * 
		 * Estudiante estudiante4 = new Estudiante();
		 * estudiante4.setApellido("Chuquimarca"); estudiante4.setCedula("1717560930");
		 * estudiante4.setCiudad("Otavalo"); estudiante4.setGenero("M");
		 * estudiante4.setNombre("Miguel");
		 * 
		 * this.estudianteService.crear(estudiante);
		 * this.estudianteService.crear(estudiante2);
		 * this.estudianteService.crear(estudiante3);
		 * this.estudianteService.crear(estudiante4);
		 */
		System.out.println("MANEJO DE LISTAS");
		System.out.println("POR NOMBRE 'Serghy'");
		this.estudianteService.buscarNombre("Serghy").forEach(System.out::println);
		System.out.println("POR GENERO 'M'");
		this.estudianteService.buscarGeneroTypedNamed("M").forEach(System.out::println);
		System.out.println("POR CEDULA '1717560930'");
		this.estudianteService.buscarCedulaTypedNamedNative("1717560930").forEach(System.out::println);
		System.out.println("FIRST RESULT");
		System.out.println(this.estudianteService.buscarNombreFirst("Serghy"));
		System.out.println("MANEJO DE QUERIES");
		System.out.println(this.estudianteService.buscarNombreTyped("Miguel"));
		System.out.println(this.estudianteService.buscarCedulaTypedNamedNative("1717844466"));

		
	
		/*
		 * System.out.println("Estudiante por Apellido" +
		 * this.estudianteService.buscarApellido("Castillo"));
		 * System.out.println("Estudiante por Ciudad" +
		 * this.estudianteService.buscarCiudad("Quevedo"));
		 * System.out.println("Estudiante por Cedula" +
		 * this.estudianteService.buscarCedula("1717569838"));
		 * System.out.println("Estudiante por Genero" +
		 * this.estudianteService.buscarGenero("F"));
		 */

	}

}
