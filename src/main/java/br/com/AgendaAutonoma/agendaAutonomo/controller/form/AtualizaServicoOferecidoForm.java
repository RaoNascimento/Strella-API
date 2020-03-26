package br.com.AgendaAutonoma.agendaAutonomo.controller.form;

import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.EspecialidadeDto;

public class AtualizaServicoOferecidoForm {
	
	private Long id;
	private String nomeServico;
	private String usuUltAlteracao;
	private int tempoAtendimentoMin;
	private EspecialidadeDto especialidade = new EspecialidadeDto();

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

	public EspecialidadeDto getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Long especialidade) {
		this.especialidade.setId(especialidade);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuUltAlteracao() {
		return usuUltAlteracao;
	}

	public void setUsuUltAlteracao(String usuUltAlteracao) {
		this.usuUltAlteracao = usuUltAlteracao;
	}


}
