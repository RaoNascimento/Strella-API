package br.com.AgendaAutonoma.agendaAutonomo.controller.form;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.Especialidade;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ServicoOferecidoForm {
	
	private String nomeServico;
	//private String usuUltAlteracao;
	private int tempoAtendimentoMin;

	Especialidade especialidade;

	public String getNomeServico() {
		return nomeServico;
	}

	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}
/*
	public String getUsuUltAlteracao() {
		return usuUltAlteracao;
	}

	public void setUsuUltAlteracao(String usuUltAlteracao) {
		this.usuUltAlteracao = usuUltAlteracao;
	}
*/
	public int getTempoAtendimentoMin() {
		return tempoAtendimentoMin;
	}

	public void setTempoAtendimentoMin(int tempoAtendimentoMin) {
		this.tempoAtendimentoMin = tempoAtendimentoMin;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	

}
