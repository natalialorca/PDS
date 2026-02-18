package com.example.demo.adaptador;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SaludoRestAdapter {
	private static final Logger log = LoggerFactory.getLogger(SaludoRestAdapter.class);
	
	@Value("${pds.saludo}")
	private String saludo;
	
	public void saluda() {
		log.info("Saludamos {}", saludo);
	}
	

}
