package br.com.AgendaAutonoma.agendaAutonomo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.ServicoEspecialidadeDto;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.Especialidade;

public interface EspecialidadeRepository extends JpaRepository<Especialidade, Long>  {

	List<Especialidade> findByNomeEspecialidade(String nome);
	
	@Query(value="select new br.com.AgendaAutonoma.agendaAutonomo.controller.dto.ServicoEspecialidadeDto(s.nomeServico, s.tempoAtendimentoMin, e.nomeEspecialidade, e.id) "
			+ "from ServicoOferecido s inner join s.especialidade e WHERE e.id = :id ")
	List<ServicoEspecialidadeDto> findServicoEspecialidadeByIdAsDto(@Param("id") Long id);
	
	
}
