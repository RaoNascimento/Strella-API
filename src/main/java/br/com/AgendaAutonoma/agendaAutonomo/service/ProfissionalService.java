package br.com.AgendaAutonoma.agendaAutonomo.service;

import java.util.List;

import br.com.AgendaAutonoma.agendaAutonomo.controller.form.AtualizaProfissionaisForm;
import br.com.AgendaAutonoma.agendaAutonomo.controller.form.ProfissionaisForm;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.Profissional;

public interface ProfissionalService {
	
	Profissional salvarProfissional(ProfissionaisForm form);

	Profissional atualizarProfissional(Long id, AtualizaProfissionaisForm form);

	List<Profissional> listarProfissional(String nome);

}
