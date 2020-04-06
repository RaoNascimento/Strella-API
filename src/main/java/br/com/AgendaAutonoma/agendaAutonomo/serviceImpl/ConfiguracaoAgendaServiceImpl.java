package br.com.AgendaAutonoma.agendaAutonomo.serviceImpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.AgendaAutonoma.agendaAutonomo.controller.form.ConfiguracaoAgendaForm;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.ConfiguracaoAgenda;
import br.com.AgendaAutonoma.agendaAutonomo.repository.ConfiguracaoAgendaRepository;
import br.com.AgendaAutonoma.agendaAutonomo.service.ConfiguracaoAgendaService;
@Service
public class ConfiguracaoAgendaServiceImpl implements ConfiguracaoAgendaService {
	
	ConfiguracaoAgenda configuracaoAgenda;
	
	@Autowired
	ConfiguracaoAgendaRepository configuracaoAgendaRepository; 
	
	@Override
	public ConfiguracaoAgenda salvarConfiguracaoAgenda(ConfiguracaoAgendaForm form) {
		
		ModelMapper mapper = new ModelMapper();
		configuracaoAgenda= mapper.map(form, ConfiguracaoAgenda.class);
		configuracaoAgenda = configuracaoAgendaRepository.save(configuracaoAgenda);
		return configuracaoAgenda;
	}

	@Override
	public List<ConfiguracaoAgenda> listarConfiguracao(String nome) {
			
			List<ConfiguracaoAgenda> configuracaoAgenda = configuracaoAgendaRepository.findAll();
			return configuracaoAgenda;
		
	
	}

}
