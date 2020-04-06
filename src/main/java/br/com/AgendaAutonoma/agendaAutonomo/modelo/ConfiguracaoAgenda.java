package br.com.AgendaAutonoma.agendaAutonomo.modelo;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ConfiguracaoAgenda")
public class ConfiguracaoAgenda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "horaInicioExp")
	private LocalTime horaInicioExp;
	
	@Column(name = "horaFimExp")
	private LocalTime horaFimExp;
	
	@Column(name = "horaInicioPausa")
	private LocalTime horaInicioPausa;
	
	@Column(name = "horaFimPausa")
	private LocalTime horaFimPausa;
	
	@Column(name = "ativo")
	private int ativo;
	
	@Column(name = "diaSemana")
	private int diaSemana;

	public int getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(int diaSemana) {
		this.diaSemana = diaSemana;
	}

	public Long getId() {
		return id;
	}

	public Long setId(Long id) {
		this.id = id;
		return id;
	}

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

	

}
