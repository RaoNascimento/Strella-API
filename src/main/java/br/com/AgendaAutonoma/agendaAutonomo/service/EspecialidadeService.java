package br.com.AgendaAutonoma.agendaAutonomo.service;

import java.util.List;

import javax.validation.Valid;

import br.com.AgendaAutonoma.agendaAutonomo.controller.AtualizaEspecialidadeForm;
import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.ServicoEspecialidadeDto;
import br.com.AgendaAutonoma.agendaAutonomo.controller.form.FormEspecialidade;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.Especialidade;

public interface EspecialidadeService {


	List<Especialidade>buscarEspecialidades(String nome);

	List<ServicoEspecialidadeDto> buscarServicoEspecialidadeById(Long id);

	Especialidade salvarEspecialidade(FormEspecialidade form);

	Especialidade atualizarEspecialidade(Long id, @Valid AtualizaEspecialidadeForm form);

	

}
