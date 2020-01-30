package br.com.AgendaAutonoma.agendaAutonomo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.Profissional;

public interface ProfissionalRepository extends JpaRepository<Profissional, Long> {

	Page<Profissional> findByNome(String nome, Pageable paginacao);


}
