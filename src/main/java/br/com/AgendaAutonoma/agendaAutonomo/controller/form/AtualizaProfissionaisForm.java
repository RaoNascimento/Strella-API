package br.com.AgendaAutonoma.agendaAutonomo.controller.form;

import java.util.ArrayList;
import java.util.List;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.Especialidade;

public class AtualizaProfissionaisForm {
	
	private String nome;
	private String telefone;
	private String email;
	private String numeroConselho;
	private String cargo;
	private String nomeComercial;
	private List<Especialidade>especialidades = new ArrayList<>();
	
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


	public String getNumeroConselho() {
		return numeroConselho;
	}


	public void setNumeroConselho(String numeroConselho) {
		this.numeroConselho = numeroConselho;
	}


	public String getNomeComercial() {
		return nomeComercial;
	}


	public void setNomeComercial(String nomeGrupoComercial) {
		this.nomeComercial = nomeGrupoComercial;
	}
	

	public List<Especialidade> getServicos() {
		return especialidades;
	}


	public void setServicos(List<Especialidade> servicos) {
		this.especialidades = servicos;
	}
	

}
