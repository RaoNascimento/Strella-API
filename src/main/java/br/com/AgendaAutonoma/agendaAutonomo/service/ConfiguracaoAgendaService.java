package br.com.AgendaAutonoma.agendaAutonomo.service;

import java.util.List;

import br.com.AgendaAutonoma.agendaAutonomo.controller.form.ConfiguracaoAgendaForm;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.ConfiguracaoAgenda;

public interface ConfiguracaoAgendaService {

	ConfiguracaoAgenda salvarConfiguracaoAgenda(ConfiguracaoAgendaForm form);

	List<ConfiguracaoAgenda> listarConfiguracao(String nome);

}
