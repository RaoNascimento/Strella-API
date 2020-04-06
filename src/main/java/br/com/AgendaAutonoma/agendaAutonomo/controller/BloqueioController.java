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

import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.BloqueioDto;
import br.com.AgendaAutonoma.agendaAutonomo.controller.form.BloqueioForm;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.BloqueioAgenda;
import br.com.AgendaAutonoma.agendaAutonomo.repository.BloqueioRepository;
import br.com.AgendaAutonoma.agendaAutonomo.service.BloqueioService;

@RestController
@RequestMapping("/bloqueio")
public class BloqueioController {
	
	@Autowired
	BloqueioService service;
	@Autowired
	BloqueioRepository bloqueioRepository;
	
	@PostMapping
	public ResponseEntity<BloqueioAgenda> cadastrar(@RequestBody BloqueioForm  form, UriComponentsBuilder UriBuilder) {	
		BloqueioAgenda bloqueio = service.inserirBloqueio(form);	
		 URI uri = UriBuilder.path("/bloqueio/{id}").buildAndExpand(bloqueio.getId()).toUri(); 
		 
		return (ResponseEntity.created(uri).body(bloqueio));	
	}
	
	@GetMapping
	public List<BloqueioDto> lista(String nome) {
		
		List<BloqueioAgenda> bloqueios = service.listarBloqueios();
		 ModelMapper mapper = new ModelMapper();
		 Type bloqueioType= new TypeToken<List<BloqueioAgenda>>() {}.getType();
		 List<BloqueioDto> bloqueiosDto = mapper.map(bloqueios,bloqueioType);
		 return bloqueiosDto;
			
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<?> remover(@PathVariable Long id){
		bloqueioRepository.deleteById(id);
		
		return ResponseEntity.ok().build();		
	}
}
	

