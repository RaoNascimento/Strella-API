package br.com.AgendaAutonoma.agendaAutonomo.controller.dto;

import java.util.ArrayList;
import java.util.List;

public class AgendaDto {
	
	private Long id;
	
private  List<ConfiguracaoAgendaDto> configuracaoAgenda = new ArrayList<ConfiguracaoAgendaDto>();
	
public List<ConfiguracaoAgendaDto> getConfiguracaoAgenda() {
	return configuracaoAgenda;
}


public void setConfiguracaoAgenda(List<ConfiguracaoAgendaDto> configuracaoAgenda) {
	this.configuracaoAgenda = configuracaoAgenda;
}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


}
