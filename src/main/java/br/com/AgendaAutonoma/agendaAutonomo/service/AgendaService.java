package br.com.AgendaAutonoma.agendaAutonomo.service;

import br.com.AgendaAutonoma.agendaAutonomo.controller.form.AgendaForm;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.Agenda;

public interface AgendaService {

	Agenda salvarAgenda(AgendaForm form);

}
