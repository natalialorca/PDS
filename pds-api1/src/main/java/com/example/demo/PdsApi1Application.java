package com.example.demo;

import com.example.demo.adaptador.SaludaRestController;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PdsApi1Application implements CommandLineRunner {
	private final SaludaRestController saludoRestController;
	
	public PdsApi1Application(SaludaRestController saludoRestController) {
		this.saludoRestController = saludoRestController;
	}
	public static void main(String[] args) {
		SpringApplication.run(PdsApi1Application.class, args);
	}

	@Override
	public void run (String...args) {
		saludoRestController.saluda();
	}
}
