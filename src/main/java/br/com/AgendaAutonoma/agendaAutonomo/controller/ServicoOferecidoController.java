package br.com.AgendaAutonoma.agendaAutonomo.controller;

import java.lang.reflect.Type;
import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
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

import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.ServicoOferecidoDto;
import br.com.AgendaAutonoma.agendaAutonomo.controller.form.AtualizaServicoOferecidoForm;
import br.com.AgendaAutonoma.agendaAutonomo.controller.form.ServicoOferecidoForm;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.ServicoOferecido;
import br.com.AgendaAutonoma.agendaAutonomo.repository.ServicoOferecidoRepository;
import br.com.AgendaAutonoma.agendaAutonomo.service.ServicoOferecidoService;


@RestController
@RequestMapping("/servicosoferecidos")
public class ServicoOferecidoController {
	@Autowired
	ServicoOferecidoService service;
	@Autowired
	ServicoOferecidoRepository servicoOferecidoRepository; 
	
	@GetMapping("/especialidades")
	public List<ServicoOferecidoDto> lista(String nomeServico) {
		
		List<ServicoOferecido> servicosOferecidos = service.listarServicosOferecidos(nomeServico);		
		 ModelMapper mapper = new ModelMapper();
		 Type servicosType= new TypeToken<List<ServicoOferecido>>() {}.getType();
		 List<ServicoOferecidoDto>ServicoOferecidosDto = mapper.map(servicosOferecidos, servicosType);
		
		
			return ServicoOferecidosDto; 	
	}
	@PostMapping
	public ResponseEntity<ServicoOferecido> cadastrar(@RequestBody ServicoOferecidoForm  form, UriComponentsBuilder UriBuilder) {	
		ServicoOferecido servicoOferecido = service.salvarServico(form);	
		 URI uri = UriBuilder.path("/servicosoferecidos/{id}").buildAndExpand(servicoOferecido.getId()).toUri(); 
		 
		return (ResponseEntity.created(uri).body(servicoOferecido));	
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<?> remover(@PathVariable Long id){
		servicoOferecidoRepository.deleteById(id);
		
		return ResponseEntity.ok().build();		
	}
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<ServicoOferecidoDto> atualizar(@PathVariable Long id, @RequestBody @Valid AtualizaServicoOferecidoForm form ){		
		ServicoOferecido servicoOferecido = service.atualizarServicoOferecido(id, form);	
		 ModelMapper mapper = new ModelMapper();
		ServicoOferecidoDto servicoOferecidoDto = mapper.map(servicoOferecido,ServicoOferecidoDto.class);

		 return ResponseEntity.ok(servicoOferecidoDto);
	}
	
	

}
