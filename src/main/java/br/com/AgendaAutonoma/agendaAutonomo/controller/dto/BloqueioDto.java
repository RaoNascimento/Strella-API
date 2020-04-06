package br.com.AgendaAutonoma.agendaAutonomo.controller.dto;

import java.time.LocalTime;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.Agenda;

public class BloqueioDto {
	private int dia;
	
	private LocalTime horaInicio;

	private LocalTime horaFim;
	
	private String motivo;
	
	private Agenda agenda  = new Agenda();
	
	private Long id;
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public LocalTime getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(LocalTime horaFim) {
		this.horaFim = horaFim;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



}
