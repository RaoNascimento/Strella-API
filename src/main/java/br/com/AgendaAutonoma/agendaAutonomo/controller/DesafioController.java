package br.com.AgendaAutonoma.agendaAutonomo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.CifraModelo;

@RestController
@RequestMapping("/textocifrado")
public class DesafioController {
	@Autowired
	RestTemplate restTemplate;
	static String TOKEN = "239977e176f146a1414f17ae145b090bd072b168";
	static int contCasas;

	@Bean
	public RestTemplate rest() {
		return new RestTemplate();
	}
	
	@GetMapping
	public ResponseEntity<CifraModelo> consultaTextoCifrado() {

		RestTemplate template = new RestTemplate();
		UriComponents uri = UriComponentsBuilder.newInstance().scheme("https")
				.host("api.codenation.dev/v1/challenge/dev-ps/generate-data?token=" + TOKEN).build();

		ResponseEntity<CifraModelo> entity = template.getForEntity(uri.toUriString(), CifraModelo.class);
		//System.out.println(entity.getBody().getCifrado());

		/*
		 * ModelMapper mapper = new ModelMapper(); CifraModelo cifraModelo =
		 * mapper.map(entity, CifraModelo.class);
		 * 
		 * Gson gson = new Gson(); String cifraModelo = gson.toJson(entity);
		 */
		entity.getBody().setDecifrado(decifrarCesar(entity.getBody().getCifrado()));
		entity.getBody().setNumeroCasas(contCasas);
		
		return  ResponseEntity.ok(entity.getBody());

	}

	public String decifrarCesar(String textoCifrado) {
		StringBuilder strBuilder = new StringBuilder();
		

		for (char let : textoCifrado.toCharArray()) {
			contCasas++;
			if (verificaCaractere(let)) { strBuilder.append((char) (let + 3));} 
			else {
				if (let == 'z') {strBuilder.append('c');}
				if (let == 'y') {strBuilder.append('b');}
				if (let == 'x') {strBuilder.append('a');} 
				else {strBuilder.append(let);}
			}
		}
		System.out.println("" + strBuilder.toString());
		return strBuilder.toString();
	}

	public boolean verificaCaractere(char let) {

		switch (let) {
		case '.': {
			return false;
		}
		case ',': {
			return false;
		}
		case ':': {
			return false;
		}
		case ';': {
			return false;
		}
		case '-': {
			return false;
		}
		case '_': {
			return false;
		}
		case '!': {
			return false;
		}
		case '?': {
			return false;
		}
		case 'x': {
			return false;
		}
		case 'y': {
			return false;
		}
		case 'z': {
			return false;
		}
		case '\"': {
			return false;
		}
		case ' ': {
			return false;
		}
		default:
			return true;
		}
	}
}