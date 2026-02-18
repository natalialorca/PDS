package com.example.demo.adaptador;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pds")
public class SaludaRestController {

	@Value("${pds.saludo}")
	private String saludo;
	@Value("${pds.despedida}")
	private String despedida;
	
	@GetMapping("/saluda") // URL de acceso: http://localhost:8080/pds/saluda
	public String saluda() {
		return saludo;
	}
	@GetMapping("/despide") // URL de acceso: http://localhost:8080/pds/despide
	public String despide() {
		return despedida;
	}
	
}
