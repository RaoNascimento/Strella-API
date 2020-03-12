package br.com.AgendaAutonoma.agendaAutonomo.service;

import org.springframework.http.ResponseEntity;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.CifraModelo;

public interface DesafioService {

	public ResponseEntity<CifraModelo> getTextoCodificadoApi();

}
