package com.example.demo.service;

import com.example.demo.modelo.Cliente;

public interface IClienteService {
	
	public void crear(Cliente cliente);

	public void editar(Cliente cliente);

	public Cliente encontrar(Integer id);

	public void remover(Integer id);

}
