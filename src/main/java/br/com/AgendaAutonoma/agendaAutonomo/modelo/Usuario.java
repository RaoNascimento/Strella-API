package br.com.AgendaAutonoma.agendaAutonomo.modelo;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "auth0")
	private String auth0;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "dataCadastro")
	private LocalDateTime dataCadastro = LocalDateTime.now();
	

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	
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

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}


}
