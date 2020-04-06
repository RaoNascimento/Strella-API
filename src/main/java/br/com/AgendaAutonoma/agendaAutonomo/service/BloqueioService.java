package br.com.AgendaAutonoma.agendaAutonomo.service;

import br.com.AgendaAutonoma.agendaAutonomo.controller.form.BloqueioForm;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.BloqueioAgenda;

public interface BloqueioService {

	public BloqueioAgenda inserirBloqueio(BloqueioForm form);

}
