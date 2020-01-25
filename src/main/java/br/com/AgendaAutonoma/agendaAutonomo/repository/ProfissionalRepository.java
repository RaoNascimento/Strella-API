package br.com.AgendaAutonoma.agendaAutonomo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.Profissional;

public interface ProfissionalRepository extends JpaRepository<Profissional, Long> {

	List<Profissional> findByNome(String nome);


}
