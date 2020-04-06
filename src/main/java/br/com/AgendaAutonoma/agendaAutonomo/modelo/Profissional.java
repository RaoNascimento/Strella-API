package br.com.AgendaAutonoma.agendaAutonomo.modelo;

import java.io.Serializable;
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
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="Profissional")
public class Profissional implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	private String nome;
	private String telefone;
	@Column(name = "email")
	private String email;
	@Column(name = "numConselho")
	private String numeroConselho;
	@Column(name = "cargo")
	private String cargo;
	@Column(name = "nomeComercial")
	private String nomeComercial;
	
	 @ManyToMany(cascade = CascadeType.ALL)
	 @JoinTable(name="profissional_especialidade",
	 joinColumns = { @JoinColumn(name = "profissional_id")}, 
	 inverseJoinColumns = {@JoinColumn(name = "especialidade_id")})  
	private List<Especialidade>especialidades;
	 
	 @ManyToMany(mappedBy = "profissionais", cascade = CascadeType.MERGE)
	 private List<Agendamento> agendamentos;
	 
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


		public List<Especialidade> getEspecialidades() {
			return especialidades;
		}


		public void setEspecialidades(List<Especialidade> especialidades) {
			this.especialidades =especialidades;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public Profissional nome(String nome) {
		    this.nome = nome;
		    return this;
	  } 
	  public Profissional nomeComercial(String nomeComercial) {
		    this.nomeComercial = nomeComercial;
		    return this;
	  }    

	  public Profissional cargo(String cargo) {
		  this.cargo = cargo;
		    return this;
	}
	  public Profissional telefone(String telefone) {
		  this.telefone = telefone;
		    return this;
	}
	  public Profissional email(String email) {
		  this.email = email;
		    return this;
	}
	  public Profissional numConselho(String numeroConselho) {
		  this.numeroConselho = numeroConselho;
		    return this;
	}
	 
	  public Profissional servicosOferecidos(List<Especialidade> servicosOferecidos) {
		  this.especialidades = servicosOferecidos;
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
