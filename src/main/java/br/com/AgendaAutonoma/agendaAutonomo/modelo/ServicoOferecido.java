package br.com.AgendaAutonoma.agendaAutonomo.modelo;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "Servico_oferecido")
public class ServicoOferecido implements Serializable {
	

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "nome_servico")
	private String nomeServico;
	@Column(name = "usu_ult_alteracao")
	private String usuUltAlteracao;
	@Column(name = "data_atualizacao")
	private LocalDate dataUltAlteracao = LocalDate.now();
	@Column(name = "tempo_atendimento_min")
	private int tempoAtendimentoMin;

	@ManyToOne(cascade = CascadeType.ALL)	
	Especialidade especialidade;
	
	public String getNomeServico() {
		return nomeServico;
	}

	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}

	public String getUsuUltAlteracao() {
		return usuUltAlteracao;
	}

	public void setUsuUltAlteracao(String usuUltAlteracao) {
		this.usuUltAlteracao = usuUltAlteracao;
	}

	public LocalDate getDataUltAlteracao() {
		return dataUltAlteracao;
	}

	public void setDataUltAlteracao(LocalDate dataUltAlteracao) {
		this.dataUltAlteracao = dataUltAlteracao;
	}

	public int getTempoAtendimentoMin() {
		return tempoAtendimentoMin;
	}

	public void setTempoAtendimentoMin(int tempoAtendimentoMin) {
		this.tempoAtendimentoMin = tempoAtendimentoMin;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override	
	public int hashCode() {

	final int prime = 31;

	int result = 1;

	result = prime * result + ((id == null) ? 0 : id.hashCode());

	return result;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	
	@Override

	public boolean equals(Object obj) {

	if (this == obj)

	return true;

	if (obj == null)

	return false;

	if (getClass() != obj.getClass())


	return false;

	final ServicoOferecido other = (ServicoOferecido) obj;

	if (id == null) {

	if (other.id != null)

	return false;

	} else if (!id.equals(other.id))

	return false;

	return true;

	}



}
