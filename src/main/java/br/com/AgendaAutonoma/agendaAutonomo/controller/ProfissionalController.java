package br.com.AgendaAutonoma.agendaAutonomo.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.ProfissionalDto;
import br.com.AgendaAutonoma.agendaAutonomo.controller.form.AtualizaProfissionaisForm;
import br.com.AgendaAutonoma.agendaAutonomo.controller.form.ProfissionaisForm;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.Profissional;
import br.com.AgendaAutonoma.agendaAutonomo.repository.ProfissionalRepository;
import br.com.AgendaAutonoma.agendaAutonomo.service.ProfissionalService;

@RestController
@RequestMapping("/profissionais")
public class ProfissionalController {

	@Autowired
	//private UsuarioRepository usuarioRepository;
	ProfissionalService service;

	@Autowired
	private ProfissionalRepository profissionalRepository;

	@GetMapping
	public List<ProfissionalDto> lista(String nome) {
		
		List<Profissional> profissionais = service.listarProfissional(nome);
		
			return ProfissionalDto.converter(profissionais); 	
	}
	
	@PostMapping
	public ResponseEntity<Profissional> cadastrar(@RequestBody ProfissionaisForm  form, UriComponentsBuilder UriBuilder) {
		
		Profissional profissional = service.salvarProfissional(form);	
		 URI uri = UriBuilder.path("/profissionais/{id}").buildAndExpand(profissional.getId()).toUri(); 
		 
		return (ResponseEntity.created(uri).body(profissional));	
	}
	
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<ProfissionalDto> atualizar(@PathVariable Long id, @RequestBody @Valid AtualizaProfissionaisForm form ){		
		Profissional profissional = service.atualizarProfissional(id, form);

		return ResponseEntity.ok(new ProfissionalDto(profissional));		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> remover(@PathVariable Long id){
		profissionalRepository.deleteById(id);
		
		return ResponseEntity.ok().build();		
	}
}