package br.com.AgendaAutonoma.agendaAutonomo.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Profissional")
public class Profissional implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	@Column(name = "nome", nullable = false)
	private String nome;
	@Column(name = "telefone", nullable = false)
	private String telefone;
	@Column(name = "email")
	private String email;
	@Column(name = "numConselho")
	private String numeroConselho;
	@Column(name = "cargo")
	private String cargo;
	@Column(name = "nomeComercial")
	private String nomeComercial;
	/*
	@OneToOne
	@JoinColumn(name = "codigoUsuario", referencedColumnName = "id")
	private Usuario usuario;
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

*/
	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumeroConselho() {
		return numeroConselho;
	}

	public void setNumeroConselho(String numeroConselho) {
		this.numeroConselho = numeroConselho;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNomeComercial() {
		return nomeComercial;
	}

	public void setNomeComercial(String nomeComercial) {
		this.nomeComercial = nomeComercial;
	}
	/*
	public Profissional (String nome) {
		this.nome = nome;
	}
	*/

	
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

	final Profissional other = (Profissional) obj;

	if (id == null) {

	if (other.id != null)

	return false;

	} else if (!id.equals(other.id))

	return false;

	return true;

	}

	@Override public String toString() {
        return "{" +
        "\"id\":\"" + id + "\"" +
        ",\"nome\":\"" + nome + "\"" +
        ",\"telefone\":\"" + telefone + "\"" +
        ",\"email\":\"" + email + "\"" +
        ",\"numeroConselho\":\"" + numeroConselho + "\"" +
        ",\"cargo\":\"" + cargo + "\"" +
        ",\"nomeComercial\":\"" + nomeComercial + "\"" +
        "}";
    }




}
