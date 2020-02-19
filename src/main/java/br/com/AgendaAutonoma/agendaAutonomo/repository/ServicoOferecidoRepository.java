package br.com.AgendaAutonoma.agendaAutonomo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.ServicoEspecialidadeDto;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.ServicoOferecido;

public interface ServicoOferecidoRepository extends JpaRepository<ServicoOferecido, Long> {

	List<ServicoOferecido> findByNome(String nome);

	
	@Query(value="select new br.com.AgendaAutonoma.agendaAutonomo.controller.dto.ServicoEspecialidadeDto(e.nomeEspecialidade, e.tempoAtendimentoMin, s.nome, s.id) "
			+ "from Especialidade e inner join e.servicoOferecido s WHERE s.id = :id ")
	List<ServicoEspecialidadeDto> findServicoEspecialidadeByIdAsDto(@Param("id") Long id);

}
/*
"Select estabelecimentoCurso.cursoDgp from EstabelecimentoCurso as estabelecimentoCurso " +
"join estabelecimentoCurso.cursoDgp as cursoDgp " +
"where estabelecimentoCurso.orgaoCurso = :CODOM " +
"order by cursoDgp.descCurso";
*/