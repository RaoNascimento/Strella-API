package br.com.AgendaAutonoma.agendaAutonomo.controller.dto;

import java.time.LocalDateTime;

public class UsuarioDto {

	private Long id;

	private String email;
	
	private String auth0;
	
	private LocalDateTime dataCadastro;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAuth0() {
		return auth0;
	}

	public void setAuth0(String auth0) {
		this.auth0 = auth0;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	

}
