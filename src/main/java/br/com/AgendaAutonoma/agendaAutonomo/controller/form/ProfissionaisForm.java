package br.com.AgendaAutonoma.agendaAutonomo.controller.form;

import java.util.List;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.Profissional;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.ServicoOferecido;

public class ProfissionaisForm {
	private String nome;
	private String telefone;
	private String email;
	private String numeroConselho;
	private String cargo;
	private String nomeComercial;
	//private Usuario usuario = new Usuario();
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public String getNomeComercial() {
		return nomeComercial;
	}


	public void setNomeComercial(String nomeGrupoComercial) {
		this.nomeComercial = nomeGrupoComercial;
	}


	public String getNumeroConselho() {
		return numeroConselho;
	}


	public void setNumeroConselho(String numeroConselho) {
		this.numeroConselho = numeroConselho;
	}

	
}
