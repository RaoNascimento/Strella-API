package br.com.AgendaAutonoma.agendaAutonomo.controller.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.Especialidade;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.ServicoOferecido;
import lombok.Getter;
import lombok.Setter;

public class EspecialidadeDto {

	private String nomeEspecialidade;
	private int tempoAtendimentoMin;
	private String usuUltAlteracao;
	private LocalDate dataUltAlteracao;
	private ServicoOferecido servicoOferecido;
	private Long id;
	
	EspecialidadeDto id(Long id) {
		this.id = id;
		return this;
	}
	
	EspecialidadeDto nomeEspecialidade(String nomeEspecialidade){
		this.nomeEspecialidade = nomeEspecialidade;	
		return this;
	}
	EspecialidadeDto  tempoAtendimentoMin(int tempoAtendimentoMin){
		this. tempoAtendimentoMin = tempoAtendimentoMin;	
		return this;
	}
	
	EspecialidadeDto usuUltAlteracao(String usuUltAlteracao){
		this.usuUltAlteracao = usuUltAlteracao;	
		return this;
	}
	EspecialidadeDto dataUltAlteracao(LocalDate dataUltAlteracao){
		this.dataUltAlteracao = dataUltAlteracao;	
		return this;
	}
	EspecialidadeDto servicoOferecido(ServicoOferecido servicoOferecido){
		this.servicoOferecido = servicoOferecido;	
		return this;
	}

	
	public EspecialidadeDto(Especialidade especialidade ) {
		this.id 					= especialidade.getId();
		this.nomeEspecialidade      = especialidade.getNomeEspecialidade();
		this.tempoAtendimentoMin 	= especialidade.getTempoAtendimentoMin();
		this.usuUltAlteracao 		= especialidade.getUsuUltAlteracao();
		this.dataUltAlteracao 		= especialidade.getDataUltAlteracao();
		this.servicoOferecido       = especialidade.getServicoOferecido();
		//this.profissionais          = servicoOferecido.getProfissionais();
	}
	
	public String getNomeEspecialidade() {
		return nomeEspecialidade;
	}

	public void setNomeEspecialidade(String nomeEspecialidade) {
		this.nomeEspecialidade = nomeEspecialidade;
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

	public ServicoOferecido getServicoOferecido() {
		return servicoOferecido;
	}

	public void setServicoOferecido(ServicoOferecido servicoOferecido) {
		this.servicoOferecido = servicoOferecido;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public static List<EspecialidadeDto> converter(List<Especialidade> especialidades) {
		// TODO Auto-generated method stub
		return especialidades.stream().map(EspecialidadeDto::new).collect(Collectors.toList());
	}
	/*
	public static List<ServicoOferecidoDto> converter(List<ServicoOferecido> servicosOferecidos) { //Passo a lista de tópico e me retorna tópicos dto conversao
		return servicosOferecidos.stream().map(ServicoOferecidoDto::new).collect(Collectors.toList());

}
*/
}
