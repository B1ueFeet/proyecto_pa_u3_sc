package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.IHabitacionService;
import com.example.demo.service.IHotelService;

@SpringBootApplication
public class ProyectoPaU3ScApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3ScApplication.class, args);
	}

	@Autowired
	private IHotelService hotelService;
	@Autowired
	private IHabitacionService habitacionService;

	@Override
	public void run(String... args) throws Exception {

		System.err.println("\nBUSCAR JOIN FETCH");
		this.hotelService.buscarHotelFetchJoin("VIP").forEach(a -> {
			System.out.print(a.getNombre() + "\n");
			a.getHabitaciones().forEach(System.out::println);
		});

		System.err.println("\nBUSCAR LEFT JOIN");
		this.hotelService.buscarHotelOuterLeftJoin().forEach(a -> {
			System.out.println(a.getNombre());
			a.getHabitaciones().forEach(System.out::println);
		});

		System.err.println("\nBUSCAR LEFT JOIN HABITACION");
		this.habitacionService.buscarHotelOuterLeftJoin().forEach(a -> {
			System.out.println(a != null ? a.getNumero(): null);
		});
		
		System.err.println("\nBUSCAR RIGHT JOIN");
		this.hotelService.buscarHotelOuterRightJoin().forEach(a -> {
			System.out.println(a != null ? a.getNombre(): null);
			//a.getHabitaciones().forEach(System.out::println);
		});

		System.err.println("\nBUSCAR RIGHT JOIN HABITACION");
		this.habitacionService.buscarHotelOuterRightJoin().forEach(a -> {
			System.out.println(a.getNumero() + " del Hotel: "  + (a.getHotel() != null ?a.getHotel().toString():null));
		});

		/*
		 * System.out.println("\nBuscar Outer fULL Join");
		 * this.hotelService.buscarHotelOuterFullJoin("").forEach(System.out::println);
		 * System.out.println("\nBuscar Where Join");
		 * this.hotelService.buscarHotelWhereJoin("").forEach(System.out::println);
		 */
	}

}
