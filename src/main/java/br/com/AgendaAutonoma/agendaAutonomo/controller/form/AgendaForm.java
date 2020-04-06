package br.com.AgendaAutonoma.agendaAutonomo.controller.form;

import java.util.ArrayList;
import java.util.List;

import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.ConfiguracaoAgendaDto;

public class AgendaForm {
	
	private List <ConfiguracaoAgendaDto> configuracaoAgenda = new ArrayList<>();
	
	public List<ConfiguracaoAgendaDto> getConfiguracaoAgenda() {
		return configuracaoAgenda;
	}


	public void setConfiguracaoAgenda(List<ConfiguracaoAgendaDto> configuracaoAgenda) {
		this.configuracaoAgenda =configuracaoAgenda;
		/*
		for(int i=0; i< getConfiguracaoAgenda().size(); i++) {
			this.configuracaoAgenda.get(i).setId(id.get(i).getId());
			
		}
		*/
		
	}



}
