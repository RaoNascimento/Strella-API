package br.com.AgendaAutonoma.agendaAutonomo.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.ManyToMany;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.Profissional;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.ServicoOferecido;

public class ServicoOferecidoDto {
	
	private Long id;
	private int tempoAtendimentoMin;
	private String nome;
	private String preco;
	 private List<Profissional> profissionais;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTempoAtendimentoMin(int tempoAtendimentoMin) {
		this.tempoAtendimentoMin = tempoAtendimentoMin;
	}
	public int getTempoAtendimentoMin() {
		return tempoAtendimentoMin;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	 
	public List<Profissional> getProfissionais() {
		return profissionais;
	}

	public void setProfissionais(List<Profissional> profissionais) {
		this.profissionais = profissionais;
	}

	public ServicoOferecidoDto(ServicoOferecido servicoOferecido ) {
		this.id = servicoOferecido.getId();
		this.tempoAtendimentoMin 	= servicoOferecido.getTempoAtendimentoMin();
		this.nome 					= servicoOferecido.getNome();
		this.preco 					= servicoOferecido.getPreco();
		this.profissionais          = servicoOferecido.getProfissionais();
	}


	
	public static List<ServicoOferecidoDto> converter(List<ServicoOferecido> servicosOferecidos) { //Passo a lista de tópico e me retorna tópicos dto conversao
		return servicosOferecidos.stream().map(ServicoOferecidoDto::new).collect(Collectors.toList());

}
}
