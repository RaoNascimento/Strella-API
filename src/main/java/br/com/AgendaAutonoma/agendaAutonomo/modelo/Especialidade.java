package br.com.AgendaAutonoma.agendaAutonomo.modelo;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
@Entity
@Table(name = "Especialidade")
public class Especialidade implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	@Column(name = "nomeEspecialidade")
	private String nomeEspecialidade;
	@Column(name = "usuUltAlteracao")
	private String usuUltAlteracao;
	@Column(name = "dataAtualizacao")
	private LocalDate dataUltAlteracao = LocalDate.now();
	
	
	public Long getId() {
		return id;
	}

	public Especialidade setId(Long id) {
		this.id = id;
		return this;
	}

	public String getNomeEspecialidade() {
		return nomeEspecialidade;
	}

	public void setNomeEspecialidade(String nomeEspecialidade) {
		this.nomeEspecialidade = nomeEspecialidade;
	}

	public LocalDate getDataUltAlteracao() {
		return  java.time.LocalDate.now(); 
	}

	public String getUsuUltAlteracao() {
		return usuUltAlteracao;
	}

	public void setUsuUltAlteracao(String usuUltAlteracao) {
		this.usuUltAlteracao = usuUltAlteracao;
	}

	public Especialidade nomeEspecialidade(String nomeEspecialidade) {
	
		this.nomeEspecialidade = nomeEspecialidade;
		return this;
	}
	public Especialidade dataUltAlteracao(LocalDate dataUltAlteracao) {
		
		this.dataUltAlteracao =  dataUltAlteracao;
		return this;
	}
	public Especialidade usuUltAlteracao(String usuUltAlteracao) {
		
		this.usuUltAlteracao = usuUltAlteracao;
		return this;
	}
	public Especialidade id(Long id) {
		this.id = id;
		return this;
	}
	
	@Override

	public int hashCode() {

		final int prime = 31;

		int result = 1;

		result = prime * result + ((id == null) ? 0 : id.hashCode());

		return result;

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
