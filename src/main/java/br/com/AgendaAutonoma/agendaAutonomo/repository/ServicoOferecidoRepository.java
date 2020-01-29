package br.com.AgendaAutonoma.agendaAutonomo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.ServicoOferecido;

public interface ServicoOferecidoRepository extends JpaRepository<ServicoOferecido, Long> {

	List<ServicoOferecido> findByNome(String nome);

}
