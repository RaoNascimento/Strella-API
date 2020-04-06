package br.com.AgendaAutonoma.agendaAutonomo.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="Cliente")
public class Cliente  implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	@Column(name = "email")
	private String email;
	@Column(name = "telefone")
	private String telefone;
	@Column(name = "nome")
	private String nome;
	@Column(name = "dataNascimento")
	private LocalDate dataNascimento;
	
	@Column(name = "dataUltAtualizacao")
	private  LocalDateTime dataUltatualizacao = LocalDateTime.now();
	
	@ManyToMany(mappedBy = "clientes")
	 private List<Agendamento> agendamentos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public LocalDateTime getDataUltatualizacao() {
		return dataUltatualizacao;
	}

	public void setDataUltatualizacao(LocalDateTime dataUltatualizacao) {
		this.dataUltatualizacao = dataUltatualizacao;
	}

	
	

}
