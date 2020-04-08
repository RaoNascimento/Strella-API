package br.com.AgendaAutonoma.agendaAutonomo.service;

import java.util.List;

import br.com.AgendaAutonoma.agendaAutonomo.controller.form.UsuarioForm;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.Usuario;

public interface UsuarioService {

	List<Usuario> listarUsuario(String nome);

	Usuario salvarUsuario(UsuarioForm form);

}
