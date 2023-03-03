package com.adorno.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adorno.services.PersonaService;

@SpringBootTest
class PersonasSeguroDescripcion {
	
	@Autowired
	PersonaService personaService;

	@Test
	void test() {
		String descripcionSeguro = "h";
		int i = 1;
		try {
			assertEquals(i,personaService.getByStartingWith(descripcionSeguro).get().size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
