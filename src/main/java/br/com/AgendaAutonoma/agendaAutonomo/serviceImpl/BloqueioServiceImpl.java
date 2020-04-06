package br.com.AgendaAutonoma.agendaAutonomo.serviceImpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.AgendaAutonoma.agendaAutonomo.controller.form.BloqueioForm;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.BloqueioAgenda;
import br.com.AgendaAutonoma.agendaAutonomo.repository.BloqueioRepository;
import br.com.AgendaAutonoma.agendaAutonomo.service.BloqueioService;

@Service
public class BloqueioServiceImpl implements BloqueioService {
	BloqueioAgenda bloqueio;
	@Autowired
	BloqueioRepository bloqueioRepository;

	@Override
	public BloqueioAgenda inserirBloqueio(BloqueioForm form) {
	
		ModelMapper mapper = new ModelMapper();
		bloqueio= mapper.map(form, BloqueioAgenda.class);
		bloqueio = bloqueioRepository.save(bloqueio);
		
		return bloqueio;
	}

	@Override
	public List<BloqueioAgenda> listarBloqueios() {
		List<BloqueioAgenda> bloqueios = bloqueioRepository.findAll();
		return bloqueios;
	}

}
