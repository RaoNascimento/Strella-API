package br.com.AgendaAutonoma.agendaAutonomo.modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Agendamento")
public class Agendamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "horarioAtendimento")
	private LocalDateTime horarioAtendimento;
	
	@Column(name = "horarioFimAtendimento")
	private LocalDateTime horarioFimAtendimento;
	
	@Column(name = "dataUltAtualizacao")
	private LocalDate dataUltAlteracao = LocalDate.now();
	
	@Column(name = "desabilitarHorario")
	private String desabilitarHorario;
	
	@Column(name = "dataConfirmacaoProfissional")
	private LocalDateTime dataConfirmacaoProfissional;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Agendamento_Profissional", 
	joinColumns = { @JoinColumn(name = "profissional_id") }, 
	inverseJoinColumns = @JoinColumn(name="Agendamento_id"))
	private List<Profissional> profissionais;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Agendamento_Cliente",
	joinColumns = { @JoinColumn(name = "cliente_id") },
	inverseJoinColumns = @JoinColumn(name="Agendamento_id"))
	private List<Cliente> clientes;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Agendamento_ServicoOferecido",
	joinColumns = { @JoinColumn(name = "servicoOferecido_id") },
	inverseJoinColumns = @JoinColumn(name="Agendamento_id"))
	private List<ServicoOferecido> servicosOferecidos;
	
	public Agendamento horarioAtendimento(LocalDateTime horarioAtendimento) {
		this.horarioAtendimento = horarioAtendimento;
		return this;
	}
	public Agendamento horarioFimAtendimento(LocalDateTime horarioFimAtendimento) {
		this.horarioFimAtendimento = horarioFimAtendimento;
		return this;
	}
	public Agendamento desabilitarHorario(String desabilitarHorario) {
		this.desabilitarHorario = desabilitarHorario;
		return this;
	}
	public Agendamento dataConfirmacaoProfissional(LocalDateTime dataConfirmacaoProfissional) {
		this.dataConfirmacaoProfissional = dataConfirmacaoProfissional;
		return this;
	}

	
	
	@Override

	public boolean equals(Object obj) {

		if (this == obj)

			return true;

		if (obj == null)

			return false;

		if (getClass() != obj.getClass())

			return false;

		final Agendamento other = (Agendamento) obj;

		if (id == null) {

			if (other.id != null)

				return false;

		} else if (!id.equals(other.id))

			return false;

		return true;

	}

}
