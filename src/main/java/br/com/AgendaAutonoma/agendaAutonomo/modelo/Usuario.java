package br.com.AgendaAutonoma.agendaAutonomo.modelo;

import java.io.Serializable;

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
	@Column(name = "usuario", nullable = false)
	private String usuario;
	@Column(name = "senha", nullable = false)
	private String senha;
	@Column(name = "perfil", nullable = false)
	private Long perfil;
	@Column(name = "idFacebook")
	private String idFacebook;
	@Column(name = "idGoogle")
	private String idGoogle;
	/*
	@OneToOne(mappedBy = "usuario")
	private Profissional profissional;
*/
	public Long getId() {
		return id;
	}
	
	public String getUsuario() {
		return usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Long getPerfil() {
		return perfil;
	}

	public void setPerfil(Long perfil) {
		this.perfil = perfil;
	}

	public String getIdFacebook() {
		return idFacebook;
	}

	public void setIdFacebook(String idFacebook) {
		this.idFacebook = idFacebook;
	}

	public String getIdGoogle() {
		return idGoogle;
	}

	public void setIdGoogle(String idGoogle) {
		this.idGoogle = idGoogle;
	}



}
