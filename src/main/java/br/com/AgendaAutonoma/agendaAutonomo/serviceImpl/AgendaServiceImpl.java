package br.com.AgendaAutonoma.agendaAutonomo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.AgendaAutonoma.agendaAutonomo.controller.form.AgendaForm;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.Agenda;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.Cliente;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.ConfiguracaoAgenda;
import br.com.AgendaAutonoma.agendaAutonomo.repository.AgendaRepository;
import br.com.AgendaAutonoma.agendaAutonomo.service.AgendaService;

@Service
public class AgendaServiceImpl implements AgendaService {
	static private Agenda agenda;
	@Autowired
	AgendaRepository agendaRepository;
	
	static private ConfiguracaoAgenda ca;
	static private List<ConfiguracaoAgenda>configuracoesAgenda;

	@Override
	public Agenda salvarAgenda(AgendaForm form) {
		
		createObject();
		incluirConfigAgenda(form);
		
		//ModelMapper mapper = new ModelMapper();
		//agenda = mapper.map(form, Agenda.class);
		agenda = agendaRepository.save(agenda);
		
		return agenda;
	}
	private void incluirConfigAgenda(AgendaForm form) {
		configuracoesAgenda.clear();
		
		for (int i = 0; i < form.getConfiguracaoAgenda().size(); i++) {

			if (form.getConfiguracaoAgenda().get(i).getId() !=0) {
				
				Long id = form.getConfiguracaoAgenda().get(i).getId();
				ca.setId(id);
				configuracoesAgenda.add(ca);
				agenda.setConfiguracaoAgenda(configuracoesAgenda);
				ca = new ConfiguracaoAgenda();
				
			}
		}
				
	}
	private void createObject() {
		ca = new ConfiguracaoAgenda();
		agenda = new Agenda();
		configuracoesAgenda = new ArrayList<>();
		
	}
}
