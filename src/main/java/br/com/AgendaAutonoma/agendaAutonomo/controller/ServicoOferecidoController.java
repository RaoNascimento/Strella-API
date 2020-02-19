package br.com.AgendaAutonoma.agendaAutonomo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.ServicoEspecialidadeDto;
import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.ServicoOferecidoDto;
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
	
	@GetMapping
	@Cacheable(value="servicosOferecidos")
	public List<ServicoOferecidoDto> lista(String nome) {
		
		List<ServicoOferecido> servicosOferecidos = service.listarServicosOferecidos(nome);
		
			return ServicoOferecidoDto.converter(servicosOferecidos); 	
	}
	@GetMapping("/{id}")
	public List<ServicoEspecialidadeDto> buscarServicoEspecialidade(@PathVariable Long id){
		
			List<ServicoEspecialidadeDto> servicoespecialidades = service.buscarServicoEspecialidadeById(id);
			
			return servicoespecialidades; 
		
		
	}

}
