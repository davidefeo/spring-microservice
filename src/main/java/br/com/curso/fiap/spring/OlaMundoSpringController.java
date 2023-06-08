package br.com.curso.fiap.spring;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaMundoSpringController {
	
	private static final String template = "Ola %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/olaMundoSpring")
	public OlaMundoSpring olaMundoSpring(@RequestParam(value="name", defaultValue = "Mundo") String name) {
	
		return new OlaMundoSpring(counter.incrementAndGet(), String.format(template, name) );
	
	}
	
}
