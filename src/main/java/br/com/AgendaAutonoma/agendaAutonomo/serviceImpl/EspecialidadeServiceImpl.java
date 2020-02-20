package br.com.AgendaAutonoma.agendaAutonomo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.ServicoEspecialidadeDto;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.Especialidade;
import br.com.AgendaAutonoma.agendaAutonomo.repository.EspecialidadeRepository;
import br.com.AgendaAutonoma.agendaAutonomo.service.EspecialidadeService;

@Service
public class EspecialidadeServiceImpl implements EspecialidadeService {
	
	@Autowired
	EspecialidadeRepository especialidadeRepository;
	@Autowired
	EspecialidadeService service;
	
	@Override
	public List<Especialidade>buscarEspecialidades(String nomeEspecialidade){
		
		if (nomeEspecialidade == null) {			
			List<Especialidade> especialidades = especialidadeRepository.findAll();
			return especialidades;
		}
			List<Especialidade>especialidades = especialidadeRepository.findByNomeEspecialidade(nomeEspecialidade);
			return especialidades;
	}

	@Override
	public List<ServicoEspecialidadeDto> buscarServicoEspecialidadeById(Long id) {
		 List<ServicoEspecialidadeDto> servicosOferecidos =  especialidadeRepository.findServicoEspecialidadeByIdAsDto(id);
				
		return servicosOferecidos;
	}


}
