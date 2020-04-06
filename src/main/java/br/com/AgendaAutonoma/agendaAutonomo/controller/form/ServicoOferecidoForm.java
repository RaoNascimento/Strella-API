package br.com.AgendaAutonoma.agendaAutonomo.controller.form;

import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.EspecialidadeDto;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ServicoOferecidoForm {
	
	private String nomeServico;
	//private String usuUltAlteracao;
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
		
}
