package br.com.AgendaAutonoma.agendaAutonomo.controller;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.EspecialidadeDto;
import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.ServicoEspecialidadeDto;
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
	

}
