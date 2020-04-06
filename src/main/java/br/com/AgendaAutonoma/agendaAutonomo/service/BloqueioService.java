package br.com.AgendaAutonoma.agendaAutonomo.service;

import java.util.List;

import br.com.AgendaAutonoma.agendaAutonomo.controller.form.BloqueioForm;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.BloqueioAgenda;

public interface BloqueioService {

	public BloqueioAgenda inserirBloqueio(BloqueioForm form);

	public List<BloqueioAgenda> listarBloqueios();

}
