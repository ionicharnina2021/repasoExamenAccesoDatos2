package com.adorno.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.adorno.model.Persona;
import com.adorno.model.Seguro;

public interface PersonaRepository extends CrudRepository<Persona, Long> {
	List<Persona> findAll();

	List<Persona> findAllByNameStartingWith(String string);

	List<Persona> findAllBySeguroIn(List<Seguro> findAllByDescripcionStartingWith);
}
