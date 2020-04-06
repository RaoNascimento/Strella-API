package br.com.AgendaAutonoma.agendaAutonomo.service;

import java.time.LocalDate;
import java.util.List;

import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.AgendamentoDto;
import br.com.AgendaAutonoma.agendaAutonomo.controller.form.AgendamentoForm;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.Agendamento;

public interface AgendamentoService {

	Agendamento salvarAgendamento(AgendamentoForm form);

	List<Agendamento> listarAgendamentoDia(LocalDate nome);

}
