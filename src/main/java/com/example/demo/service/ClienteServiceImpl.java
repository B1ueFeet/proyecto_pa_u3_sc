package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Cliente;
import com.example.demo.repo.IClienteRepo;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteRepo clienteRepo;
	
	@Override
	public void crear(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepo.insertar(cliente);
	}

	@Override
	public void editar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepo.actualizar(cliente);
	}

	@Override
	public Cliente encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.clienteRepo.buscar(id);
	}

	@Override
	public void remover(Integer id) {
		// TODO Auto-generated method stub
		this.clienteRepo.eliminar(id);
	}

}
