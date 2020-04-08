package br.com.AgendaAutonoma.agendaAutonomo.controller;

import java.lang.reflect.Type;
import java.net.URI;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.UsuarioDto;
import br.com.AgendaAutonoma.agendaAutonomo.controller.form.UsuarioForm;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.Usuario;
import br.com.AgendaAutonoma.agendaAutonomo.repository.UsuarioRepository;
import br.com.AgendaAutonoma.agendaAutonomo.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	UsuarioService service;
	@Autowired
	UsuarioRepository usuarioRepository;
	
	static String msg = "Email já se encontra cadastrado na Strella";
	
	
	@GetMapping
	public List<UsuarioDto> lista(String nome) {
		
		List<Usuario> usuarios = service.listarUsuario(nome);
		 ModelMapper mapper = new ModelMapper();
		 Type usuariosType= new TypeToken<List<Usuario>>() {}.getType();
		 List<UsuarioDto> usuariosDto = mapper.map(usuarios,usuariosType);
		 return usuariosDto;
			
	}
	
	@PostMapping
	public ResponseEntity<Usuario> cadastrar(@RequestBody UsuarioForm  form, UriComponentsBuilder UriBuilder) {	
		
		 URI uri = null;
		 Usuario usuario = null;
		List<Usuario> usuarios = service.listarUsuario(form.getEmail());
		
		if(usuarios.isEmpty()) {
			 usuario = service.salvarUsuario(form);		
			 uri = UriBuilder.path("/usuarios/{id}").buildAndExpand(usuario.getId()).toUri();
				return (ResponseEntity.created(uri).body(usuario));	
		}
		usuarios.get(0).setEmail(msg);
		uri = UriBuilder.path("/usuarios/{id}").buildAndExpand(usuarios.get(0).getId()).toUri();
		return (ResponseEntity.created(uri).body(usuarios.get(0)));	
		 	
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> remover(@PathVariable Long id){
		usuarioRepository.deleteById(id);
		
		return ResponseEntity.ok().build();		
	}
	
	
	
}
