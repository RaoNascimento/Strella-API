package br.com.AgendaAutonoma.agendaAutonomo.service;

import java.util.List;

import javax.validation.Valid;

import br.com.AgendaAutonoma.agendaAutonomo.controller.form.AtualizaServicoOferecidoForm;
import br.com.AgendaAutonoma.agendaAutonomo.controller.form.ServicoOferecidoForm;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.ServicoOferecido;

public interface ServicoOferecidoService {

	List<ServicoOferecido> listarServicosOferecidos(String nomeServico);

	ServicoOferecido salvarServico(ServicoOferecidoForm form);

	ServicoOferecido atualizarServicoOferecido(Long id, @Valid AtualizaServicoOferecidoForm form);



}
