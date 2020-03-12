package br.com.AgendaAutonoma.agendaAutonomo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.CifraModelo;
import br.com.AgendaAutonoma.agendaAutonomo.service.DesafioService;

@Service
public class DesafioServiceImpl implements DesafioService {
	
	@Autowired
	RestTemplate restTemplate;
	static String TOKEN = "239977e176f146a1414f17ae145b090bd072b168";
	static String URL = "api.codenation.dev/v1/challenge/dev-ps/generate-data?token=";
	
	@Override
	public ResponseEntity<CifraModelo> getTextoCodificadoApi() {
		
		RestTemplate template = new RestTemplate();
		UriComponents uri = UriComponentsBuilder.newInstance().scheme("https")
				.host(URL+TOKEN).build();

		 ResponseEntity<CifraModelo> entity = template.getForEntity(uri.toUriString(), CifraModelo.class);
		 entity = template.getForEntity(uri.toUriString(), CifraModelo.class);
		return entity;
	}

}
