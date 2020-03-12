package br.com.AgendaAutonoma.agendaAutonomo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.CifraModelo;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.DecifraTexto;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.GravarArquivoJson;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.ResumoSHA1;
import br.com.AgendaAutonoma.agendaAutonomo.service.DesafioService;

@RestController
@RequestMapping("/textocifrado")
public class DesafioController {

	@Autowired
	DesafioService desafioService;
	
	static String ERRO_RESUMO = "Não foi possível gerar resumo do texto " ;

	@Bean
	public RestTemplate rest() {
		return new RestTemplate();
	}

	@GetMapping
	public ResponseEntity<CifraModelo> decifrarDesafioCodenation() {
	

		ResponseEntity<CifraModelo> entidadeCifraModelo = desafioService.getTextoCodificadoApi();
		DecifraTexto decifraTexto = new DecifraTexto();
		
		String textoDecifrado = decifraTexto.decifrarCesar(entidadeCifraModelo.getBody().getCifrado());	
		entidadeCifraModelo.getBody().setDecifrado(textoDecifrado);
		entidadeCifraModelo.getBody().setNumeroCasas(decifraTexto.contadorCasas());
		
		try {
			ResumoSHA1 resumo = new ResumoSHA1();
			entidadeCifraModelo.getBody().setResumoCriptografico(resumo.resumirTextoDecifrado(textoDecifrado));
			
		} catch (Exception e) { 
			System.out.println(ERRO_RESUMO + e.getMessage().toString());	 
		}
		
		GravarArquivoJson gerarArquivo = new GravarArquivoJson();
		gerarArquivo.gravarArquivoJson(entidadeCifraModelo.getBody());

		return ResponseEntity.ok(entidadeCifraModelo.getBody());
	}

}