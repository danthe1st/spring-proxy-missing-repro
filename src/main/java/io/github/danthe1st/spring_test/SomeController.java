package io.github.danthe1st.spring_test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SomeController {

	@PostMapping
	public void someEndpoint() {
		somethingTransactional();
	}

	public void somethingTransactional() {

	}
}
