package br.com.AgendaAutonoma.agendaAutonomo.serviceImpl;

import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.AgendaAutonoma.agendaAutonomo.controller.form.AtualizaServicoOferecidoForm;
import br.com.AgendaAutonoma.agendaAutonomo.controller.form.ServicoOferecidoForm;
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
	public List<ServicoOferecido> listarServicosOferecidos(String nomeServico) {
		if (nomeServico == null) {
			return servicoOferecidoRepository.findAll();
		} else {
			List<ServicoOferecido> servicosOferecidos = servicoOferecidoRepository.findByNomeServico(nomeServico);
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

	@Override
	public ServicoOferecido atualizarServicoOferecido(Long id, @Valid AtualizaServicoOferecidoForm form) {
		ModelMapper mapper = new ModelMapper();
		ServicoOferecido servicoOferecido = mapper.map(form, ServicoOferecido.class);
		 servicoOferecido =  servicoOferecidoRepository.getOne(id);
		 
		 if(!form.getNomeServico().isEmpty()) { servicoOferecido.nomeServico(form.getNomeServico()); }
		 servicoOferecido.nomeServico(servicoOferecido.getNomeServico());
		
		if(!form.getUsuUltAlteracao().isEmpty())   { servicoOferecido.usuUltAlteracao(form.getUsuUltAlteracao()); }
		servicoOferecido.usuUltAlteracao(servicoOferecido.getUsuUltAlteracao());
		
		if(form.getTempoAtendimentoMin()!=0)   { servicoOferecido.tempoAtendimentoMin(form.getTempoAtendimentoMin()); }
		servicoOferecido.tempoAtendimentoMin(servicoOferecido.getTempoAtendimentoMin());
	
		servicoOferecido.especialidade(servicoOferecido.getEspecialidade());
		
		return servicoOferecido;
	}

}
