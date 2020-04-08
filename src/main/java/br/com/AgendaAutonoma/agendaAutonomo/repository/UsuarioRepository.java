package br.com.AgendaAutonoma.agendaAutonomo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	List<Usuario> findByEmail(String nome);


}
