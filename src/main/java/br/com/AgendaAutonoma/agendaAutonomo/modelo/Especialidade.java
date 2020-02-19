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

@Entity
@Table(name = "especialidade")
public class Especialidade implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	@Column(name = "nomeEspecialidade")
	private String nomeEspecialidade;
	@Column(name = "tempoAtendimentoMin")
	private int tempoAtendimentoMin;
	@Column(name = "usuUltAlteracao")
	private String usuUltAlteracao;
	@Column(name = "dataAtualizacao")
	private LocalDate dataUltAlteracao;
	
	@ManyToOne(cascade = CascadeType.ALL)	
	ServicoOferecido servicoOferecido;

	public String getNomeEspecialidade() {
		return nomeEspecialidade;
	}

	public void setNomeEspecialidade(String nomeEspecialidade) {
		this.nomeEspecialidade = nomeEspecialidade;
	}

	public ServicoOferecido getServicoOferecido() {
		return servicoOferecido;
	}

	public void setServicoOferecido(ServicoOferecido servicoOferecido) {
		this.servicoOferecido = servicoOferecido;
	}

	private static final long serialVersionUID = 1L;

	
	
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


	public Especialidade nomeEspecialidade(String nomeEspecialidade) {
		this.nomeEspecialidade = nomeEspecialidade;
		return this;
	}

	public int getTempoAtendimentoMin() {
		return tempoAtendimentoMin;
	}

	public void setTempoAtendimentoMin(int tempoAtendimentoMin) {
		this.tempoAtendimentoMin = tempoAtendimentoMin;
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

	@Override

	public boolean equals(Object obj) {

	if (this == obj)

	return true;

	if (obj == null)

	return false;

	if (getClass() != obj.getClass())


	return false;

	final Especialidade other = (Especialidade) obj;

	if (id == null) {

	if (other.id != null)

	return false;

	} else if (!id.equals(other.id))

	return false;

	return true;

	}



}
