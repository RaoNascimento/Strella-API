package br.com.AgendaAutonoma.agendaAutonomo.controller.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.Cliente;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.Profissional;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class ClienteDto {
	
	private Long id;

	private String email;
	
	private String telefone;
	
	private String nome;
	
	private LocalDate dataNascimento;
	
	@JsonProperty(value="dataUltAtualizacao")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDateTime dataUltatualizacao = LocalDateTime.now();

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

	public void setDataUltatualizacao( LocalDateTime dataUltatualizacao) {
		this.dataUltatualizacao = dataUltatualizacao;
	}

	public ClienteDto(Cliente cliente) {
		this.id = cliente.getId();
		this.email = cliente.getEmail();
		this.telefone = cliente.getTelefone();
		this.nome = cliente.getNome();
		this.dataNascimento = cliente.getDataNascimento();
		this.dataUltatualizacao = cliente.getDataUltatualizacao();
	}

	public static List<ClienteDto> converter(List<Cliente> clientes){
		return clientes.stream().map(ClienteDto::new).collect(Collectors.toList());
		
	}
	
	//public static List<ProfissionalDto> converter(List<Profissional> profissionais) { //Passo a lista de tópico e me retorna tópicos dto conversao
		//return profissionais.stream().map(ProfissionalDto::new).collect(Collectors.toList());
}
