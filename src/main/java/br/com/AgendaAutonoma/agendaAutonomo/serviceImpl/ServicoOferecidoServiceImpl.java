package br.com.AgendaAutonoma.agendaAutonomo.serviceImpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.AgendaAutonoma.agendaAutonomo.controller.form.ServicoOferecidoForm;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.Profissional;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.ServicoOferecido;
import br.com.AgendaAutonoma.agendaAutonomo.repository.ServicoOferecidoRepository;
import br.com.AgendaAutonoma.agendaAutonomo.service.ServicoOferecidoService;

@Service
public class ServicoOferecidoServiceImpl implements ServicoOferecidoService {
	@Autowired
	ServicoOferecidoService service;
	@Autowired
	ServicoOferecidoRepository servicoOferecidoRepository;
	ServicoOferecido servicoOferecido;

	@Override
	public List<ServicoOferecido> listarServicosOferecidos(String nome) {
		if (nome == null) {
			List<ServicoOferecido> servicosOferecidos = servicoOferecidoRepository.findAll();
			return servicosOferecidos;
		} else {
			List<ServicoOferecido> servicosOferecidos = servicoOferecidoRepository.findByNomeServico(nome);
			return servicosOferecidos;

		}
	}

	@Override
	public ServicoOferecido salvarServico(ServicoOferecidoForm form) {
		
		ModelMapper mapper = new ModelMapper();
		servicoOferecido = mapper.map(form, ServicoOferecido.class);
		servicoOferecido = servicoOferecidoRepository.save(servicoOferecido);
		return servicoOferecido;
	}



}
