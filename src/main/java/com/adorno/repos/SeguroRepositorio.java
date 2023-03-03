package com.adorno.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.adorno.model.Seguro;

public interface SeguroRepositorio extends CrudRepository<Seguro, Long> {
	List<Seguro> findAll();

	List<Seguro> findAllByDescripcionStartingWith(String descripcionSeguro);
}
