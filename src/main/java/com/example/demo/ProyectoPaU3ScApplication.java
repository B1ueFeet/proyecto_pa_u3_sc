package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@SpringBootApplication
public class ProyectoPaU3ScApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3ScApplication.class, args);
	}
	


	@Autowired
	private IEstudianteService estudianteService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		
		System.out.println("Estudiante por Nombre" + this.estudianteService.buscarNombre("Serghy"));
		//System.out.println("Estudiante por Apellido" + this.estudianteService.buscarApellido(""));
		
		}

}
