package com.platzi.ereservation.negocio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.platzi.ereservation.modelo.Cliente;
import com.platzi.ereservation.negocio.repository.ClienteRepository;

/**
 * Clase para definir lso servicios de cliente
 * 
 * @author itzel.alonso
 */

@Service // es igual que un @componente solo es diferente por la conotación
@Transactional(readOnly=true) // read only para los métodos que no manejen @Transaciontal serás un readonly
public class ClienteService {

	@Autowired
	private final ClienteRepository clienteRepository;

	public ClienteService(ClienteRepository clienteRepository) {
		// TODO Auto-generated constructor stub
		this.clienteRepository = clienteRepository;
	}
	
	/**
	 * método para realizar la operación de guardar un cliente
	 * 
	 * @param cliente
	 * @return
	 * */
	@Transactional
	public Cliente create(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	
	/**
	 * Método para realziar la operación de actualizar un cliente
	 * @param cliente
	 * @return
	 */
	@Transactional
	public Cliente update (Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	/**
	 * Método para realziar la operación de eliminar un cliente
	 * @param cliente
	 * */
	@Transactional
	public void delete (Cliente cliente ) {
		this.clienteRepository.delete(cliente);
	}
	
	/**
	 * Método para consultar un cliente por su identificación
	 * @param identificacionCli
	 * @return
	 * */
	
	public Cliente findByIdentificacion(String identificacionCli) {
		return this.clienteRepository.findByIdentificacion(identificacionCli);
	}
	
	public List<Cliente> findAll (){
		return this.clienteRepository.findAll();
	}
}
