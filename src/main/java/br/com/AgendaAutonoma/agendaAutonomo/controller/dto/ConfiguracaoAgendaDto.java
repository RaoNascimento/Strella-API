package br.com.AgendaAutonoma.agendaAutonomo.controller.dto;

import java.time.LocalTime;

public class ConfiguracaoAgendaDto {

	private Long id;
	
	private LocalTime horaInicioExp;
	
	private LocalTime horaFimExp;
	
	private LocalTime horaInicioPausa;
	
	private LocalTime horaFimPausa;
	
	private int ativo;
	
	public LocalTime getHoraInicioExp() {
		return horaInicioExp;
	}

	public void setHoraInicioExp(LocalTime horaInicioExp) {
		this.horaInicioExp = horaInicioExp;
	}

	public LocalTime getHoraFimExp() {
		return horaFimExp;
	}

	public void setHoraFimExp(LocalTime horaFimExp) {
		this.horaFimExp = horaFimExp;
	}

	public LocalTime getHoraInicioPausa() {
		return horaInicioPausa;
	}

	public void setHoraInicioPausa(LocalTime horaInicioPausa) {
		this.horaInicioPausa = horaInicioPausa;
	}

	public LocalTime getHoraFimPausa() {
		return horaFimPausa;
	}

	public void setHoraFimPausa(LocalTime horaFimPausa) {
		this.horaFimPausa = horaFimPausa;
	}

	public int getAtivo() {
		return ativo;
	}

	public void setAtivo(int ativo) {
		this.ativo = ativo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
