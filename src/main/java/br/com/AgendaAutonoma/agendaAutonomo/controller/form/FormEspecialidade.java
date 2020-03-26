package br.com.AgendaAutonoma.agendaAutonomo.controller.form;

import java.time.LocalDate;

public class FormEspecialidade {

	private String nomeEspecialidade;
	private String usuUltAlteracao;
	private LocalDate dataUltAlteracao;
	
	
	public LocalDate getDataUltAlteracao() {
		return dataUltAlteracao;
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

}
