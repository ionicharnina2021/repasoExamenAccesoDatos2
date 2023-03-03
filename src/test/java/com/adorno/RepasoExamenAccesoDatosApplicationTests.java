package com.adorno;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adorno.repos.ObjectMother;

@SpringBootTest
class RepasoExamenAccesoDatosApplicationTests {

	@Autowired
	ObjectMother objectMother;
	@Test
	void contextLoads() {
		objectMother.persist();
	}

}
