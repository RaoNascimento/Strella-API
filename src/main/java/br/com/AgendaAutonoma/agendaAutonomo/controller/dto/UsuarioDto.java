package br.com.AgendaAutonoma.agendaAutonomo.controller.dto;

public class UsuarioDto {

	private Long id;

	private String usuario;

	private String senha;

	private Long perfil;
	
	private String idGoogle;
	
	private String  idFacebook;
	
	
	public UsuarioDto(UsuarioDto usuario) {
		this.id = usuario.getId();
		this.usuario = usuario.getUsuario();
		this.senha = usuario.getSenha();
		this.perfil = usuario.getPerfil();
		this.idGoogle = usuario.getIdGoogle();
		this.idFacebook = usuario.getIdFacebook();
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
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

	public String getIdGoogle() {
		return idGoogle;
	}

	public void setIdGoogle(String idGoogle) {
		this.idGoogle = idGoogle;
	}

	public String getIdFacebook() {
		return idFacebook;
	}

	public void setIdFacebook(String idFacebook) {
		this.idFacebook = idFacebook;
	}

}
