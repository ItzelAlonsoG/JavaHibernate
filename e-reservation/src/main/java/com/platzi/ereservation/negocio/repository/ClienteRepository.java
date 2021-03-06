package com.platzi.ereservation.negocio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.platzi.ereservation.modelo.Cliente;

/**
 * Interface para definir las operaciones de BD relacionadas con el cliente
 * @author itzel.alonso
 * 
 * */
public interface ClienteRepository extends JpaRepository<Cliente,String>{
	
	/**
	 * Definición de método para buscar los clentes por su apellido
	 * @param apellidoCli
	 * @return
	 * */
	public List<Cliente> findByApellidoCli(String apellidoCli);
	
	public Cliente findByIdentificacion(String identificacionCli);
	 

}
	