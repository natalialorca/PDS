package com.example.demo;

import com.example.demo.adaptador.SaludoRestAdapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class ApiPdsApplication implements CommandLineRunner {
	private final SaludoRestAdapter saludoRestAdapter;
	
	public ApiPdsApplication(SaludoRestAdapter saludoRestAdapter) {
		this.saludoRestAdapter = saludoRestAdapter;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ApiPdsApplication.class, args);
	}
	
	public void run (String...args) {
		saludoRestAdapter.saluda();
	}

}
