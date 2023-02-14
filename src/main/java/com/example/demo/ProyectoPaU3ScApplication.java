package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.Hotel;
import com.example.demo.service.IEstudianteService;
import com.example.demo.service.IHotelService;

@SpringBootApplication
public class ProyectoPaU3ScApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3ScApplication.class, args);
	}

	@Autowired
	private IHotelService hotelService;

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("\nBuscar Inner Join");
		this.hotelService.buscarHotelInnerJoin("VIP").forEach(a -> { 
			System.out.print(a.getNombre()+ "\n");
			a.getHabitaciones().forEach(System.out::println);
			});

		System.out.println("\nBuscar Outer Left Join");
		this.hotelService.buscarHotelOuterLeftJoin("VIP").forEach(a -> { 
			System.out.print(a.getNombre()+ "\n");
			a.getHabitaciones().forEach(System.out::println);
			});
		
		//System.out.println("\nBuscar Outer Right Join");
		//this.hotelService.buscarHotelOuterRightJoin("NOVIP").forEach(a -> { 
		//	System.out.print(a.getNombre()+ "\n");
		//	//a.getHabitaciones().forEach(System.out::println);
		//	});
		
		/*
		System.out.println("\nBuscar Outer fULL Join");
		this.hotelService.buscarHotelOuterFullJoin("").forEach(System.out::println);
		System.out.println("\nBuscar Where Join");
		this.hotelService.buscarHotelWhereJoin("").forEach(System.out::println);
		System.out.println("\nBuscar Fetch Right Join");
		this.hotelService.buscarHotelFetchJoin("").forEach(System.out::println);*/
	}

}
