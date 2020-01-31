package br.com.AgendaAutonoma.agendaAutonomo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.AgendaAutonoma.agendaAutonomo.controller.form.AtualizaProfissionaisForm;
import br.com.AgendaAutonoma.agendaAutonomo.controller.form.ProfissionaisForm;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.Profissional;

public interface ProfissionalService {
	
	Profissional salvarProfissional(ProfissionaisForm form);

	Profissional atualizarProfissional(Long id, AtualizaProfissionaisForm form);

	Page<Profissional> listarProfissional(String nome, Pageable paginacao);

}
