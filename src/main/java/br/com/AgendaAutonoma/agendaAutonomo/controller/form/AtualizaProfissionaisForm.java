package br.com.AgendaAutonoma.agendaAutonomo.controller.form;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.Usuario;

public class AtualizaProfissionaisForm {
	
	private String nome;
	private String telefone;
	private String email;
	private String numeroConselho;
	private String cargo;
	private String nomeComercial;
	private Usuario usuario = new Usuario();
	
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
	/*
	public Profissional atualizar(Long id, ProfissionalRepository profissionalRepository) {
		Profissional profissional = profissionalRepository.getOne(id);
		profissional.setNome(this.nome);
		profissional.setCargo(this.cargo);
		profissional.setEmail(this.email);
		profissional.setTelefone(this.telefone);
		profissional.setNomeComercial(this.nomeComercial);
		profissional.setNumeroConselho(this.numeroConselho);
		//profissional.setUsuario(this.usuario);
		
		return  profissional;
		
	}
*/

	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


}
