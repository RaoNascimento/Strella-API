package br.com.AgendaAutonoma.agendaAutonomo.controller.form;

import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.ConfiguracaoAgendaDto;

public class AgendaForm {
	
	private ConfiguracaoAgendaDto configuracaoAgenda = new ConfiguracaoAgendaDto();
	
	public ConfiguracaoAgendaDto getConfiguracaoAgenda() {
		return configuracaoAgenda;
	}

	public void setConfiguracaoAgenda(Long configuracaoAgenda) {
		this.configuracaoAgenda.setId(configuracaoAgenda);
	}



}
