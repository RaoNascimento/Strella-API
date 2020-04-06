package br.com.AgendaAutonoma.agendaAutonomo.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.AgendaAutonoma.agendaAutonomo.controller.form.AgendaForm;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.Agenda;
import br.com.AgendaAutonoma.agendaAutonomo.repository.AgendaRepository;
import br.com.AgendaAutonoma.agendaAutonomo.service.AgendaService;

@RestController
@RequestMapping("/agenda")
public class AgendaController {
	
	@Autowired
	AgendaRepository agendaRepository;
	@Autowired
	AgendaService service;
	
	
	@PostMapping
	public ResponseEntity<Agenda> cadastrar(@RequestBody AgendaForm  form, UriComponentsBuilder UriBuilder) {	
		Agenda agenda = service.salvarAgenda(form);	
		 URI uri = UriBuilder.path("/profissionais/{id}").buildAndExpand(agenda.getId()).toUri(); 
		 
		return (ResponseEntity.created(uri).body(agenda));	
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<?> remover(@PathVariable Long id){
		agendaRepository.deleteById(id);
		
		return ResponseEntity.ok().build();		
	}
	
}
