package br.com.AgendaAutonoma.agendaAutonomo.controller.dto;

import java.util.List;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.Especialidade;

public class ProfissionalDto {

	private Long id;
	private String nome;
	private String telefone;
	private String email;
	private String cargo;
	private String nomeComercial;
	private String numeroConselho;
	private List<Especialidade>especialidades;
		
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


	public List<Especialidade> getEspecialidades() {
		return especialidades;
	}


	public void setEspecialidades(List<Especialidade> especialidades) {
		this.especialidades = especialidades;
	}

	

}
