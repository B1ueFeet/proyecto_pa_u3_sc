package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Estudiante;
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
		Estudiante estudiante = new Estudiante();
		estudiante.setApellido("Castillo");
		estudiante.setCedula("1717844466");
		estudiante.setCiudad("Quito");
		estudiante.setGenero("M");
		estudiante.setNombre("Serghy");

		Estudiante estudiante2 = new Estudiante();
		estudiante2.setApellido("Conde");
		estudiante2.setCedula("1717560930");
		estudiante2.setCiudad("Quevedo");
		estudiante2.setGenero("F");
		estudiante2.setNombre("Dayana");

		Estudiante estudiante3 = new Estudiante();
		estudiante3.setApellido("Madrid");
		estudiante3.setCedula("1717569838");
		estudiante3.setCiudad("Guayaquil");
		estudiante3.setGenero("M");
		estudiante3.setNombre("Omar");

		Estudiante estudiante4 = new Estudiante();
		estudiante4.setApellido("Chuquimarca");
		estudiante4.setCedula("1734567898");
		estudiante4.setCiudad("Otavalo");
		estudiante4.setGenero("M");
		estudiante4.setNombre("Miguel");

		this.estudianteService.crear(estudiante);
		this.estudianteService.crear(estudiante2);
		this.estudianteService.crear(estudiante3);
		this.estudianteService.crear(estudiante4);*/
		System.out.println("\nNORMAL");
		System.out.println("Estudiante por Nombre " + this.estudianteService.buscarNombre("Serghy"));
		System.out.println("\nQUERY NAMED Y TYPED");
		System.out.println("Estudiante por Nombre Typed " + this.estudianteService.buscarNombreTyped("Dayana"));
		System.out.println("Estudiante por Apellido Named " + this.estudianteService.buscarApellidoNamed("Castillo"));
		System.out.println("Estudiante por Genero Typed-Named " + this.estudianteService.buscarGeneroTypedNamed("F"));
		System.out.println("\nNATIVE");
		System.out.println("Estudiante por Ciudad Native " + this.estudianteService.buscarCiudadNative("Quevedo"));
		//System.out.println("Estudiante por Cedula Native Named Typed" + this.estudianteService.buscarCedulaTypedNamedNative("1717569838"));
		
		/*
		System.out.println("Estudiante por Apellido" + this.estudianteService.buscarApellido("Castillo"));
		System.out.println("Estudiante por Ciudad" + this.estudianteService.buscarCiudad("Quevedo"));
		System.out.println("Estudiante por Cedula" + this.estudianteService.buscarCedula("1717569838"));
		System.out.println("Estudiante por Genero" + this.estudianteService.buscarGenero("F"));*/

	}

}
