package br.com.AgendaAutonoma.agendaAutonomo.service;

import java.util.List;

import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.ServicoEspecialidadeDto;
import br.com.AgendaAutonoma.agendaAutonomo.controller.form.ServicoOferecidoForm;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.ServicoOferecido;

public interface ServicoOferecidoService {

	List<ServicoOferecido> listarServicosOferecidos(String nome);

	ServicoOferecido salvarServico(ServicoOferecidoForm form);



}
