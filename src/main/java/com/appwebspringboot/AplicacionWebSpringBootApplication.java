package com.appwebspringboot;

import com.appwebspringboot.entities.Persona;
import com.appwebspringboot.repository.PersonaRepository;
import com.appwebspringboot.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AplicacionWebSpringBootApplication{

	@Autowired
	private PersonaService personaService;

	public static void main(String[] args) {
		SpringApplication.run(AplicacionWebSpringBootApplication.class, args);


	}

	/*
	@Override
	public void run(String... args) throws Exception {
		//Guarda entidades en una base de datos el save
		personaService.crearPersona(new Persona(5L,"Abigail",25));
		personaService.crearPersona(new Persona(6L,"Rosario",25));
		personaService.crearPersona(new Persona(7L,"Edith",72));
		personaService.crearPersona(new Persona(8L,"Luis",71));

		//Mostramos numero de personas
		System.out.println("Numero de personas de tu tabla: " + personaService.contarPersonas());

		//Mostramos la lista de personas
		List<Persona> personas = personaService.obtenerTodas();
		personas.forEach(p -> System.out.println("Nombre de la persona: " + p.getNombre()));
	}*/
}
