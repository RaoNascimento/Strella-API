package br.com.AgendaAutonoma.agendaAutonomo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.AgendaAutonoma.agendaAutonomo.controller.form.AtualizaProfissionaisForm;
import br.com.AgendaAutonoma.agendaAutonomo.controller.form.ProfissionaisForm;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.Profissional;
import br.com.AgendaAutonoma.agendaAutonomo.repository.ProfissionalRepository;
import br.com.AgendaAutonoma.agendaAutonomo.repository.UsuarioRepository;
import br.com.AgendaAutonoma.agendaAutonomo.service.ProfissionalService;

@Service
public class ProfissionalServiceImpl implements ProfissionalService {
	@Autowired
	ProfissionalRepository profissionalRepository;

	@Autowired
	UsuarioRepository usuarioRepository;
	Profissional profissional;
	
	public Profissional salvarProfissional(ProfissionaisForm form) {
		
		profissional.setNome(form.getNome());
		profissional.setEmail(form.getEmail());
		profissional.setCargo(form.getCargo());
		profissional.setNumeroConselho(form.getNumeroConselho());
		profissional.setTelefone(form.getTelefone());
		profissional.setNomeComercial(form.getNomeComercial());
		// profissional.setUsuario(form.getUsuario());
		profissional = profissionalRepository.save(profissional);
		
		return profissional;
	}
	
	public Profissional atualizarProfissional(Long id,  AtualizaProfissionaisForm form) {
				
			profissional = profissionalRepository.getOne(id);
			profissional.setNome(form.getNome());
			profissional.setCargo(form.getCargo());
			profissional.setEmail(form.getEmail());
			profissional.setTelefone(form.getTelefone());
			profissional.setNomeComercial(form.getNomeComercial());
			profissional.setNumeroConselho(form.getNumeroConselho());
			//profissional.setUsuario(this.usuario);
					
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
