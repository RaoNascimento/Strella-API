package br.com.AgendaAutonoma.agendaAutonomo.repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.AgendamentoDto;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {

	List<Agendamento> findByDataAgendamento(LocalDate dataAgendamento);

	//List<Agendamento> findOne(String nome);
/*
	@Query(value="new br.com.AgendaAutonoma.agendaAutonomo.controller.dto.AgendamentoDto(a.horarioAtendimento, a.horarioFimAtendimento,"
			+ " a.dataConfirmacaoProfissional, a.id, a.dataAgendamento, s.servicosOferecidos, c.clientes, p.profissionais) FROM Agendamento a"
			+ " inner join a.servicoOferecido s inner join "
			+ " a.cliente c inner join a.profissional p  WHERE a.dataAgendamento = :nome")
		List<AgendamentoDto> buscarAgendaDia(@Param("nome") LocalDate nome);
	*/

}
