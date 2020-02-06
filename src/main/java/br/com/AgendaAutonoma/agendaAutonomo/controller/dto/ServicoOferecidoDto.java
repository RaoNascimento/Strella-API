package br.com.AgendaAutonoma.agendaAutonomo.controller.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.Profissional;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.ServicoOferecido;

public class ServicoOferecidoDto {
	
	private Long id;
	private String nome;
	private String usuUltAlteracao;
	private LocalDate dataUltAlteracao;
	
	
	public LocalDate getDataUltAlteracao() {
		return dataUltAlteracao;
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
 
	public ServicoOferecidoDto(ServicoOferecido servicoOferecido ) {
		this.id 					= servicoOferecido.getId();
		this.nome 					= servicoOferecido.getNome();
		this.usuUltAlteracao        = servicoOferecido.getUsuUltAlteracao();
		this.dataUltAlteracao       = servicoOferecido.getDataUltAlteracao(); 
		
		
		//this.profissionais          = servicoOferecido.getProfissionais();
	}
	
	
	
	public static List<ServicoOferecidoDto> converter(List<ServicoOferecido> servicosOferecidos) { //Passo a lista de tópico e me retorna tópicos dto conversao
		return servicosOferecidos.stream().map(ServicoOferecidoDto::new).collect(Collectors.toList());

}

	public String getUsuUltAlteracao() {
		return usuUltAlteracao;
	}

	public void setUsuUltAlteracao(String usuUltAlteracao) {
		this.usuUltAlteracao = usuUltAlteracao;
	}
}
