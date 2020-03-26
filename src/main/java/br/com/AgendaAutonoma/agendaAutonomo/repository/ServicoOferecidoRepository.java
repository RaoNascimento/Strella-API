package br.com.AgendaAutonoma.agendaAutonomo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.ServicoOferecido;

public interface ServicoOferecidoRepository extends JpaRepository<ServicoOferecido, Long> {

	List<ServicoOferecido> findByNomeServico(String nome);
/*	
	@Query(value="select new br.com.AgendaAutonoma.agendaAutonomo.controller.dto.ServicoEspecialidadeDto(s.nomeServico, s.tempoAtendimentoMin, e.nomeEspecialidade, e.id) "
			+ "from ServicoOferecido s inner join s.especialidade e WHERE e.id = :id ")
	List<ServicoOferecidoDto> findServicoEspecialidadeByIdAsDto(@Param("id") Long id);
*/
	


}
/*
"Select estabelecimentoCurso.cursoDgp from EstabelecimentoCurso as estabelecimentoCurso " +
"join estabelecimentoCurso.cursoDgp as cursoDgp " +
"where estabelecimentoCurso.orgaoCurso = :CODOM " +
"order by cursoDgp.descCurso";
*/