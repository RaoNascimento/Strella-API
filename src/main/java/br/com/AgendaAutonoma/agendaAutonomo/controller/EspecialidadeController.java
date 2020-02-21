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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.EspecialidadeDto;
import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.ServicoEspecialidadeDto;
import br.com.AgendaAutonoma.agendaAutonomo.controller.form.FormEspecialidade;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.Especialidade;
import br.com.AgendaAutonoma.agendaAutonomo.repository.EspecialidadeRepository;
import br.com.AgendaAutonoma.agendaAutonomo.service.EspecialidadeService;

@RestController
@RequestMapping("/especialidades")
public class EspecialidadeController {
	
	
	@Autowired
	EspecialidadeService service;
	@Autowired
	EspecialidadeRepository especialidadeRepository;
	
	@GetMapping
	public List<EspecialidadeDto> lista(String nomeEspecialidade) {
		
		List<Especialidade> especialidades = service.buscarEspecialidades(nomeEspecialidade);	
		 ModelMapper mapper = new ModelMapper();
		 Type especialidadeType= new TypeToken<List<Especialidade>>() {}.getType();
		 List<EspecialidadeDto>EspecialidadesDto = mapper.map(especialidades,especialidadeType);
		
			return EspecialidadesDto; 
	}
	@GetMapping("/servicos/{id}")
	public List<ServicoEspecialidadeDto> buscarServicoEspecialidade(@PathVariable Long id) {	
		List<ServicoEspecialidadeDto> servicosespecialidades = service.buscarServicoEspecialidadeById(id);
		
			return servicosespecialidades; 	
	}
	@PostMapping
	public ResponseEntity<Especialidade>cadastrarEspecialidades(@RequestBody FormEspecialidade form, UriComponentsBuilder UriBuilder){
		
		Especialidade especialidade = service.salvarEspecialidade(form); 			
		URI uri = UriBuilder.path("/especialidades/{id}").buildAndExpand(especialidade.getId()).toUri(); 
		 
			return (ResponseEntity.created(uri).body(especialidade));
		
	}
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<EspecialidadeDto> atualizar(@PathVariable Long id, @RequestBody @Valid AtualizaEspecialidadeForm form ){		
		Especialidade especialidade = service.atualizarEspecialidade(id, form);	
		 ModelMapper mapper = new ModelMapper();
		 EspecialidadeDto especialidadeDto = mapper.map(especialidade, EspecialidadeDto.class);

		 return ResponseEntity.ok(especialidadeDto);
	}
	

}
