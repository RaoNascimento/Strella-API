package br.com.AgendaAutonoma.agendaAutonomo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.Especialidade;

public interface EspecialidadeRepository extends JpaRepository<Especialidade, Long>  {

	List<Especialidade> findByNomeEspecialidade(String nome);

}
