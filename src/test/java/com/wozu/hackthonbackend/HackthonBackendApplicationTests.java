package com.wozu.hackthonbackend;

import com.wozu.hackthonbackend.Controllers.DogController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HackthonBackendApplicationTests {

	@Autowired
	DogController dogController;

	@Test
	void contextLoads() {
	}


}
