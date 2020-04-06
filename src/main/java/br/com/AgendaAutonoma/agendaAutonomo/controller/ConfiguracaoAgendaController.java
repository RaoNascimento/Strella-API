package br.com.AgendaAutonoma.agendaAutonomo.controller;

import java.lang.reflect.Type;
import java.net.URI;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.ConfiguracaoAgendaDto;
import br.com.AgendaAutonoma.agendaAutonomo.controller.form.ConfiguracaoAgendaForm;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.ConfiguracaoAgenda;
import br.com.AgendaAutonoma.agendaAutonomo.repository.ConfiguracaoAgendaRepository;
import br.com.AgendaAutonoma.agendaAutonomo.service.ConfiguracaoAgendaService;

@RestController
@RequestMapping("/config-agenda")
public class ConfiguracaoAgendaController {
	@Autowired
	ConfiguracaoAgendaService service;
	@Autowired
	ConfiguracaoAgendaRepository configuracaoAgendaRepository;
	
	
	@PostMapping
	public ResponseEntity<ConfiguracaoAgenda> cadastrar(@RequestBody ConfiguracaoAgendaForm  form, UriComponentsBuilder UriBuilder) {	
		ConfiguracaoAgenda configuracaoAgenda = service.salvarConfiguracaoAgenda(form);	
		 URI uri = UriBuilder.path("/profissionais/{id}").buildAndExpand(configuracaoAgenda.getId()).toUri(); 
		 
		return (ResponseEntity.created(uri).body(configuracaoAgenda));	
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<?> remover(@PathVariable Long id){
		configuracaoAgendaRepository.deleteById(id);
		
		return ResponseEntity.ok().build();		
	}
	@GetMapping
	public List<ConfiguracaoAgendaDto> lista(String nome) {
		
		List<ConfiguracaoAgenda> configuracaoAgenda = service.listarConfiguracao(nome);
		 ModelMapper mapper = new ModelMapper();
		 Type configuracaoAgendaType= new TypeToken<List<ConfiguracaoAgenda>>() {}.getType();
		 List<ConfiguracaoAgendaDto> configuracaoAgendaDto = mapper.map(configuracaoAgenda,configuracaoAgendaType);
		 return configuracaoAgendaDto;
			
	}

}
