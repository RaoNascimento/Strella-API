package br.com.AgendaAutonoma.agendaAutonomo.controller.form;

import java.time.LocalDate;

public class FormEspecialidade {

	private String nome;
	private String usuUltAlteracao;
	private LocalDate dataUltAlteracao;
	
	
	public LocalDate getDataUltAlteracao() {
		return dataUltAlteracao;
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
