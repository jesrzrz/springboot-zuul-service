package es.jr.sbzu.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

	private static final String template = "Holi, %s!";

	@RequestMapping("/saludo/{nombre}")
	public String saludo(@PathVariable("nombre") String nombre) {
		return String.format(template, nombre);
	}
}
