package br.com.AgendaAutonoma.agendaAutonomo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.Agenda;

public interface AgendaRepository  extends JpaRepository<Agenda, Long> {

}
