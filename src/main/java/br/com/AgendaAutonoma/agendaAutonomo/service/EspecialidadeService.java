package br.com.AgendaAutonoma.agendaAutonomo.service;

import java.util.List;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.Especialidade;

public interface EspecialidadeService {


	List<Especialidade>buscarEspecialidades(String nome);

}
