package br.com.AgendaAutonoma.agendaAutonomo.modelo;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Table(name="servicoOferecido")
public class ServicoOferecido {
	
	 @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id")
	private Long id;
	 @Column(name = "tempoAtendimentoMin")
	private int tempoAtendimentoMin;
	 @Column(name = "nome")
	private String nome;
	 @Column(name = "preco")
	private String preco;
	 
	 @ManyToMany
	 @JoinTable(name="profissional_servico",
	 joinColumns = @JoinColumn(name = "codServicoOferecido"), 
	 inverseJoinColumns = @JoinColumn(name = "codProfissional")) 	
	private List<Profissional> Profissionais;
	

}
