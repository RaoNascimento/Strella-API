package br.com.AgendaAutonoma.agendaAutonomo.controller;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.CifraModelo;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.DecifradorCesar;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.ResumoSHA1;
import br.com.AgendaAutonoma.agendaAutonomo.service.DesafioService;

@RestController
@RequestMapping("/textocifrado")
public class DesafioController {

	@Autowired
	DesafioService desafioService;

	@Bean
	public RestTemplate rest() {
		return new RestTemplate();
	}

	
	public ResponseEntity<CifraModelo> consultaTextoCifrado() {


		ResponseEntity<CifraModelo> entity = desafioService.getTextoCodificadoApi();
		DecifradorCesar decifradorCesar = new DecifradorCesar();
		entity.getBody().setDecifrado(decifradorCesar.decifrarCesar(entity.getBody().getCifrado()));
		entity.getBody().setNumeroCasas(decifradorCesar.contadorCasas());

		return ResponseEntity.ok(entity.getBody());
	}
	
	@GetMapping
	public ResponseEntity<CifraModelo> buscarJsonDesafioCodenation() {

		ResponseEntity<CifraModelo> entity = desafioService.getTextoCodificadoApi();
		DecifradorCesar decifradorCesar = new DecifradorCesar();
		
		String textoDecifrado = decifradorCesar.decifrarComCasas(entity.getBody().getCifrado());	
		entity.getBody().setDecifrado(textoDecifrado);
		entity.getBody().setNumeroCasas(decifradorCesar.contadorCasas());
		
		try {
			ResumoSHA1 resumo = new ResumoSHA1();
			entity.getBody().setResumoCriptografico(resumo.resumirTextoDecifrado(textoDecifrado));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		return ResponseEntity.ok(entity.getBody());
	}

}