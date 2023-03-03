package com.adorno.repos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.adorno.model.Persona;
import com.adorno.model.Seguro;

//@Component
public class ObjectMother {
	
	private final PersonaRepository personaRepository;
	private final SeguroRepositorio seguroRepositorio;
	
	
	public ObjectMother(PersonaRepository personaRepository, SeguroRepositorio seguroRepositorio) {
		super();
		this.personaRepository = personaRepository;
		this.seguroRepositorio = seguroRepositorio;
	}

	public void persist() {
		getPersonas().forEach((persona)->{
			personaRepository.save(persona);
		});
		getSeguros().forEach((seguro)->{
			seguroRepositorio.save(seguro);
		});
		List<Persona> personas=personaRepository.findAll();
		List<Seguro> seguros=seguroRepositorio.findAll();
		for (int i = 0; i < personas.size(); i++) {
			Persona persona = personas.get(i);
			Seguro seguro = seguros.get(i);
			persona.setSeguro(seguro);
			personaRepository.save(persona);
			seguro.setPersona(persona);
		}
	}

	private List<Persona> getPersonas() {
		int cantidad = 1;
		ArrayList lista = new ArrayList<>();
		for (int i = 0; i < cantidad; i++) {
			lista.add(new Persona("arturo"));
		}
		return lista;
	}
	private List<Seguro> getSeguros(){
		int cantidad = 1;
		ArrayList lista = new ArrayList<>();
		for (int i = 0; i < cantidad; i++) {
			lista.add(new Seguro("hogar"));
		}
		return lista;
	}
}
