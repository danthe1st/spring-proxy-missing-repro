package io.github.danthe1st.spring_test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringTestApplicationTests {

	@Autowired
	private EntityRepository repo;

	@Test
	void someTest() {
		repo.getByName("");
	}
}
