package br.com.AgendaAutonoma.agendaAutonomo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.EspecialidadeDto;
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
		
			return EspecialidadeDto.converter(especialidades); 	
	}

}
