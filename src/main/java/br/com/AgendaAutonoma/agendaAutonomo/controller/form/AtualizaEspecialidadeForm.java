package br.com.AgendaAutonoma.agendaAutonomo.controller.form;

import java.time.LocalDate;

public class AtualizaEspecialidadeForm {
	private Long id;
	private String nomeEspecialidade;
	private String usuUltAlteracao;
	private LocalDate dataUltAlteracao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeEspecialidade() {
		return nomeEspecialidade;
	}
	public void setNomeEspecialidade(String nome) {
		this.nomeEspecialidade = nome;
	}
	public String getUsuUltAlteracao() {
		return usuUltAlteracao;
	}
	public void setUsuUltAlteracao(String usuUltAlteracao) {
		this.usuUltAlteracao = usuUltAlteracao;
	}
	public LocalDate getDataUltAlteracao() {
		return dataUltAlteracao;
	}
	public void setDataUltAlteracao(LocalDate dataUltAlteracao) {
		this.dataUltAlteracao = dataUltAlteracao;
	}
	

}
