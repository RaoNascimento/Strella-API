package br.com.AgendaAutonoma.agendaAutonomo.controller;

import java.lang.reflect.Type;
import java.net.URI;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.ProfissionalDto;
import br.com.AgendaAutonoma.agendaAutonomo.controller.form.BloqueioForm;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.BloqueioAgenda;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.Profissional;
import br.com.AgendaAutonoma.agendaAutonomo.service.BloqueioService;

@RestController
@RequestMapping("/bloqueio")
public class BloqueioController {
	
	@Autowired
	BloqueioService service;
	
	@PostMapping
	public ResponseEntity<BloqueioAgenda> cadastrar(@RequestBody BloqueioForm  form, UriComponentsBuilder UriBuilder) {	
		BloqueioAgenda bloqueio = service.inserirBloqueio(form);	
		 URI uri = UriBuilder.path("/bloqueio/{id}").buildAndExpand(bloqueio.getId()).toUri(); 
		 
		return (ResponseEntity.created(uri).body(bloqueio));	
	}
	/*
	@GetMapping
	public List<BloqueioDto> lista(String nome) {
		
		List<BloqueioAgenda> bloqueios = service.listarBloqueios(nome);
		 ModelMapper mapper = new ModelMapper();
		 Type bloqueioType= new TypeToken<List<BloqueioAgenda>>() {}.getType();
		 List<ProfissionalDto> profissionaisDto = mapper.map(bloqueios,bloqueioType);
		 return profissionaisDto;
			
	}
	*/

}
