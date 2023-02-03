package com.example.demo.repo;

import com.example.demo.modelo.Cliente;

public interface IClienteRepo {

	public void insertar(Cliente cliente);

	public void actualizar(Cliente cliente);

	public Cliente buscar(Integer id);
	
	public Cliente buscarCedulaQuery(String cedula);

	public void eliminar(Integer id);

}
