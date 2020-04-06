package br.com.AgendaAutonoma.agendaAutonomo.controller.dto;

import java.time.LocalDate;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.Especialidade;

public class ServicoOferecidoDto {

	private String nomeServico;
	private int tempoAtendimentoMin;
	private String usuUltAlteracao;
	private LocalDate dataUltAlteracao;
	private Especialidade especialidade;
	private Long id;

	ServicoOferecidoDto id(Long id) {
		this.id = id;
		return this;
	}

	

	public String getNomeServico() {
		return nomeServico;
	}



	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}



	public int getTempoAtendimentoMin() {
		return tempoAtendimentoMin;
	}



	public void setTempoAtendimentoMin(int tempoAtendimentoMin) {
		this.tempoAtendimentoMin = tempoAtendimentoMin;
	}



	public String getUsuUltAlteracao() {
		return usuUltAlteracao;
	}



	public void setUsuUltAlteracao(String usuUltAlteracao) {
		this.usuUltAlteracao = usuUltAlteracao;
	}



	public LocalDate getDataUltAlteracao() {
		return dataUltAlteracao;
	}



	public void setDataUltAlteracao(LocalDate dataUltAlteracao) {
		this.dataUltAlteracao = dataUltAlteracao;
	}
	
	public void ServicoOferecido(Long id) {
		this.id = id;
		
	}



	public Especialidade getEspecialidade() {
		return especialidade;
	}



	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}

	
	
	
	
	
	
	

	/*
	public ServicoOferecidoDto(ServicoOferecido servicoOferecido) {
		this.id 				 = servicoOferecido.getId();
		this.nomeServico         = servicoOferecido.getNomeServico();
		this.tempoAtendimentoMin = servicoOferecido.getTempoAtendimentoMin();
		this.usuUltAlteracao     = servicoOferecido.getUsuUltAlteracao();
		this.dataUltAlteracao    = servicoOferecido.getDataUltAlteracao();
		this.especialidade       = servicoOferecido.getEspecialidade();
		// this.profissionais = servicoOferecido.getProfissionais();
	}

	public static List<ServicoOferecidoDto> converter(List<ServicoOferecido> servicoOferecidos) {
		// TODO Auto-generated method stub
		return servicoOferecidos.stream().map(ServicoOferecidoDto::new).collect(Collectors.toList());
	}
	
	
	 */
}
