package br.com.AgendaAutonoma.agendaAutonomo.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

public class ServicoEspecialidadeDto {
	
	private Long id;
	private String nome;
	private String nomeEspecialidade;
	private int tempoAtendimentoMin;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeEspecialidade() {
		return nomeEspecialidade;
	}
	public void setNomeEspecialidade(String nomeEspecialidade) {
		this.nomeEspecialidade = nomeEspecialidade;
	}
	public int getTempoAtendimentoMin() {
		return tempoAtendimentoMin;
	}
	public void setTempoAtendimentoMin(int tempoAtendimentoMin) {
		this.tempoAtendimentoMin = tempoAtendimentoMin;
	}
	public ServicoEspecialidadeDto(ServicoEspecialidadeDto servicoespecialidades) { //construtor - Eu passo as informações ele preenche e retorna ainfo deste Dto
		this.id = servicoespecialidades.getId();
		this.nome = servicoespecialidades.getNome();
		this.nomeEspecialidade = servicoespecialidades.getNomeEspecialidade();
		this.tempoAtendimentoMin = servicoespecialidades.getTempoAtendimentoMin();
		
	}
	
	
	public ServicoEspecialidadeDto(String nomeEspecialidade, int tempoAtendimentoMin, String nome, Long id) {
		super();
		this.id = id;
		this.nome = nome;
		this.nomeEspecialidade = nomeEspecialidade;
		this.tempoAtendimentoMin = tempoAtendimentoMin;
	}
	public static List<ServicoEspecialidadeDto> converter(List<ServicoEspecialidadeDto> servicoespecialidades) { //Passo a lista de tópico e me retorna tópicos dto conversao
		return servicoespecialidades.stream().map(ServicoEspecialidadeDto::new).collect(Collectors.toList());

}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
