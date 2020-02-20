package br.com.AgendaAutonoma.agendaAutonomo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.ServicoOferecido;
import br.com.AgendaAutonoma.agendaAutonomo.repository.ServicoOferecidoRepository;
import br.com.AgendaAutonoma.agendaAutonomo.service.ServicoOferecidoService;

@Service
public class ServicoOferecidoServiceImpl implements ServicoOferecidoService {
	@Autowired
	ServicoOferecidoService service;
	@Autowired
	ServicoOferecidoRepository servicoOferecidoRepository;

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



}
