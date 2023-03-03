package com.adorno.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adorno.services.PersonaService;

@SpringBootTest
class PersonaPorNombre {

	@Autowired
	PersonaService personaService;
	
	@Test
	void test() {
		String begining = "a";
		int i = 1;
		assertEquals(i,personaService.getPersonaByStartingName(begining).get().size());
	}

}
