package br.com.AgendaAutonoma.agendaAutonomo.controller.form;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.AgendaDto;
import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.ClienteDto;
import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.ProfissionalDto;
import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.ServicoOferecidoDto;

public class AgendamentoForm  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private LocalTime horarioFimAtendimento;

	private String desabilitarHorario;

	private LocalDateTime dataConfirmacaoProfissional;
	private LocalDate dataAgendamento;
	
	public LocalDate getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(LocalDate dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

	private LocalTime horarioAtendimento;

	private AgendaDto agenda = new AgendaDto();
	private List <ClienteDto> clientes = new ArrayList<>();
	private List <ServicoOferecidoDto> servicosOferecidos = new ArrayList<>();

	private List <ProfissionalDto> profissionais = new ArrayList<>();

	public List<ClienteDto> getClientes() {
		return clientes;
	}

	public void setClientes(List<ClienteDto> clientes) {
		this.clientes = clientes;
	}

	public List<ServicoOferecidoDto> getServicosOferecidos() {
		return servicosOferecidos;
	}

	public void setServicosOferecidos(List<ServicoOferecidoDto> servicosOferecidos) {
		this.servicosOferecidos = servicosOferecidos;
	}

	public List<ProfissionalDto> getProfissionais() {
		return profissionais;
	}

	public void setProfissionais(List<ProfissionalDto> profissionais) {
		this.profissionais = profissionais;
	}

	public void setDataConfirmacaoProfissional(LocalDateTime dataConfirmacaoProfissional) {
		this.dataConfirmacaoProfissional = dataConfirmacaoProfissional;
	}

	public LocalTime getHorarioAtendimento() {
		return horarioAtendimento;
	}

	public void setHorarioAtendimento(LocalTime horarioAtendimento) {
		this.horarioAtendimento = horarioAtendimento;
	}

	public LocalTime getHorarioFimAtendimento() {
		return horarioFimAtendimento;
	}

	public void setHorarioFimAtendimento(LocalTime horarioFimAtendimento) {
		this.horarioFimAtendimento = horarioFimAtendimento;
	}

	public String getDesabilitarHorario() {
		return desabilitarHorario;
	}

	public void setDesabilitarHorario(String desabilitarHorario) {
		this.desabilitarHorario = desabilitarHorario;
	}
	

	public LocalDateTime getDataConfirmacaoProfissional() {
		return dataConfirmacaoProfissional;
	}

	public AgendaDto getAgenda() {
		return agenda;
	}

	public void setAgenda(Long agenda) {
		 this.agenda.setId(agenda);
	}
	
}
