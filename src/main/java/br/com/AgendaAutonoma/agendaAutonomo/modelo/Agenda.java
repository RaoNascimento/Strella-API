package br.com.AgendaAutonoma.agendaAutonomo.modelo;

import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Agenda")
public class Agenda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name="dataUltAlteracao")
	private LocalDate dataUltAlteracao= LocalDate.now();
	

	@OneToOne(cascade = CascadeType.MERGE)
	private ConfiguracaoAgenda configuracaoAgenda;
	
	public Long getId() {
		return id;
	}


	public Agenda setId(Long id) {
		this.id = id;
		return this;
	}


	public LocalDate getDataUltAlteracao() {
		return dataUltAlteracao;
	}


	public void setDataUltAlteracao(LocalDate dataUltAlteracao) {
		this.dataUltAlteracao = dataUltAlteracao;
	}


	public ConfiguracaoAgenda getConfiguracaoAgenda() {
		return configuracaoAgenda;
	}


	public void setConfiguracaoAgenda(ConfiguracaoAgenda configuracaoAgenda) {
		this.configuracaoAgenda = configuracaoAgenda;
	}

}
