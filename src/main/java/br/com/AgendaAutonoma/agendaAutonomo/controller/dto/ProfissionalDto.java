package br.com.AgendaAutonoma.agendaAutonomo.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.Profissional;
import lombok.AllArgsConstructor;
@AllArgsConstructor
public class ProfissionalDto {

	private Long id;
	private String nome;
	private String telefone;
	private String email;
	private String cargo;
	private String nomeComercial;
	//private Usuario usuario = new Usuario();
	private String numeroConselho;
	
	
	public ProfissionalDto(Profissional profissional) { //construtor - Eu passo as informações ele preenche e retorna ainfo deste Dto
		this.id = profissional.getId();
		this.nome = profissional.getNome();
		this.cargo = profissional.getCargo();
		this.telefone = profissional.getTelefone();
		this.email = profissional.getEmail();
		this.numeroConselho = profissional.getNumeroConselho();
		this.nomeComercial = profissional.getNomeComercial();
		//this.usuario = profissional.getUsuario();
		
	}

	
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


	public static List<ProfissionalDto> converter(List<Profissional> profissionais) { //Passo a lista de tópico e me retorna tópicos dto conversao
		return profissionais.stream().map(ProfissionalDto::new).collect(Collectors.toList());
		
		// topicos com stream java 8 recebe topicos da classe Topico e retorna o dto
		//o map faz a busca de cada atributo, o Topico::new instanciando (Chama o construtor) os objetos do Dto
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

	

}
