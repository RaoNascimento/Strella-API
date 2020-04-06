package br.com.AgendaAutonoma.agendaAutonomo.controller.dto;

public class AgendaDto {
	
	private Long id;
	
private ConfiguracaoAgendaDto configuracaoAgenda = new ConfiguracaoAgendaDto();
	
	public ConfiguracaoAgendaDto getConfiguracaoAgenda() {
		return configuracaoAgenda;
	}

	public void setConfiguracaoAgenda(Long configuracaoAgenda) {
		this.configuracaoAgenda.setId(configuracaoAgenda);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


}
