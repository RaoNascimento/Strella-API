package br.com.AgendaAutonoma.agendaAutonomo.serviceImpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.AgendaAutonoma.agendaAutonomo.controller.form.AtualizaProfissionaisForm;
import br.com.AgendaAutonoma.agendaAutonomo.controller.form.ProfissionaisForm;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.Profissional;
import br.com.AgendaAutonoma.agendaAutonomo.repository.ProfissionalRepository;
import br.com.AgendaAutonoma.agendaAutonomo.repository.UsuarioRepository;
import br.com.AgendaAutonoma.agendaAutonomo.service.ProfissionalService;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Service
public class ProfissionalServiceImpl implements ProfissionalService {
	@Autowired
	ProfissionalRepository profissionalRepository;

	@Autowired
	UsuarioRepository usuarioRepository;
	Profissional profissional;
	
	public Profissional salvarProfissional(ProfissionaisForm form) {
		
		ModelMapper mapper = new ModelMapper();
		profissional = mapper.map(form, Profissional.class);
		profissional = profissionalRepository.save(profissional);
		return profissional;
	}
	
	public Profissional atualizarProfissional(Long id,  AtualizaProfissionaisForm form) {
		
		Profissional profissional = profissionalRepository.getOne(id);
		
			profissional.nome(form.getNome());
			profissional.email(form.getEmail());
			profissional.cargo(form.getCargo());
			profissional.telefone(form.getTelefone());
			profissional.nomeComercial(form.getNomeComercial());
			profissional.numConselho(form.getNumeroConselho());
	
		return profissional;
	}
	
	public List<Profissional>listarProfissional(String nome){
		
		if (nome == null) {		
			List<Profissional> profissionais = profissionalRepository.findAll();
			return profissionais;
		} else {			
			List<Profissional> profissionais = profissionalRepository.findByNome(nome);
			return profissionais;	
	}

}

	
}
