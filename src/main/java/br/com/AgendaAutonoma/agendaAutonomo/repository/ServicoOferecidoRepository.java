package br.com.AgendaAutonoma.agendaAutonomo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.ServicoOferecido;

public interface ServicoOferecidoRepository extends JpaRepository<ServicoOferecido, Long> {

	List<ServicoOferecido> findByNomeServico(String nome);

	


}
/*
"Select estabelecimentoCurso.cursoDgp from EstabelecimentoCurso as estabelecimentoCurso " +
"join estabelecimentoCurso.cursoDgp as cursoDgp " +
"where estabelecimentoCurso.orgaoCurso = :CODOM " +
"order by cursoDgp.descCurso";
*/