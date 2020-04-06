package br.com.AgendaAutonoma.agendaAutonomo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.BloqueioAgenda;

public interface BloqueioRepository extends JpaRepository<BloqueioAgenda, Long> {

}
