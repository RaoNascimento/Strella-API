package br.com.AgendaAutonoma.agendaAutonomo.controller;

import java.lang.reflect.Type;
import java.net.URI;
import java.time.LocalDate;
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

import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.AgendamentoDto;
import br.com.AgendaAutonoma.agendaAutonomo.controller.form.AgendamentoForm;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.Agendamento;
import br.com.AgendaAutonoma.agendaAutonomo.repository.AgendamentoRepository;
import br.com.AgendaAutonoma.agendaAutonomo.service.AgendamentoService;

@RestController
@RequestMapping("agendamento")
public class AgendamentoController {
	
	@Autowired
	AgendamentoService service;
	@Autowired
	AgendamentoRepository agendamentoRepository;

	
	
	@PostMapping
	public ResponseEntity<Agendamento> cadastrar(@RequestBody AgendamentoForm  form, UriComponentsBuilder UriBuilder) {	
		Agendamento agendamento = service.salvarAgendamento(form);	
		 URI uri = UriBuilder.path("/agendamento/{id}").buildAndExpand(agendamento.getId()).toUri(); 
		 
		return (ResponseEntity.created(uri).body(agendamento));	
	}
	@GetMapping
	public List<AgendamentoDto> lista(String nome) {
		LocalDate data = null;
		List<AgendamentoDto> agendamentosDto;
			
		if(nome!=null) { data = LocalDate.parse(nome); }
		
			List<Agendamento> agendamentos = service.listarAgendamentoDia(data);
			 ModelMapper mapper = new ModelMapper();
			 Type agendamentosType= new TypeToken<List<Agendamento>>() {}.getType();
			 agendamentosDto = mapper.map(agendamentos,agendamentosType);
			 

		return agendamentosDto;	
			
	}
	
	
	

}
