package com.adorno.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adorno.model.Persona;
import com.adorno.model.Seguro;
import com.adorno.repos.PersonaRepository;
import com.adorno.repos.SeguroRepositorio;

@Service
public class PersonaService {
	private final PersonaRepository personaRepository;
	private final SeguroRepositorio seguroRepositorio;
	public PersonaService(PersonaRepository personaRepository, SeguroRepositorio seguroRepositorio) {
		super();
		this.personaRepository = personaRepository;
		this.seguroRepositorio = seguroRepositorio;
	}

	public Optional<List<Persona>> getPersonaByStartingName(String begining){
		return Optional.of(personaRepository.findAllByNameStartingWith(begining));
	}
	
	
	public Optional<List<Persona>> getByStartingWith(String descripcionSeguro) throws Exception{
		if(descripcionSeguro==null) throw new Exception();
		return Optional.of(personaRepository.findAllBySeguroIn(seguroRepositorio.findAllByDescripcionStartingWith(descripcionSeguro)));
	}
}
