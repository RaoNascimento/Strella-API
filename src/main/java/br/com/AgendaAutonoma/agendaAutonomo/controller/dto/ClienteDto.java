package br.com.AgendaAutonoma.agendaAutonomo.controller.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;


public class ClienteDto {
	
	private Long id;

	private String email;
	
	private String telefone;
	
	private String nome;
	
	private LocalDate dataNascimento;
	
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

}
