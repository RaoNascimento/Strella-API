package br.com.AgendaAutonoma.agendaAutonomo.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.AgendaAutonoma.agendaAutonomo.controller.form.AgendaForm;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.Agenda;
import br.com.AgendaAutonoma.agendaAutonomo.repository.AgendaRepository;
import br.com.AgendaAutonoma.agendaAutonomo.service.AgendaService;

@Service
public class AgendaServiceImpl implements AgendaService {
	Agenda agenda;
	@Autowired
	AgendaRepository agendaRepository;

	@Override
	public Agenda salvarAgenda(AgendaForm form) {
		
		ModelMapper mapper = new ModelMapper();
		agenda = mapper.map(form, Agenda.class);
		agenda = agendaRepository.save(agenda);
		
		return agenda;
	}


}
