package br.com.AgendaAutonoma.agendaAutonomo.serviceImpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.AgendaAutonoma.agendaAutonomo.controller.form.UsuarioForm;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.Usuario;
import br.com.AgendaAutonoma.agendaAutonomo.repository.UsuarioRepository;
import br.com.AgendaAutonoma.agendaAutonomo.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	Usuario usuario;

	@Override
	public List<Usuario> listarUsuario(String nome) {
					
			List<Usuario> usuarios = usuarioRepository.findByEmail(nome);
			return usuarios;
	}

	@Override
	public Usuario salvarUsuario(UsuarioForm form) {
		
		ModelMapper mapper = new ModelMapper();
		usuario = mapper.map(form, Usuario.class);
		usuario = usuarioRepository.save(usuario);
		return usuario;
						
	}

}
