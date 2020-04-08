package br.com.AgendaAutonoma.agendaAutonomo.controller.form;

import java.time.LocalDateTime;

public class UsuarioForm {
		
	private String auth0;
	private String email;
	private LocalDateTime dataCadastro;
	
	public String getAuth0() {
		return auth0;
	}

	public void setAuth0(String auth0) {
		this.auth0 = auth0;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	

}
