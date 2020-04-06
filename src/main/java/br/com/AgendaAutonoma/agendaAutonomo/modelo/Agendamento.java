package br.com.AgendaAutonoma.agendaAutonomo.modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "Agendamento")
public class Agendamento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "horarioAtendimento")
	private LocalTime horarioAtendimento;
	
	@Column(name = "horarioFimAtendimento")
	private LocalTime horarioFimAtendimento;
	
	@Column(name = "dataUltAtualizacao")
	private LocalDate dataUltAlteracao = LocalDate.now();
	
	@Column(name = "desabilitarHorario")
	private String desabilitarHorario;
	
	@Column(name = "dataConfirmacaoProfissional")
	private LocalDateTime dataConfirmacaoProfissional;
	
	@Column(name="dataAgendamento")
	private LocalDate dataAgendamento;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	private Agenda agenda;
	
	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name = "Agendamento_Profissional", 
	joinColumns = { @JoinColumn(name = "profissional_id") }, 
	inverseJoinColumns = @JoinColumn(name="Agendamento_id"))
	private List<Profissional> profissionais;
	
	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name = "Agendamento_Cliente",
	joinColumns = { @JoinColumn(name = "cliente_id") },
	inverseJoinColumns = @JoinColumn(name="Agendamento_id"))
	private List<Cliente> clientes;
	
	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name = "Agendamento_ServicoOferecido",
	joinColumns = { @JoinColumn(name = "servicoOferecido_id") },
	inverseJoinColumns = @JoinColumn(name="Agendamento_id"))
	private List<ServicoOferecido> servicosOferecidos;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getDataAgendamento() {
		return dataAgendamento;
	}
	public void setDataAgendamento(LocalDate dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
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
	public LocalDate getDataUltAlteracao() {
		return dataUltAlteracao;
	}
	public void setDataUltAlteracao(LocalDate dataUltAlteracao) {
		this.dataUltAlteracao = dataUltAlteracao;
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
	public Agenda getAgenda() {
		return agenda;
	}
	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}
	public List<Profissional> getProfissionais() {
		return profissionais;
	}
	public void setProfissionais(List<Profissional> profissionais) {
		this.profissionais = profissionais;
	}
	public List<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	public List<ServicoOferecido> getServicosOferecidos() {
		return servicosOferecidos;
	}
	public void setServicosOferecidos(List<ServicoOferecido> servicosOferecidos) {
		this.servicosOferecidos = servicosOferecidos;
	}
	
	
	public Agendamento horarioAtendimento(LocalTime horarioAtendimento) {
		this.horarioAtendimento = horarioAtendimento;
		return this;
	}
	public Agendamento horarioFimAtendimento(LocalTime horarioFimAtendimento) {
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
