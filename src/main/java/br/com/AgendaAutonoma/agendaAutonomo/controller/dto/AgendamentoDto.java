package br.com.AgendaAutonoma.agendaAutonomo.controller.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class AgendamentoDto {
	
	private Long id;
	private LocalTime horarioFimAtendimento;
	private String desabilitarHorario;

	private LocalDateTime dataConfirmacaoProfissional;
	
	private LocalTime horarioAtendimento;
	private LocalDate dataAgendamento;

	public LocalDate getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(LocalDate dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

	private AgendaDto agenda = new AgendaDto();
	private List <ClienteDto> clientes = new ArrayList<>();
	private List <ServicoOferecidoDto> servicosOferecidos = new ArrayList<>();

	private List <ProfissionalDto> profissionais = new ArrayList<>();
	
	
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

	public void setDataConfirmacaoProfissional(LocalDateTime dataConfirmacaoProfissional) {
		this.dataConfirmacaoProfissional = dataConfirmacaoProfissional;
	}

	public LocalTime getHorarioAtendimento() {
		return horarioAtendimento;
	}

	public void setHorarioAtendimento(LocalTime horarioAtendimento) {
		this.horarioAtendimento = horarioAtendimento;
	}

	public AgendaDto getAgenda() {
		return agenda;
	}

	public void setAgenda(AgendaDto agenda) {
		this.agenda = agenda;
	}

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
	public AgendamentoDto(LocalTime horarioAtendimento, LocalTime horarioFimAtendimento, LocalDateTime dataConfirmacaoProfissional,
			Long id, LocalDate dataAgendamento, Long servicosOferecidos, Long clientes, Long profissionais ) {
		super();
		this.id = id;
		this.horarioAtendimento = horarioAtendimento;
		this.horarioFimAtendimento = horarioFimAtendimento;
		this.dataConfirmacaoProfissional = dataConfirmacaoProfissional;
		this.dataAgendamento = dataAgendamento;
		//this.clientes.add(new ClienteDto));
		//this.profissionais = profissionais;
		//this.servicosOferecidos = servicosOferecidos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



}
