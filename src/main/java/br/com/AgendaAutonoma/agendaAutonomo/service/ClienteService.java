package br.com.AgendaAutonoma.agendaAutonomo.service;

import java.util.List;

import br.com.AgendaAutonoma.agendaAutonomo.controller.form.ClienteForm;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.Cliente;

public interface ClienteService {

	List<Cliente> listarCliente(String nome);

	Cliente salvarCliente(ClienteForm form);

}
