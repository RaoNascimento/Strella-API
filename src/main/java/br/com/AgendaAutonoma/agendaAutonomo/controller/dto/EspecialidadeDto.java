package br.com.AgendaAutonoma.agendaAutonomo.controller.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.Especialidade;

public class EspecialidadeDto {
	
	private Long id;
	private String nome;
	private String usuUltAlteracao;
	private LocalDate dataUltAlteracao;
	
	
	public LocalDate getDataUltAlteracao() {
		return dataUltAlteracao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
 
	public String getUsuUltAlteracao() {
		return usuUltAlteracao;
	}

	public void setUsuUltAlteracao(String usuUltAlteracao) {
		this.usuUltAlteracao = usuUltAlteracao;
	}
}
